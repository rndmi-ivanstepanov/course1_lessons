package Stage1;
import java.util.Arrays;

public class EmployeeBook {
    private final Employee[] staffList;

    public EmployeeBook() {
        this.staffList = new Employee[10];
    }

    @Override
    public String toString() {
        System.out.println("Staff list:");

        for (Employee worker : staffList) {

            if (worker != null) {
                System.out.println(worker);
            }
        }
        return "";
    }

    public int getSalaryExpenses() {
        int sum = 0;

        for (Employee worker : staffList) {

            if (worker != null) {
                sum += worker.getSalary();
            }
        }
        System.out.println("Salary expenses for month: " + sum + " \n");
        return sum;
    }

    public int getMinSalary() {
        int minSalary = Integer.MAX_VALUE;
        String name = "";

        for (Employee worker : staffList) {

            if (worker != null && worker.getSalary() < minSalary) {
                minSalary = worker.getSalary();
                name = worker.getFullName();
            }
        }

        System.out.println(name + " has the smallest salary: " + minSalary + " \n");
        return minSalary;
    }

    public int getMaxSalary() {
        int maxSalary = Integer.MIN_VALUE;
        String name = "";

        for (Employee worker : staffList) {

            if (worker != null && worker.getSalary() > maxSalary) {
                maxSalary = worker.getSalary();
                name = worker.getFullName();
            }
        }
        System.out.println(name + " has the highest salary: " + maxSalary + " \n");
        return maxSalary;
    }

    public int getAverageSalary() {
        int average, sum = 0, count = 0;
        for (Employee worker : staffList) {

            if (worker != null) {
                sum += worker.getSalary();
                count++;
            }
        }
        average = sum / count;
        System.out.println("Average salary among employees: " + average + " \n");
        return average;
    }

    public void printFullNames() {
        System.out.println("The following list displays full names of all employees:");

        for (Employee worker : staffList) {

            if (worker != null) {
                System.out.println(worker.getFullName());
            }
        }
        System.out.println();
    }

    public void indexSalaries(int percent) {
        double index = (double) percent / 100;
        int indexedSalary;

        for (Employee worker : staffList) {

            if (worker != null) {
                indexedSalary = (int) Math.round(worker.getSalary() + (worker.getSalary() * index));
                worker.setSalary((indexedSalary));
            }
        }
    }

    public int getMinSalaryInBranch(int branch) {
        int minSalary = Integer.MAX_VALUE;
        String name = "";

        for (Employee worker : staffList) {

            if (worker != null && worker.getBranch() == branch && worker.getSalary() < minSalary) {
                minSalary = worker.getSalary();
                name = worker.getFullName();
            }
        }
        System.out.println("In the " + branch + " branch " + name + " has the smallest salary: " + minSalary + "\n");
        return minSalary;
    }

    public int getMaxSalaryInBranch(int branch) {
        int maxSalary = Integer.MIN_VALUE;
        String name = "";

        for (Employee worker : staffList) {

            if (worker != null && worker.getBranch() == branch && worker.getSalary() > maxSalary) {
                maxSalary = worker.getSalary();
                name = worker.getFullName();
            }
        }
        System.out.println("In the " + branch + " branch " + name + " has the highest salary: " + maxSalary + "\n");
        return maxSalary;
    }

    public int getSalaryExpensesForBranch(int branch) {
        int sum = 0;

        for (Employee worker : staffList) {

            if (worker != null && worker.getBranch() == branch) {
                sum += worker.getSalary();
            }
        }
        System.out.println("Salary expenses for " + branch + " branch: " + sum + "\n");
        return sum;
    }

    public int getAverageSalaryInBranch(int branch) {
        int count = 0, sum = 0;

        for (Employee worker : staffList) {

            if (worker != null && worker.getBranch() == branch) {
                sum += worker.getSalary();
                count++;
            }
        }
        int averageSalary = sum / count;
        System.out.println("Average salary among employees from the " + branch + " branch: " + averageSalary + "\n");
        return averageSalary;
    }

