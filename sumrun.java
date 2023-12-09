import java.util.Scanner; 
public class sumrun { 
 public static void main(String [] args) { 
 try { 
 Scanner sc = new Scanner(System.in); 
 int a, sum = 0; 
 System.out.println("enter the total number of elements to be: "); 
 a = sc.nextInt(); 
 if(a<0){ 
 throw new Exception("invalid input"); 
 } 
 int arr[] = new int[10]; 
 System.out.println("enter the elements: "); 
 for (int i = 0; i < a; i++) { 
 arr[i] = sc.nextInt(); 
 } 
 for (int i = 0; i < a; i++) { 
 sum = sum + arr[i]; 
 } 
 System.out.println(sum); 
 } 
 catch (Exception e){ 
 System.out.println("invalid input"); 
 } 
 } 
}