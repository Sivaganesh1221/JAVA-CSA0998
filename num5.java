import java.util.*;
public class num5 {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int num=sc.nextInt();
        System.out.print("ENter the max row:");
        int n = sc.nextInt();
         
        
        for(int i=1; i<=n; i++) {
             
           
            for(int j=1; j<=i; j++) {
                 
                
                System.out.print(num);
            }
            
            System.out.println();
        }
         
       
        for(int i=(n-1); i>=1; i--) {
             
            
            for(int j=1; j<=i; j++) {
                 
            
                System.out.print(num);
            }
             
            
            System.out.println();
        }
    }
 
}
