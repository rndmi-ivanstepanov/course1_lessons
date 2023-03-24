package Stage1;

public class Main {
    public static void main(String[] args) {
        EmployeeBook list = new EmployeeBook();
        list.addNewEmployee("Markelov Georgiy Nikitich", 5, 91_000);
        list.addNewEmployee("Andreev Nikolay Dmitrievich", 1, 72_000);
        list.addNewEmployee("Zemelniy Artem Nikolaevich", 3, 28_850);
        list.fireEmployee(2);
        list.addNewEmployee("Timofeev Aleksey Vladimirovich", 2, 32_043);
        list.addNewEmployee("Alexandrov Mikhail Ivanovich", 4, 65_312);
        list.addNewEmployee("Nikolaev Viktor Antonovich", 1, 63_250);
        list.addNewEmployee("Nekrasova Elena Igorevna", 3, 39_321);
        list.fireEmployee(5);
        list.fireEmployee(1);
        list.fireEmployee(8);
        list.fireEmployee(2);
        list.fireEmployee(3);
        list.addNewEmployee("Nedostupniy Vladislav Evgenievich", 1, 51_312);
        list.addNewEmployee("Nedostupniy Vladislav Evgenievich", 1, 51_312);
        list.addNewEmployee("Nedostupniy Vladislav Evgenievich", 1, 51_312);
        list.addNewEmployee("Mikhailov Sergey Igorevich", 5, 61_312);
        list.addNewEmployee("Alekseeva Inna Borisovna", 3, 51_133);
        list.changeData("Nikolaev Viktor Antonovich", 51);
        /*
        list.printBranches();
        list.indexSalaries(10);
        list.fireEmployee(10);
        System.out.println(list);
        list.getMinSalaryInBranch(3);
        list.findLesserSalary(50000);
        System.out.println(list);
        list.printFullNames();
        list.getSalaryExpenses();
        list.getSalaryExpensesForBranch(1);
        list.getMinSalary();
        list.getMaxSalary();
        list.getAverageSalary();
        list.getAverageSalaryInBranch(1);
        list.printFullNames();
        list.printEmployeesFromBranch(1);
        list.findHigherSalary(1000000);
        list.findLesserSalary(50);
        */
    }
}
