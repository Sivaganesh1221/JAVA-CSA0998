import java.util.*;
public class factorial {
    public static void main(String[] args) {
        System.out.println("N value:");
        Scanner s=new Scanner(System.in);
        int n,fact=1,i;
        n=s.nextInt();
        
        for(i=1;i<=n;i++)
        {
            fact *=i;
        }
        System.out.println("Factorial of "+n+" is "+fact);

    }
}
