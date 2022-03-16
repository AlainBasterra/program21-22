import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("IrudiOriginala.PNG");
            out = new FileOutputStream("IrudiKopia.PNG");
            int c;
            int kont = 0;
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
    }
}