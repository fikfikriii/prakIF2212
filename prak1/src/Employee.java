/**
 * Employee.java
 * Class ini digunakan untuk memodelkan karyawan
 * author 18220097 Muhamad Fikri Nurohman
 */

public class Employee {
    private static int employeeCount;
    private String name;
    private double baseSalary;

    /**
     * Konstruktor
     * String name
     * double baseSalary
     */
    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        employeeCount++;
    }

    /**
     * Menambahkan gaji pegawai
     * param amount jumlah peningkatan, asumsi amount >= 0
     */
    public void increaseSalary(double amount) {
        this.baseSalary += amount;
    }

    /**
     * Getter name
     * return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter baseSalary
     * return baseSalary
     */
    public double getBaseSalary() {
        return this.baseSalary;
    }

    /**
     * return jumlah karyawan
     */
    public static int getEmployeeCount() {
        return employeeCount;
    }
}