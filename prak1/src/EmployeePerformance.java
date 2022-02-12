/**
 * EmployeePerformance.java
 * Kelas ini digunakan untuk memodelkan detail performa dari karyawan
 * author 182220097 Muhamad Fikri Nurohman
 */

public class EmployeePerformance {
    public Employee employee;
    private double currentPoints;
    private double targetPoints;

    /**
     * Konstruktor
     * Employee employee
     * double currentPoints
     * double targetPoints
     */
    public EmployeePerformance(Employee employee, double currentPoints, double targetPoints) {
        this.employee = employee;
        this.currentPoints = currentPoints;
        this.targetPoints = targetPoints;
    }

    /**
     * Apakah bisa dipromosi jabatan
     * promosi jabatan bisa dilakukan jika currentPoints >= 2 * targetPoints
     * return true jika bisa, false jika tidak
     */
    public boolean isPromotable() {
        if (this.currentPoints >= 2*this.targetPoints) {
            return true;
        } else {return false;}
    }

    /**
     * Hitung desimal persentase bonus dengan perhitungan berikut:
     * formula: (currentPoints - targetPoints) / targetPoints
     * 
     * batasan: 0 (0%) <= desimal persentase bonus <= 1.0 (100%)
     * apabila hasil perhitungan desimal persentase bonus berada diluar batasan, 
     * nilai diubah menjadi nilai terdekat yang terdefinisi. 
     * 
     * return desimal persentase bonus
     */
    public double getSalaryBonusPercentage() {
        double desimal = (this.currentPoints - this.targetPoints) / this.targetPoints;
        if (desimal >= 0 && desimal <= 1){
            return desimal;
        } else if (desimal < 0){
            return 0;
        } else {return 1;}
    }

    /**
     * Hitung total salary saat ini dengan ditambah persen dari bonus (getSalaryBonusPercentage)
     * misal baseSalary $1000, dengan bonus 50% (desimal 0.5) akan menjadi $1500
     * return total salary saat ini
     */
    public double getCurrentSalary() {
        return (this.employee.getBaseSalary() + (getSalaryBonusPercentage() * this.employee.getBaseSalary()));
    }
}