package Utils;

import Entities.Employees;

import java.util.List;

public class Utils {
    public static void messageAboutTheSizeOfTheList() {
        System.out.print("How many employees will be registered? ");
    }

    public static void employeeIndexMessage(int index) {
        System.out.println("\nEmplyoee #" + index + ":");
    }

    public static void employeeIdMessage() {
        System.out.print("Id: ");
    }

    public static void employeeNameMessage() {
        System.out.print("Name: ");
    }

    public static void employeeSalaryMessage() {
        System.out.print("Salary: ");
    }

    public static void messageEnterTheSalaryIncrease() {
        System.out.print("\nEnter the employee id that will have salary increase: ");
    }

    public static void messageEnterThePercentage() {
        System.out.print("Enter the percentage: ");
    }

    public static Employees returnEmployeOrNull(List<Employees> employeesList, Integer idIncreaseSalary) {
        return employeesList.stream().filter(elementOfEmployeesList -> elementOfEmployeesList
                .getId()
                .equals(idIncreaseSalary)).findFirst().orElse(null);
    }
}
