import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        if (((year%4==0)&&(year%100!=0)||(year%400==0))) {
            System.out.println("It is a leap year");
            
        }
        else{
            System.out.println("It is a normal year");
            
        }
    }

    
}
