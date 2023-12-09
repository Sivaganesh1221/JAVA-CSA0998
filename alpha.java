import java.util.Scanner;

public class alpha {
    public static void main(String[] args) {
        int n = 5;
        String names[] = new String[n];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

       
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) {
                    
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }

        System.out.println("Names in alphabetical order are:");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }
}