    public void indexSalaryInBranch(int branch, int percent) {
        double index = (double) percent / 100;
        int indexedSalary;

        for (Employee worker : staffList) {

            if (worker != null && worker.getBranch() == branch) {
                indexedSalary = (int) Math.round(worker.getSalary() + (worker.getSalary() * index));
                worker.setSalary((indexedSalary));
            }
        }
    }

    public void printEmployeesFromBranch(int branch) {
        System.out.println(branch + " branch consists of these employees: ");

        for (Employee worker : staffList) {

            if (worker != null && worker.getBranch() == branch) {
                System.out.println((worker.getId() + ". " + worker.getFullName() + ", " + worker.getSalary()));
            }
        }
        System.out.println();
    }

    public void findLesserSalary(int num) {
        System.out.println("The list of employees with salary less than " + num + ":");
        int count = 0;

        for (Employee worker : staffList) {

            if (worker != null && worker.getSalary() < num) {
                System.out.println(worker);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("There is no such an employee with salary less than your input number");
        }

        System.out.println();
    }

    public void findHigherSalary(int num) {
        System.out.println("The list of employees with salary higher than " + num);
        int count = 0;

        for (Employee worker : staffList) {

            if (worker != null && worker.getSalary() >= num) {
                System.out.println(worker);
                count++;
            }
        }

        if (count == 0) {
            System.out.println("There is no such an employee with salary higher than your input number");
        }
        System.out.println();
    }


    public void addNewEmployee(String fullName, int branch, int salary) {
        Employee newcomer = new Employee(fullName, branch, salary);

        for (int i = 0; i < staffList.length; i++) {

            if (staffList[i] == null) {
                staffList[i] = newcomer;
                // System.out.println("New employee: " + staffList[i].getFullName() + " with Id: " + staffList[i].getId());
                break;
            }
        }
    }

    public void fireEmployee(String fullName) {

        for (int i = 0; i < staffList.length; i++) {

            if (staffList[i] != null && staffList[i].getFullName().equals(fullName)) {
                // System.out.println("Employee " + staffList[i].getFullName() + " is fired");
                staffList[i] = null;
            }
        }
    }

    public void fireEmployee(int id) {

        for (int i = 0; i < staffList.length; i++) {

            if (staffList[i] != null && staffList[i].getId() == id) {
                // System.out.println("Employee " + staffList[i].getFullName() + " is fired");
                staffList[i] = null;
            }
        }
    }

    public void changeData(String fullName, int num) {

        for (Employee worker : staffList) {

            if (worker != null) {

                if (worker.getFullName().equals(fullName) && num > 50) {             //assuming quantity of branches is less than 50
                    worker.setSalary(num);                                           //if input is higher that means they want to change salary
                } else if (worker.getFullName().equals(fullName)) {
                    worker.setBranch(num);
                }
            }
        }
    }

    public void printBranches() {
        System.out.println("The list of branches and employees in them: ");
        int[] branches = new int[staffList.length];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < staffList.length; i++) {

            if (staffList[i] != null) {
                branches[i] = staffList[i].getBranch();
            } else branches[i] = Integer.MAX_VALUE;
        }
        Arrays.sort(branches);
        int currentBranch = 0;
        int i = 0;

        while (branches[i] != Integer.MAX_VALUE) {

            if (currentBranch != branches[i]) {
                currentBranch = branches[i];
                builder.append(currentBranch + ": ");
            } else {
                i++;
                continue;
            }

            for (Employee worker : staffList) {

                if (worker != null && worker.getBranch() == currentBranch) {
                    builder.append(worker.getFullName() + ", ");
                }
            }
            builder.delete(builder.length() - 2, builder.length());
            System.out.println(builder + ".");
            builder.setLength(0);
            i++;
        }
        System.out.println();
    }
}
