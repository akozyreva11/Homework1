public class Employee {

    private String fioName;

    public int getId() {
        return id;
    }

    int id=Main.id;


    private int sallary;

    private int department;


    @Override
    public String toString() {
        return fioName + "  " +  "  " +
                sallary + "  " +  "  " +
                department;
    }

    public Employee(String fioName, int department, int sallary) {
        this.id =getId();
        this.fioName = fioName;
        this.department = department;
        this.sallary = sallary;
    }

    public int getSallary() {
        return sallary;
    }

    public int getDepartment() {
        return department;
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

}
