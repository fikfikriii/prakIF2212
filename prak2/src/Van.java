public class Van extends Car{
    private long basePrice;
    
    public Van(long basePrice){
        super(4);
        this.basePrice = basePrice;
    }

    public long getPrice(){
        long a;
        if (super.getMileage() >= 0 && super.getMileage() <= 1000){
            a = this.basePrice;
        } else if(super.getMileage() > 1000 && super.getMileage() <= 10000){
            a = this.basePrice * 3 / 4;
        } else{
            a = this.basePrice / 2;
        }
        return a;
    }

}
