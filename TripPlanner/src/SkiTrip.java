public class SkiTrip extends Trip {
    private String skiResortName;
    private boolean skiEquipmentIncluded;
    private int difficultyLevel;

    public SkiTrip(String country, int duration, TravelMethod travelMethod, double price, String skiResortName, boolean skiEquipmentIncluded, int difficultyLevel){
        super(country,duration, travelMethod, price);
        this.skiResortName = skiResortName;
        this.skiEquipmentIncluded = skiEquipmentIncluded;
        this.difficultyLevel = difficultyLevel;
    }
    public String getSkiResortName() {
        return skiResortName;
    }

    public void setSkiResortName(String skiResortName) {
        this.skiResortName = skiResortName;
    }

    public boolean isSkiEquipmentIncluded() {
        return skiEquipmentIncluded;
    }

    public void setSkiEquipmentIncluded(boolean skiEquipmentIncluded) {
        this.skiEquipmentIncluded = skiEquipmentIncluded;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(int difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
    @Override
    public String toString() {
        // Call the parent class's toString method to get the basic trip details
        String parentDetails = super.toString();
        // Append SkiTrip-specific details
        return parentDetails + ", Ski Resort: " + skiResortName + ", Ski Equipment Included: " + skiEquipmentIncluded + ", Difficulty Level: " + difficultyLevel;
    }


}
