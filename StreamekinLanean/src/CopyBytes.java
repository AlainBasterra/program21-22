
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {

    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;
        int kont = 0;
        try {
            in = new FileInputStream("probak/IrudiOriginala.PNG");
            out = new FileOutputStream("probak/IrudiKopia.PNG");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
                kont++;
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println(kont);
    }
}
