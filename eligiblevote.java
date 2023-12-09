import java.util.*; 
public class eligiblevote { 
 public static boolean checkInt(String s){ 
 try{ 
 int n = Integer.parseInt(s); 
 return true; 
 } 
 catch(NumberFormatException e){ 
 System.out.println("Enter a Valid Age in Integer."); 
 return false; 
 } 
 } 
 public static void main(String[] Args){ 
 Scanner sc = new Scanner(System.in); 
 String age; 
 System.out.println("Enter age : "); 
 age = sc.nextLine(); 
 if(checkInt(age) == true ){ 
 int a = Integer.parseInt(age); 
 if(a > 0){ 
 if(a >= 18){ 
 System.out.println("You are Eligible to Vote"); 
 } 
 else{ 
 int d = 18 - a; 
 System.out.println("Sorry ! You are Eligible after " + d + " years.\n"); 
 } 
 } 
 else{ 
 System.out.println("Enter a Valid Age."); 
 } 
 } 
 } 
} 
