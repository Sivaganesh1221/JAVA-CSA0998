import java.io.*; 
public class fibi
{ 
 public static void main(String[] args) 
 { 
 try 
 { 
 int a=0, b=1, c=0; 
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
 System.out.print("Enter the Limit for fabonacci: "); 
 int n = Integer.parseInt(br.readLine()); 
 System.out.println("\n ENTER THE POSITIVE NUMBER"); 
 System.out.println("Fibonacci series:"); 
 while (n>0) 
 { 
 System.out.print(c+" "); 
 a=b; 
 b=c; 
 c=a+b; 
 n=n-1; 
 } 
 } 
 catch (Exception e) 
 { 
 System.out.println("ENTER THE POSITIVE NUMBER"); 
 } 
 } 
}