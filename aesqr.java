import java.util.Scanner;

public class aesqr {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter upper range: ");
        int upperRange = scanner.nextInt();

        for (int i = lowerRange; i <= upperRange; i++) {
            int square = i * i;
            System.out.println(i + " , " + square);
        }
    }
}
