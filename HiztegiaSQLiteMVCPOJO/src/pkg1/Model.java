package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Model {

    private final String DB = "db/Hiztegia.db";

    public Connection konektatu() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:" + DB;
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            //  System.out.println("Connection to SQLite has been established.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;

    }

    public void terminoakInprimatu() {
        String taula = "Terminoak";
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = konektatu(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            //Txostenaren izenburua
            String izenburua = DB + " datu-baseko " + taula + " taulako datuak:";
            System.out.println(izenburua);
            for (int i = 0; i < izenburua.length(); i++) {
                System.out.print("=");
            }
            System.out.println("");

            int kont = 0;
            while (rs.next()) {
                Terminoa t = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                System.out.println(t);
                kont++;
            }
            for (int i = 0; i < izenburua.length(); i++) {
                System.out.print("-");
            }
            System.out.println("");
            System.out.println("GUZTIRA: " + kont + " termino");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

//    public static ArrayList<Terminoa> tBilatu(String hitza) {
//        String taula = "Terminoak";
//        String sql = "SELECT * FROM " + taula + " WHERE euskaraz= ? OR gazteleraz = ?";
//
//        ArrayList<Terminoa> alt = new ArrayList<>();
//        try ( Connection conn = connect();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
//
//        } catch (Exception ex) {
//
//        }
//        return alt;
//    }
//    public static int tGehitu(Terminoa t) {
//
//        String sql = "INSERT INTO Terminoak(id,euskaraz,gazteleraz) VALUES(?,?,?)";
//
//        try ( Connection conn = konektatu();  PreparedStatement pstmt = conn.prepareStatement(sql)) {
//            pstmt.setInt(1, t.getId());
//            pstmt.setString(2, t.getEuskaraz());
//            pstmt.setString(3, t.getGazteleraz());
//            return pstmt.executeUpdate();
//
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//            return 0;
//        }
//
//    }
    public void terminoakInprimatuObjektuGabe() {
        String taula = "Terminoak";
        String sql = "SELECT * FROM " + taula;

        try (Connection conn = konektatu(); Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            //Txostenaren izenburua
            String izenburua = DB + " datu-baseko " + taula + " taulako datuak:";
            System.out.println(izenburua);
            for (int i = 0; i < izenburua.length(); i++) {
                System.out.print("=");
            }
            System.out.println("");

            int kont = 0;
            while (rs.next()) {
                System.out.printf("%3d  %-30s%-30s\n", rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                kont++;
            }
            for (int i = 0; i < izenburua.length(); i++) {
                System.out.print("-");
            }
            System.out.println("");
            System.out.println("GUZTIRA: " + kont + " termino");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void itzulpenaInprimatu(String euskarazkoa) {
        String taula = "Terminoak";
        String sql = "SELECT * FROM " + taula + " WHERE euskaraz= ?";

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, euskarazkoa);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                Terminoa t = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                System.out.println(t);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    public int terminoaGehitu(Terminoa t) {

        if (t.getEuskaraz().equals("") || t.getGazteleraz().equals("")) {
            System.out.println("Termino bat hutsik dago!");
            return -1;
        } else {

            String sql2 = "SELECT euskaraz, gazteleraz FROM Terminoak where euskaraz = ? and gazteleraz = ?";

            try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql2)) {
                pstmt.setString(1, t.getEuskaraz().toLowerCase());
                pstmt.setString(2, t.getGazteleraz().toLowerCase());
                ResultSet rs = pstmt.executeQuery();
                int txertatu = 0;
                while (rs.next()) {
                    txertatu++;
                }
                if (txertatu > 0) {
                    System.out.println("Sartutako terminoa existitzen da.");
                    return 0;
                }

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return -1;
            }

            String sql1 = "INSERT INTO Terminoak(euskaraz,gazteleraz) VALUES(?,?)";
            try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql1)) {
                pstmt.setString(1, t.getEuskaraz().toLowerCase());
                pstmt.setString(2, t.getGazteleraz().toLowerCase());
                System.out.println("Gehitu da terminoa.");
                return pstmt.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e.getMessage());
                return -2;
            }
        }
    }

    public int terminoaGehituObjektuGabe(int id, String euskaraz, String gazteleraz) {

        String sql = "INSERT INTO Terminoak(euskaraz,gazteleraz) VALUES(?,?)";

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, euskaraz);
            pstmt.setString(2, gazteleraz);
            return pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    public int terminoaEzabatu(int id) {

        String sql = "DELETE FROM Terminoak WHERE id = ?";

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            return pstmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            return 0;
        }

    }

    /**
     * Kontuz: lechuga');DELETE FROM Terminoak;--
     */
    public void metodoBat(String eu, String es) {

//        Scanner in = new Scanner(System.in);
//        System.out.print("Termino berria: ");
//        String strEu = in.nextLine();
//        String strEs = terminoa.split(" ");
        //String sql = "SELECT id,euskaraz,gazteleraz FROM Terminoak WHERE euskaraz = '"+ strEuskaraz+"'" ;
//        String sql = "INSERT INTO Terminoak(euskaraz,gazteleraz) VALUES('" + eu + "','" + es + "')";
//
//        try ( Connection conn = konektatu();  Statement stmt = conn.createStatement()) {
//            int n = stmt.executeUpdate(sql);
//
//            //     System.out.println(strEuskaraz +" => " +rs.getString("gazteleraz"));
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
    }

    public ArrayList<Terminoa> terminoakArrayListera() {
        ArrayList<Terminoa> terminoenArrayLista = new ArrayList<Terminoa>();

        String sql2 = "SELECT * FROM Terminoak";

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql2)) {
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                Terminoa t = new Terminoa(rs.getInt("id"), rs.getString("euskaraz"), rs.getString("gazteleraz"));
                terminoenArrayLista.add(t);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return terminoenArrayLista;
    }

    public ArrayList<Terminoa> hitzakAukeratu() {
        //Aurreko metodoa erabili terminoen ArrayLista lortzeko
        ArrayList<Terminoa> terminoenArrayLista = terminoakArrayListera();

        // jokoarentzako 3 termino behar ditut, orduan 3 termino aukeratuko ditut ausaz
        Collections.shuffle(terminoenArrayLista); // Array list-eko datuak nahastu, hemen aurkitu dut informazioa --> https://mkyong.com/java/java-how-to-shuffle-an-arraylist/

        ArrayList<Terminoa> jokoarentzakoTerminoak = new ArrayList<Terminoa>(); //Arraylist berri bat sortu eta terminoen listako 3 Termino gehitu
        jokoarentzakoTerminoak.add(terminoenArrayLista.get(0));
        jokoarentzakoTerminoak.add(terminoenArrayLista.get(1));
        jokoarentzakoTerminoak.add(terminoenArrayLista.get(2));

        return jokoarentzakoTerminoak;
    }

    public int erantzunZuzena() {//Ausazko zenbaki bat bueltatzen du. 0-tik 2-ra.
        ArrayList<Integer> zenbakiak = new ArrayList<Integer>();
        zenbakiak.add(0);
        zenbakiak.add(1);
        zenbakiak.add(2);

        Collections.shuffle(zenbakiak); //Lista nahastu

        return zenbakiak.get(0);
    }

    public String hitzaGazteleraz(ArrayList<Terminoa> terminoak, int zenbakia) {
        String hitza = "";
        String sql = "SELECT gazteleraz FROM Terminoak where id = ?";

        int id = (terminoak.get(zenbakia)).getId();

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            hitza = rs.getString("gazteleraz");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return hitza;
    }

    public String hitzaEuskaraz(ArrayList<Terminoa> terminoak, int zenbakia) {
        String hitza = "";
        String sql = "SELECT euskaraz FROM Terminoak where id = ?";

        int id = (terminoak.get(zenbakia)).getId();

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            hitza = rs.getString("euskaraz");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return hitza;
    }

    public boolean konprobatu(ArrayList<Terminoa> terminoak, int zenbakia, String erantzuna) {
        boolean asmatu = false;
        String hitza;
        String sql = "SELECT euskaraz FROM Terminoak where id = ?";

        int id = (terminoak.get(zenbakia)).getId();

        try (Connection conn = konektatu(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            hitza = rs.getString("euskaraz");
            if (hitza.equals(erantzuna)) {
                asmatu = true;
                System.out.println("Asmatu egin duzu hitza!");
                System.out.println(hitza + "|" + erantzuna);
            } else {
                System.out.println("Ez duzu asmatu hitza!");
                System.out.println(hitza + "|" + erantzuna);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return asmatu;
    }

}
