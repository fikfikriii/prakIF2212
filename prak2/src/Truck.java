public class Truck extends Car{
    private boolean loaded;

    public Truck(int numberOfWheels, boolean loaded){
        super(numberOfWheels);
        this.loaded = loaded;
    }

    public boolean isLoaded(){
        return this.loaded;
    }

    public void load(){
        this.loaded = true;
    }
    
    public void unload(){
        this.loaded = false;
    }
    
    public String toString(){
        return ("Number of Wheels: " + this.getNumberOfWheels() + ", Mileage: " + super.getMileage() + ", Is Loaded: " + this.isLoaded());
    }

    public long getPrice(){
        return 5000000 * super.getNumberOfWheels();
    }
}