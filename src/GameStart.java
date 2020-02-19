import java.util.Scanner;

public class GameStart {

    public static void main(String[] args) {
        String name;
        String type;
        String author;

        Library lib = new Library();
        Scanner sc = new Scanner(System.in);

        System.out.println("would you like to take a book? Please tell me: name, type and author");
        name=sc.nextLine();
        type=sc.nextLine();
        author=sc.nextLine();

        lib.getMeBook(name,type,author);
    }
}
