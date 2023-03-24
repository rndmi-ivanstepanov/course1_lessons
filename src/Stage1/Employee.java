package Stage1;
public class Employee {
    private String fullName;
    private int branch;
    private int salary;
    private int id;
    private static int count = 0;

    public Employee(String fullName, int branch, int salary) {
        this.fullName = fullName;
        this.branch = branch;
        this.salary = salary;
        count++;
        this.id = count;
    }

    @Override
    public String toString() {
        return id + ". " + fullName + ", " + branch + ", " + salary;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public int getBranch() {
        return branch;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static void setCount(int num) {
        count = num;
    }

    public static int getCount() {
        return count;
    }
}
