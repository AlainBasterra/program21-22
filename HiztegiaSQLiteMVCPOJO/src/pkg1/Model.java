package pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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



    public Terminoa[] terminoakArrayra() {
        return null;
//        Terminoa[] terminoenArraya;
//        
//            String sql2 = "SELECT COUNT(*) FROM Terminoak";
//        
//                   
//            try ( Connection conn = konektatu();  PreparedStatement pstmt = conn.prepareStatement(sql2)) {
//                ResultSet rs    = pstmt.executeQuery();
//                Terminoa t = new Terminoa();
//                
//                while(rs.next()){
//                    t = new Terminoa(rs.getInt("id"),rs.getString("euskaraz"),rs.getString("gazteleraz"));
//                    terminoenArraya.add(t);
//                }
//            } catch (SQLException e) {
//                System.out.println(e.getMessage());
//            }
//        
//        
//        return terminoenArraya;

    }
}
