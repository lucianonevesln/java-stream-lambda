package Utils;

import Entities.Employees;

public class SalaryIncrease {
    public static Double calculateSalaryIncrease(Double percentage, Employees employee) {

        percentage = percentage / 100;
        return (1+percentage) * employee.getSalary();

    }

}
