public class Main {
    public static int id = 0;
    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = (new Employee("Иванов Петр Петрович", 1, 0));
        employee[1] = (new Employee("Cидоров Вольф Ветрович", 2, 800));
        employee[2] = (new Employee("Иванова Тестовая Женщина", 3, 100));
        employee[3] = (new Employee("Карлондий Карл Витальевич", 4, 300));
        employee[4] = (new Employee("Тестовый Иван Петрович", 5, 600));
        employee[5] = (new Employee("Ивашкина Арнольда Дроздовна", 1, 200));
        employee[6] = (new Employee("Осипова Петруля Петровна", 2, 900));
        employee[7] = (new Employee("Козырева Козырела Козыревна", 3, 8900));
        employee[8] = (new Employee("Осипова Ирина Семёновна", 4, 7800));
        employee[9] = (new Employee("Кохинкина Петруня Сергеевна", 5, 56000));
        employee[0].setDepartment(1);
        employee[0].setSallary(9000);

        printAll();
        printStars();
        printFio();
        printStars();
        printMinSallary();
        printStars();
        printMaxSallary();
        printStars();
        printAverageSallary();

    }

    // список всех сотрудников со всеми данными,
    public static void printAll() {
        for (; id < employee.length-2; id++) {
            System.out.println(id + " " + employee[id]);
        }
        id=0;
    }

    public static void printStars() {
        System.out.println("*****************************");
        System.out.println("*****************************");
    }

    // список Ф. И. О. всех сотрудников.
    public static void printFio() {
        for (; id < employee.length - 1; id++) {

                Employee employee1 = employee[id];
                System.out.println(employee1.getFioName());
        }
        id=0;
            }

    // поиск сотрудника с минимальной зарплатой.
    public static void printMinSallary() {
        int min = 1000000;
        for (; id < employee.length - 1; id++) {
            Employee employee1 = employee[id];
            int min1 = employee1.getSallary();
            if (min1 < min) {
                min = min1;
            }
        }

        System.out.println(min);
        id=0;
    }
    // поиск сотрудника с максимальной зарплатой.

    public static void printMaxSallary() {
        int max = 0;
        for (; id < employee.length ; id++) {
            Employee employee1 = employee[id];

            int max1 = employee1.getSallary();
            if (max1 > max) {
                max = max1;
            }
        }
        System.out.println(max);
        id=0;
    }

    //    подсчет среднего значения зарплат.
    public static void printAverageSallary() {
        int average = 0;
        int averageSum=0;
        for (; id < employee.length; id++) {
            Employee employee1 = employee[id];
            int average1 = employee1.getSallary();
            int sum=average+average1;
            average=sum;
            averageSum=sum/employee.length;
        }
        System.out.println(averageSum);
        id=0;
    }

}
