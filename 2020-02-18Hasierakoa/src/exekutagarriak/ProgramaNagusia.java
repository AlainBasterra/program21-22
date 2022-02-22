package exekutagarriak;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import model.Author;
import model.Book;

public class ProgramaNagusia {

    private static Author[] idazleak = new Author[100];
    private static ArrayList<Book> liburutegia = new ArrayList<>();

    public static void initialize() {
        idazleak[0] = new Author ("J.K.Rowling", 'f');
        idazleak[1] = new Author ("Agatha Christie", 'f');
        idazleak[2] = new Author ("Francisco Ibañez", 'm');
        idazleak[3] = new Author ("Margaret Atwood", 'f');
        idazleak[4] = new Author ("Marjane Satrapi", 'f');
        idazleak[5] = new Author ("Mariasun Landa", 'f');
        idazleak[6] = new Author ("Harper Lee", 'm');
        idazleak[7] = new Author ("Mary Shelley", 'f');        
    }
    
    public static void jaiotzeDataBete(){
     
    }

    public static void inprimatu(){
        System.out.println("LIBURUTEGIA");
        System.out.println("===============================");
        for (Book b:liburutegia){
            System.out.println(b);
        }
    }
    public static void main(String[] args) {

        initialize();
        jaiotzeDataBete();
        inprimatu();
       
    }

}
