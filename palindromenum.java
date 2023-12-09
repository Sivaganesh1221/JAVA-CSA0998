import java.util.*;

public class palindromenum {
    public static void main(String args[]) {
        int r, sum = 0, temp;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n= s.nextInt();

        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }

        if (temp == sum)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a palindrome");

       
    }
}
