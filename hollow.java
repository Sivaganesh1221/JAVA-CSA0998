import java.util.Scanner; 
public class hollow { 
 public static void main(String[] args) { 
 
 char ch; 
 Scanner sc = new Scanner(System.in); 
 System.out.print(" Please Enter any Character : "); 
 ch = sc.next().charAt(0); 
 System.out.println("Enter row and col"); 
 int row = sc.nextInt(); 
 int col = sc.nextInt(); 
 for (int i = 1; i <=row; i++) { 
 for (int j = 1; j <= col; j++) 
 if((i==1 || i==col) || (j==1 || j==col)) 
 System.out.print(ch+""); 
 else 
 System.out.print(" "); 
 
 System.out.println(); 
 
 } 
 } 
} 
