
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FindAndReplace {

    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        int kont = 0;
        try {
            inputStream = new FileReader("probak/xanadu.txt");
            outputStream = new FileWriter("probak/characteroutput.txt");

            int c;  
            while ((c = inputStream.read()) != -1) {
                if (c == 97) {
                    outputStream.write(95);
                } else {
                    outputStream.write(c);
                }
                kont++;

            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
        System.out.println(kont);
    }
}
