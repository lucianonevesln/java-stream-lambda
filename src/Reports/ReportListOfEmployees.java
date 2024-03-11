package Reports;

import Entities.Employees;

import java.util.List;

public class ReportListOfEmployees {
    public static void reportListOfEmployees(List<Employees> employeesList) {
        System.out.println("\nList of Employees:");
        for (Employees employee : employeesList) {
            System.out.println(
                    employee.getId()
                            + ", "
                            + employee.getName()
                            + ", "
                            + employee.getSalary()
            );
        }
    }
}
