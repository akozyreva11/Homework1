import java.util.Objects;

public class Author {

    private String author;

    public Author(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return this.author = author;
    }
    @Override
    public String toString() {
        return this.author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author1 = (Author) o;
        return Objects.equals(author, author1.author);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(author);
    }
}
