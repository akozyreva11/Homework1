import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return ageCreateBook == book.ageCreateBook && Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, ageCreateBook);
    }

    @Override
    public String toString() {
        return " '"+ this.nameBook +"' " + this.ageCreateBook;
    }

}