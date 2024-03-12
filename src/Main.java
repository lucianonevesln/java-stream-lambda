
import Entities.Employees;
import Reports.ReportListOfEmployees;
import Utils.SalaryIncrease;
import Utils.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        Utils.messageAboutTheSizeOfTheList();
        Integer countSizeOfTheList = read.nextInt();
        List<Employees> employeesList = new ArrayList<>();

        for (int indexOfEmploye = 0 ; indexOfEmploye < countSizeOfTheList ; indexOfEmploye++) {

            Utils.employeeIndexMessage(indexOfEmploye+1);
            Utils.employeeIdMessage();
            Integer id = read.nextInt();
            read.nextLine();
            Utils.employeeNameMessage();
            String name = read.nextLine();
            Utils.employeeSalaryMessage();
            Double salary = read.nextDouble();

            if (employeesList.isEmpty()) {

                employeesList.add(new Employees(id, name, salary));

            } else if (Utils.returnEmployeOrNull(employeesList, id) == null) {

                employeesList.add(new Employees(id, name, salary));

            } else {

                indexOfEmploye--;
                System.out.println("Id já cadastrado!");

            }

        }

        Utils.messageEnterTheSalaryIncrease();
        Integer idIncreaseSalary = read.nextInt();
        Utils.messageEnterThePercentage();
        Double percentageIncreaseSalary = read.nextDouble();
        Employees employee = null;

        while (Utils.returnEmployeOrNull(employeesList, idIncreaseSalary) == null) {

            Utils.messageEnterTheSalaryIncrease();
            idIncreaseSalary = read.nextInt();
            Utils.messageEnterThePercentage();
            percentageIncreaseSalary = read.nextDouble();
            employee = Utils.returnEmployeOrNull(employeesList, idIncreaseSalary);

        }

        employeesList
                .get(employeesList.indexOf(employee))
                .setSalary(SalaryIncrease
                        .calculateSalaryIncrease(percentageIncreaseSalary, employee));

        ReportListOfEmployees
                .reportListOfEmployees(employeesList);

        read.close();

    }

}
