import java.util.Objects;

public class Employee {

    public static int id = 0;
    private String fioName;
    private int sallary;
    private int department;


    public Employee(String fioName, int department, int sallary) {
        this.fioName = fioName;
        this.department = department;
        this.sallary = sallary;
    }


    public int getSallary() {
        return sallary;
    }

    public String getFioName() {
        return fioName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }
    @Override
    public String toString() {
        return fioName + "  " +  "  " +
                sallary + "  " +  "  " +
                department;
    }
    // не знаю надо было или нет , но добавила equals/hashCode увидела у тебя в комменте ,что ты их перечислили вместе с toString
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return sallary == employee.sallary && department == employee.department && Objects.equals(fioName, employee.fioName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fioName, sallary, department);
    }
}
