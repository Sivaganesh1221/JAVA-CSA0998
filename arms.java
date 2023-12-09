import java.util.Scanner;

public class arms {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int copy=num;
        String n=Integer.toString(num);
        int len=n.length();
        while (num!=0)
        {
            int rem=num%10;
            int mul=1;
            for (int i=1;i<=len;i++) 
            {
                mul=mul *rem;
                
            }
            sum=sum+mul;
            num=num/10;                     
        }
        if (sum == copy) {
            System.out.println("is arms");

            
        }
        else
        {
            System.out.println("not arms");
        }


    }
}
