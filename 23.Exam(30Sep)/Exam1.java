public class Exam1 {

    public static void main(String args[]) {
        Book book = new Book();
        Book title = new Book("Prince");
    }

}

class Book {
    Book() {
        System.out.println("Default Constructor");
    }

    Book(String c) {
        System.out.println("Title Name = " + c);
    }
}
