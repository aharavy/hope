public class Book {
    String name;
    String type;
    String author;



    public void Book(){
        System.out.println("no information about the book");
    }

    public Book(String name, String type, String author){
        this.name=name;
        this.type=type;
        this.author=author;
        System.out.println("You have taken the book: ");
        System.out.println("Name: "+ "\""+name + "\"");
        System.out.println("Author:"+ "\"" +author+ "\"");
        System.out.println("Type: "+"\""+type+"\"" + "\n P.S. You have two month for reading the book. Then you must return it");
    }
}
