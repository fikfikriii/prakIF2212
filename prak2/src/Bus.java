public class Bus extends Car{
    private int maxCapacity;

    public Bus(int maxCapacity){
        super(6);
        this.maxCapacity = maxCapacity;
    }
    
    public int getMaxCapacity(){
        return this.maxCapacity;
    }

    public String toString(){
        return ("Number of Wheels: 6, Mileage: " + super.getMileage() + ", Max Capacity: " + this.getMaxCapacity());
    }

    public long getPrice(){
        long a;
        if (super.getMileage() >= 0 && super.getMileage() <= 10000){
            a = 1000000 * this.getMaxCapacity();
        } else{
            a = 500000 * this.getMaxCapacity();
        }
        return a;
    }
}