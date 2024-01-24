public class Book {
    private String nameBook;
    private Author author;
    private int ageCreateBook;

    public Book(Author author, String nameBook, int ageCreateBook) {
        this.author = author;
        this.nameBook = nameBook;
        this.ageCreateBook = ageCreateBook;

    }
    public  String getNameBook() {
        return this.nameBook;
    }
    public  Author getAuthorBook() {
        return this.author;
    }
    public  int getAgeCreateBook() {
        return this.ageCreateBook;
    }
    public void setAgeCreateBook(int ageCreateBook) {
        this.ageCreateBook = ageCreateBook;
    }
}
