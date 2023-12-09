import java.util.*;
public class sum_of_n_naturalnum {
    public static void main(String[] args) {
        System.out.println("N value:");
        Scanner s=new Scanner(System.in);
        int n,sum=0,i;
        n=s.nextInt();
        
        for(i=1;i<=n;i++)
        {
            sum +=i;
        }
        System.out.println("Sum of "+n+" 5natural number is "+sum);

    }
}
