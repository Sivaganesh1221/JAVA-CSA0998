package assisgnment;

import java.util.*;

public class days {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of days: ");
        int totalDays = input.nextInt();
        
        if (totalDays < 0) {
            System.out.println("Please enter a non-negative number of days.");
        } else {
            int years, weeks, days;
            
            years = totalDays / 365;
            totalDays = totalDays % 365;
            
            weeks = totalDays / 7;
            days = totalDays % 7;
            
            System.out.println("No. of years: " + years);
            System.out.println("No. of weeks: " + weeks);
            System.out.println("No. of days: " + days);
        }
        
        input.close();
    }
}
