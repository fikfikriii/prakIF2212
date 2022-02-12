/**
 * Main.java
 * Main.java ini digunakana sebagai program utama dari kelas-kelas yang telah dibuat sebelumnya, yaitu Employee dan EmployeePerformance
 * author 18220097 Muhamad Fikri Nurohman
 */
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double baseSalary = scanner.nextDouble();
        double currentPoints = scanner.nextDouble();
        double targetPoints = scanner.nextDouble();

        Employee employee1 = new Employee(name, baseSalary);
        EmployeePerformance ep1 = new EmployeePerformance(employee1, currentPoints, targetPoints);
        if (ep1.isPromotable()){
            System.out.printf("YES\n");
            System.out.printf("%.2f\n", ep1.getCurrentSalary());
        } else {
            System.out.printf("NO\n");
            System.out.printf("%.2f\n", 2 * targetPoints - currentPoints);
        }

        scanner.close();
    }
}