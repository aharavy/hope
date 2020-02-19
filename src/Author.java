public class Author {
    String fullName;
    int age;
    String comeFrom;

    public void Author(String fullName, int age, String comeFrom){
        this.fullName=fullName;
        this.age=age;
        this.comeFrom=comeFrom;
        System.out.println(fullName);
        System.out.println(comeFrom);
        System.out.println(age);
    }

    public void Author(){
        System.out.println("Unknown author");
    }

}
