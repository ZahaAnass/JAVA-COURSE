public class Library {

    String name;
    int year;
    Book[] books;

    Library(String name, int year, Book[] books) {
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo() {
        System.out.println(name + " - Established: " + year + " - Number of books: " + books.length);
        System.out.println("-------------------------");
        for(Book book : books) {
            System.out.println(book.displayInfo());
        }
    }

}
