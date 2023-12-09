import java.util.Scanner;
class BusBookingSystem {
    public static void main(String[] args) {
        int totalSeats = 30;
        char[] seats = new char[totalSeats];
        for (int i = 0; i < totalSeats; i++) {
            seats[i] = 'A'; // Initialize all seats as available
        }
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Available Seats: ");
            for (int i = 0; i < totalSeats; i++) {
                char seatStatus = seats[i];
                String seatName = getSeatName(i + 1);
                System.out.print(seatName + "[" + seatStatus + "] ");
            }
            System.out.println();
            System.out.print("Enter the number of seats you want to book (1-" + totalSeats
                    + "), or enter 0 to exit: ");
            int numSeatsToBook = scanner.nextInt();
            if (numSeatsToBook == 0) {
                System.out.println("Exiting bus booking system. Thank you!");
                break;
            }
            if (numSeatsToBook < 1 || numSeatsToBook > totalSeats) {
                System.out.println("Invalid number of seats. Please enter a valid number.");
                continue;
            }
            for (int i = 0; i < numSeatsToBook; i++) {
                System.out.print("Enter the seat number you want to book (1-" + totalSeats + "): ");
                int seatNumber = scanner.nextInt();
                if (seatNumber < 1 || seatNumber > totalSeats) {
                    System.out.println("Invalid seat number. Please enter a valid seat number.");
                    i--;
                    continue;
                }
                if (seats[seatNumber - 1] == 'A') {
                    seats[seatNumber - 1] = 'B';
                    System.out.println("Seat " + getSeatName(seatNumber) + " booked successfully!");
                } else {
                    System.out.println(
                            "Seat " + getSeatName(seatNumber) + " is already booked. Please choose another seat.");
                    i--; 
                }
            }
        }
        scanner.close();
    }
++
    private static String getSeatName(int seatNumber) {
        StringBuilder seatName = new StringBuilder();
        while (seatNumber > 0) {
            seatNumber--;
            seatName.insert(0, (char) ('A' + seatNumber % 26));
            seatNumber /= 26;
        }
        return seatName.toString();
    }
}