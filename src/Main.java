
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " +lastName;
        System.out.println ("Ф. И. О. сотрудника — " + fullName );


        System.out.println("Задача 2");
        String fullNameTrue = fullName.toUpperCase();//мне показалось так быстрее , через replace все мои способы были какие-то замороченные
        System.out.println ("Ф. И. О. сотрудника — " + fullNameTrue );


        System.out.println("Задача 3");

        String fullName2 = "Иванов Семён Семёнович";
        String fullNameTrue2 = fullName2.replace("ё","е");
        System.out.println ("Ф. И. О. сотрудника — " + fullNameTrue2 );




    }


}
