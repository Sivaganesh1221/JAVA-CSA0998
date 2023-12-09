import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an option:");
        System.out.println("1. Check palindrome for a string");
        System.out.println("2. Check palindrome for a number");

        int choice = sc.nextInt();
        sc.nextLine();  

        switch (choice) {
            case 1:
                {
                    String str1, str2 = "";

                    System.out.println("Enter a string");
                    str1 = sc.nextLine();
                    int length = str1.length();
                    for (int i = length - 1; i >= 0; i--)
                        str2 = str2 + str1.charAt(i);
                    if (str1.equals(str2))
                        System.out.println("palindrome.");
                    else
                        System.out.println("not palindrome.");
                }
                break;
            case 2:
                int r, sum = 0, temp;
                System.out.println("Enter the number");
                int n = sc.nextInt();

                temp = n;
                while (n > 0) {
                    r = n % 10;
                    sum = (sum * 10) + r;
                    n = n / 10;
                }
                if (temp == sum)
                    System.out.println("palindrome number ");
                else
                    System.out.println("not palindrome");
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }
    }
}
