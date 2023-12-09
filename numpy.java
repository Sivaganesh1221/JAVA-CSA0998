import java.util.*;
public class numpy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=n;i>0;i--)
        {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print(j+" ");
                
            }
            System.out.println();
            num++;

        }
    }
    
}
