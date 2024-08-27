import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Trip> trips = new ArrayList<>();
        displayMenu(trips);
    }
    public static void displayMenu(ArrayList<Trip> trips){
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while(!exit){
            System.out.println("Welcome to TripPlanner");
            System.out.println("Please choose an option");
            System.out.println("1. Make a new trip");
            System.out.println("2. See list of trips");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            switch (choice){
                case 1:
                    createTrip(trips, scanner);
                    break;
                case 2:
                    listTrips(trips);
                    break;
                case 3:
                    exit = true;
                    System.out.println("The program is closing");
                    break;
                default:
                    System.out.println("Invalid choise.");
                    break;
            }
        }

    }
    public static void createTrip(ArrayList<Trip> trips, Scanner scanner) {
        // Implementation to create a trip and add it to the ArrayList
        System.out.println("1. Skitrip");
        System.out.println("2. Beachtrip");
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                SkiTrip skiTrip = createSkiTrip(scanner);
                trips.add(skiTrip);
                    break;
            case 2:
                BeachTrip beachTrip = createBeachTrip(scanner);
                trips.add(beachTrip);
                    break;

        }
    }
    public static SkiTrip createSkiTrip(Scanner scanner){
        System.out.println("Enter country");
        String country = scanner.next();
        System.out.println("Enter duration in weeks");
        int duration = scanner.nextInt();
        System.out.println("What is the price of the trip");
        double price = scanner.nextDouble();
        System.out.println("Enter travel method ");
        String travelMethodStr = scanner.next().toUpperCase();
        TravelMethod travelMethod = TravelMethod.valueOf(travelMethodStr);
        System.out.println("Enter ski resort name:");
        String skiResortName = scanner.next();
        System.out.println("Is ski equipment included? (true/false):");
        boolean skiEquipmentIncluded = scanner.nextBoolean();
        System.out.println("Enter difficulty level (1-5):");
        int difficultyLevel = scanner.nextInt();
        return new SkiTrip(country, duration, travelMethod, price, skiResortName, skiEquipmentIncluded, difficultyLevel);
    }
    //public BeachTrip(String country, int duration, TravelMethod travelMethod, double price, String beachName, boolean beachActivitiesIncluded, double averageTemperature)
    public static BeachTrip createBeachTrip(Scanner scanner){
        System.out.println("Enter the country");
        String country = scanner.next();
        System.out.println("Enter the duration in weeks");
        int duration = scanner.nextInt();
        System.out.println("Enter the travelmethod");
        String travelMethodstr = scanner.next().toUpperCase();
        TravelMethod travelMethod = TravelMethod.valueOf(travelMethodstr);
        System.out.println("Enter the price");
        double price = scanner.nextDouble();
        System.out.println("Enter the beach name");
        String beachName = scanner.next();
        System.out.println("Do you want to inlclude beachactivities?");
        boolean beachEquipmentIncluded = scanner.nextBoolean();
        System.out.println("what is the average temperature?");
        double temp = scanner.nextDouble();
        return new BeachTrip(country, duration, travelMethod, price, beachName, beachEquipmentIncluded, temp);
    }
    public static void listTrips(ArrayList<Trip> trips) {
        for (Trip listTrips : trips){
            System.out.println(listTrips.toString());
        }
        // Implementation to list all trips in the ArrayList
    }

}