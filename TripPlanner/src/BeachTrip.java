public class BeachTrip extends Trip{
    private String beachName;
    private boolean beachActivitiesIncluded;
    private double averageTemperature;

    public BeachTrip(String country, int duration, TravelMethod travelMethod, double price, String beachName, boolean beachActivitiesIncluded, double averageTemperature){
        super(country, duration, travelMethod, price);
        this.beachName = beachName;
        this.beachActivitiesIncluded = beachActivitiesIncluded;
        this.averageTemperature = averageTemperature;
    }
    public String getBeachName() {
        return beachName;
    }

    public void setBeachName(String beachName) {
        this.beachName = beachName;
    }

    public boolean isBeachActivitiesIncluded() {
        return beachActivitiesIncluded;
    }

    public void setBeachActivitiesIncluded(boolean beachActivitiesIncluded) {
        this.beachActivitiesIncluded = beachActivitiesIncluded;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }
    @Override
    public String toString() {
        // Call the parent class's toString method to get the basic trip details
        String parentDetails = super.toString();
        // Append BeachTrip-specific details
        return parentDetails + ", Beach Name: " + beachName + ", Beach Activities Included: " + beachActivitiesIncluded + ", Average Temperature: " + averageTemperature;
    }

}
