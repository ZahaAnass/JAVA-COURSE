public class Main {

    public static void main(String[] args) {

        // Aggregation = Represents a "has-a" relationship between objects.
        //               One object contains another object as part of its structure,
        //               but the contained object/s can exist independently.

        Book book1 = new Book("Harry Potter", 423);
        Book book2 = new Book("Lord of the Rings", 352);
        Book book3 = new Book("The Hobbit", 295);

        Book[] books = {book1, book2, book3};

        Library library = new Library("City Library", 1995, books);

        for(Book book : books) {
            System.out.println(book.displayInfo());
        }

        library.displayInfo();

    }

}