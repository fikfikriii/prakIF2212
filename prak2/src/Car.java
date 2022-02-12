/**
 * Car.java
 * Kelas ini digunakan untuk memodelkan mobil yang dijual di perusahaan Tasle
 * @author 18220097 Muhamad Fikri Nurohman
 */

public abstract class Car {
    private int numberOfWheels;
    private long mileage;
    
    public Car(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
        // Konstruktor, set mileage = 0
    }
    
    public int getNumberOfWheels() {
        return this.numberOfWheels;
        // Mengembalikan atribut numberOfWheels 
    }
  
    public long getMileage() {
        return this.mileage;
        // Mengembalikan atribut mileage
    }
    
    public void increaseMileage(long increment) {
        this.mileage += increment;
        // Meningkatkan nilai atribut mileage
    }
  
    public String toString() {
        return ("Number of Wheels: " + String.valueOf(this.numberOfWheels) + ", Mileage: " + String.valueOf(this.mileage));
        // Mengembalikan informasi mobil dengan format: "Number of Wheels: {numberOfWheels}, Mileage: {mileage}"
    }
  
    public abstract long getPrice();
}
  