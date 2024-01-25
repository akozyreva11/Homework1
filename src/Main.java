public class Main {

    public static void main(String[] args) {

        Author tolstoy = new Author("Lev Tolstoy");

        Author tolstoyA = new Author("Aleksey Tolstoy");

        Book warAndPeace = new Book(tolstoy, "War and Peace", 1987);

        Book roadtoCalvary = new Book(tolstoyA, "The Road to Calvary", 1920);
        warAndPeace.setAgeCreateBook(1865);
        roadtoCalvary.setAgeCreateBook(1941);
        printStars();

        System.out.println(tolstoy.equals(tolstoyA));
        System.out.println(tolstoyA.equals(tolstoyA));
        printStars();

        System.out.println(tolstoy + " " + warAndPeace);
        System.out.println(tolstoyA + " " + roadtoCalvary);

        // Решила
        int code = tolstoy.hashCode();
        int code1 = tolstoyA.hashCode();

        if (code == code1) {
            System.out.println("Такой автор уже есть в базе данныхб удалите значение");
        }

    }

        public static void printStars () {
            System.out.println("*****************************");
            System.out.println("*****************************");
        }
}