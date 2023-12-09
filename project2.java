import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();

        while (true) {
            System.out.println("Vehicle Management System");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Total Vehicles");
            System.out.println("4. Average Price");
            System.out.println("5. Vehicles by Year");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter make: ");
                    String make = scanner.nextLine();
                    System.out.print("Enter model: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter year: ");
                    int year = scanner.nextInt();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();

                    Vehicle newVehicle = new Vehicle(make, model, year, price);
                    vehicleManager.addVehicle(newVehicle);
                    System.out.println("Vehicle added successfully!");
                    break;
                case 2:
                    System.out.println("All Vehicles:");
                    for (Vehicle vehicle : vehicleManager.getAllVehicles()) {
                        System.out.println(vehicle);
                    }
                    break;
                case 3:
                    System.out.println("Total Vehicles: " + vehicleManager.getTotalVehicles());
                    break;
                case 4:
                    System.out.println("Average Price: $" + vehicleManager.getAveragePrice());
                    break;
                case 5:
                    System.out.print("Enter the year: ");
                    int searchYear = scanner.nextInt();
                    List<Vehicle> vehiclesByYear = vehicleManager.getVehiclesByYear(searchYear);
                    if (vehiclesByYear.isEmpty()) {
                        System.out.println("No vehicles found for the specified year.");
                    } else {
                        System.out.println("Vehicles for the year " + searchYear + ":");
                        for (Vehicle vehicle : vehiclesByYear) {
                            System.out.println(vehicle);
                        }
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Vehicle {
    private final String make;
    private final String model;
    private final int year;
    private final double price;

    public Vehicle(String make, String model, int year, double price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: $" + price;
    }
}

class VehicleManager {
    private List<Vehicle> vehicles;

    public VehicleManager() {
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public List<Vehicle> getAllVehicles() {
        return new ArrayList<>(vehicles);
    }

    public int getTotalVehicles() {
        return vehicles.size();
    }

    public double getAveragePrice() {
        if (vehicles.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        for (Vehicle vehicle : vehicles) {
            total += vehicle.getPrice();
        }

        return total / vehicles.size();
    }

    public List<Vehicle> getVehiclesByYear(int year) {
        List<Vehicle> vehiclesByYear = new ArrayList<>();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getYear() == year) {
                vehiclesByYear.add(vehicle);
            }
        }
        return vehiclesByYear;
    }
}
