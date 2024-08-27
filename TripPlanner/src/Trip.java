public class Trip {
    private String country;
    private int duration; //in weeks
    private TravelMethod travelMethod;
    private double price;


    public Trip (String country, int duration, TravelMethod travelMethod, double price){
        this.country = country;
        this.duration = duration;
        this.travelMethod = travelMethod;
        this.price = price;
    }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public TravelMethod getTravelMethod() {
        return travelMethod;
    }

    public void setTravelMethod(TravelMethod travelMethod) {
        this.travelMethod = travelMethod;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Trip to " + country + " for " + duration + " weeks, Price: $" + price + ", Travel Method: " + travelMethod;
    }

}

