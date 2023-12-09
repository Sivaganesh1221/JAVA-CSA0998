import java.util.InputMismatchException;
import java.util.Scanner;

class mini12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();
        boolean exit = false;

        while (!exit) {
            displayMenu();
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                switch (choice) {
                    case 1:
                        addVehicle(scanner, vehicleManager);
                        break;
                    case 2:
                        viewVehicles(vehicleManager);
                        break;
                    case 3:
                        removeVehicle(scanner, vehicleManager);
                        break;
                    case 4:
                        searchByMakeOrModel(scanner, vehicleManager);
                        break;
                    case 5:
                        calculateAveragePrice(vehicleManager);
                        break;
                    case 6:
                        displayVehicleCount(vehicleManager);
                        break;
                    case 7:
                        exit = true;
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid choice.");
                scanner.nextLine();  // Consume invalid input
            }
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }

    private static void displayMenu() {
        System.out.println("Vehicle Management System");
        System.out.println("1. Add Vehicle");
        System.out.println("2. View Vehicles");
        System.out.println("3. Remove Vehicle");
        System.out.println("4. Search by Make or Model");
        System.out.println("5. Calculate Average Price");
        System.out.println("6. Display Vehicle Count");
        System.out.println("7. Exit");
    }

    private static void addVehicle(Scanner scanner, VehicleManager vehicleManager) {
        System.out.print("Enter make: ");
        String make = scanner.nextLine();
        System.out.print("Enter model: ");
        String model = scanner.nextLine();

        int year;
        do {
            System.out.print("Enter year: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid year.");
                scanner.next(); // Consume the invalid input
            }
            year = scanner.nextInt();
            scanner.nextLine();  // Consume newline
        } while (year < 1800 || year > 3000);  // Assuming a reasonable range for years

        double price;
        do {
            System.out.print("Enter price: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid price.");
                scanner.next(); // Consume the invalid input
            }
            price = scanner.nextDouble();
            scanner.nextLine();  // Consume newline
        } while (price < 0);

        Vehicle newVehicle = new Vehicle(make, model, year, price);
        vehicleManager.addVehicle(newVehicle);
        System.out.println("Vehicle added successfully!");
    }

    private static void viewVehicles(VehicleManager vehicleManager) {
        System.out.println("All Vehicles:");
        for (Vehicle vehicle : vehicleManager.getAllVehicles()) {
            System.out.println(vehicle);
        }
    }

    private static void removeVehicle(Scanner scanner, VehicleManager vehicleManager) {
        viewVehicles(vehicleManager);
        if (!vehicleManager.getAllVehicles().isEmpty()) {
            int index = getValidIndex(scanner, vehicleManager);

            if (index >= 0 && index < vehicleManager.getAllVehicles().size()) {
                Vehicle removedVehicle = vehicleManager.getAllVehicles().remove(index);
                System.out.println("Vehicle removed: " + removedVehicle);
            } else {
                System.out.println("Invalid index. No vehicle removed.");
            }
        } else {
            System.out.println("No vehicles to remove.");
        }
    }

    private static int getValidIndex(Scanner scanner, VehicleManager vehicleManager) {
        int index;
        while (true) {
            try {
                System.out.print("Enter the index of the vehicle to remove: ");
                index = scanner.nextInt();
                scanner.nextLine();  // Consume newline

                if (index >= 0 && index < vehicleManager.getAllVehicles().size()) {
                    break;
                } else {
                    System.out.println("Invalid index. Please enter a valid index.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid index.");
                scanner.nextLine();  // Consume invalid input
            }
        }
        return index;
    }

    private static void searchByMakeOrModel(Scanner scanner, VehicleManager vehicleManager) {
        System.out.print("Enter make or model to search: ");
        String searchKeyword = scanner.nextLine().toLowerCase();

        System.out.println("Matching Vehicles:");
        for (Vehicle vehicle : vehicleManager.getAllVehicles()) {
            if (vehicle.getMake().toLowerCase().contains(searchKeyword) || vehicle.getModel().toLowerCase().contains(searchKeyword)) {
                System.out.println(vehicle);
            }
        }
    }

    private static void calculateAveragePrice(VehicleManager vehicleManager) {
        if (!vehicleManager.getAllVehicles().isEmpty()) {
            double totalPrice = 0;
            for (Vehicle vehicle : vehicleManager.getAllVehicles()) {
                totalPrice += vehicle.getPrice();
            }
            double averagePrice = totalPrice / vehicleManager.getAllVehicles().size();
            System.out.println("Average Price of Vehicles: $" + averagePrice);
        } else {
            System.out.println("No vehicles available to calculate average price.");
        }
    }

    private static void displayVehicleCount(VehicleManager vehicleManager) {
        System.out.println("Total Number of Vehicles: " + vehicleManager.getAllVehicles().size());
    }
}

class Vehicle {
    private String make;
    private String model;
    private int year;
    private double price;

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
    private java.util.List<Vehicle> vehicles;

    public VehicleManager() {
        vehicles = new java.util.ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public java.util.List<Vehicle> getAllVehicles() {
        return vehicles;
    }

    public void removeVehicle(Vehicle vehicle) {
        vehicles.remove(vehicle);
    }
}
