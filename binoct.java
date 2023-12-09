import java.util.Scanner; 
public class binoct { 
 public static void main(String[] args) { 
 Scanner myScanner=new Scanner(System.in); 
 System.out.print("Enter a Binary number : "); 
 String binary=myScanner.nextLine(); 
 int num=Integer.parseInt(binary,2); 
 System.out.println("Decimal value is : "+num); 
 String octal=Integer.toOctalString(num); 
 System.out.println("Octal value is : "+octal); 
 String hexa=Integer.toHexString(num); 
 System.out.println("Hexadecimal value is : "+hexa); 
 } 
}