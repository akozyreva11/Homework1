public class Main {

    public static Employee[] employee = new Employee[10];

    public static void main(String[] args) {
        employee[0] = (new Employee("Иванов Петр Петрович", 1, 2));
        employee[1] = (new Employee("Cидоров Вольф Ветрович", 2, 800));
        employee[2] = (new Employee("Иванова Тестовая Женщина", 3, 100));
        employee[3] = (new Employee("Карлондий Карл Витальевич", 4, 300));
        employee[4] = (new Employee("Тестовый Иван Петрович", 5, 600));
        employee[5] = (new Employee("Ивашкина Арнольда Дроздовна", 1, 200));
        employee[6] = (new Employee("Осипова Петруля Петровна", 2, 900));
        employee[7] = (new Employee("Козырева Козырела Козыревна", 3, 8900));
        employee[8] = (new Employee("Осипова Ирина Семёновна", 4, 7800));
        employee[9] = (new Employee("Кохинкина Петруня Сергеевна", 5, 56000));
        employee[0].setDepartment(4);
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
        for (int i = 0; i < employee.length; i++) {
            Employee.id++;
            System.out.println(Employee.id + " " + employee[i]);
        }
    }

    public static void printStars() {
        System.out.println("*****************************");
        System.out.println("*****************************");
    }

    // список Ф. И. О. всех сотрудников.
    public static void printFio() {
        for (int i = 0; i < employee.length - 1; i++) {

            Employee employee1 = employee[i];
            System.out.println(employee1.getFioName());
        }
    }

    // поиск сотрудника с минимальной зарплатой.
    public static void printMinSallary() {
        int min1 = employee[0].getSallary();
        ;
        for (int i = 0; i < employee.length - 1; i++) {
            Employee employee1 = employee[i];
            if (min1 > employee1.getSallary()) {
                min1 = employee1.getSallary();
            }
        }
        System.out.println(min1);

    }
        // поиск сотрудника с максимальной зарплатой.

    public static void printMaxSallary() {
        int max = 0;
        for (int i=0; i < employee.length ; i++) {
            Employee employee1 = employee[i];
          int max1 = employee1.getSallary();
            if (max1 > max) {
                max = max1;
            }
        }
        System.out.println(max);
    }

   //    подсчет среднего значения зарплат.
    public static void printAverageSallary() {
        int average = 0;
        int averageSum=0;
        int sum=0;
        for (int i=0; i < employee.length; i++) {
            Employee employee1 = employee[i];
           int average1 = employee1.getSallary();
            sum=average+average1;
            average=sum;
        }
        averageSum=sum/employee.length;
        System.out.println(averageSum);

    }

    }
