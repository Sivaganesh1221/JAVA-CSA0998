import java.util.*;

public class arrange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the word:");
        str = sc.nextLine();
        int n = str.length();
        char[] letter = new char[n];
        letter = str.toCharArray();
        
        char temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (letter[i] > letter[j]) {
                    temp = letter[i];
                    letter[i] = letter[j];
                    letter[j] = temp;
                }
            }
        }

        System.out.println("The String in alphabetical order is: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(letter[i]);
        }
    }
}
