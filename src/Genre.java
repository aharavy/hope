public class Genre {
    String genre;
    String description;

    public void Genre(){
        System.out.println("Unknown genre");
    }

    public void Genre(String genre, String description){
        this.genre=genre;
        this.description=description;
        System.out.println("Your genre is: ");
        System.out.println(genre);
        System.out.println("some text about the genre:");
        System.out.println(description);
    }

}
