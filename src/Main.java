public class Main {
    public static void main(String[] args) {
        Author tolstoy = new Author("Lev Tolstoy");
        Author tolstoyA = new Author("Aleksey Tolstoy");
        Book warAndPeace = new Book(tolstoy,"War and Peace", 1987);
        Book roadtoCalvary = new Book(tolstoyA,"The Road to Calvary", 1920);
        warAndPeace.setAgeCreateBook(1865);
        roadtoCalvary.setAgeCreateBook(1941);
        System.out.println(warAndPeace.getAuthorBook().getAuthor() + " '" + warAndPeace.getNameBook() + " '" + warAndPeace.getAgeCreateBook());
        System.out.println(roadtoCalvary.getAuthorBook().getAuthor() + " '" + roadtoCalvary.getNameBook() + " '" + roadtoCalvary.getAgeCreateBook());

    }
}