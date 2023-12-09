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

    // Method to set additional details using a String[] parameter
    public void setAdditionalDetails(String[] additionalDetails) {
        // Assuming additionalDetails contains make, model, year, and price in order
        if (additionalDetails.length >= 4) {
            this.make = additionalDetails[0];
            this.model = additionalDetails[1];
            try {
                this.year = Integer.parseInt(additionalDetails[2]);
                this.price = Double.parseDouble(additionalDetails[3]);
            } catch (NumberFormatException e) {
                System.out.println("Error parsing year or price. Details not updated.");
            }
        } else {
            System.out.println("Insufficient details provided.");
        }
    }

    @Override
    public String toString() {
        return "Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: $" + price;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a Vehicle object with initial details
        Vehicle myCar = new Vehicle("Toyota", "Camry", 2022, 25000.0);

        // Additional details in String array: make, model, year, price
        String[] additionalDetails = {"Honda", "Accord", "2019", "20000.0"};

        // Set additional details using the method
        myCar.setAdditionalDetails(additionalDetails);

        // Print the updated details using toString method
        System.out.println(myCar);
    }
}
