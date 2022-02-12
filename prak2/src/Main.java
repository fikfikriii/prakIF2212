import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenis = scanner.nextInt();
        if(jenis == 1){
            int maxCapacity = scanner.nextInt();
            int jarakTempuh = scanner.nextInt();
            Bus bus1 = new Bus(maxCapacity);
            // bus1.increaseMileage(0);
            System.out.println(bus1.toString());
            System.out.println(bus1.getPrice());
            bus1.increaseMileage(jarakTempuh);
            System.out.println(bus1.toString());
            System.out.println(bus1.getPrice());
        } else if(jenis == 2){
            int numberOfWheels = scanner.nextInt();
            boolean loaded = scanner.nextBoolean();
            int jarakTempuh = scanner.nextInt();
            Truck truck1 = new Truck(numberOfWheels, loaded);
            truck1.increaseMileage(0);
            System.out.println(truck1.toString());
            System.out.println(truck1.getPrice());
            truck1.increaseMileage(jarakTempuh);
            System.out.println(truck1.toString());
            System.out.println(truck1.getPrice());
        } else{
            long basePrice = scanner.nextLong();
            int jarakTempuh = scanner.nextInt();
            Van van1 = new Van(basePrice);
            van1.increaseMileage(0);
            System.out.println(van1.toString());
            System.out.println(van1.getPrice());
            van1.increaseMileage(jarakTempuh);
            System.out.println(van1.toString());
            System.out.println(van1.getPrice());
        }
        scanner.close();
    }
}
