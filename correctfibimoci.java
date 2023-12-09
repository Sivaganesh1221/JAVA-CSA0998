import java.util.*;
public class fibinoci {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=0,n2=1,n3,i,count;
        System.out.println("n valve:");
        count=s.nextInt();
        System.out.print(+n1+","+n2+",");
        for(i=2;i<count;i++)
        {
            n3=n1+n2;
            System.out.print(n3+",");
            n1=n2;
            n2=n3;

        }
        
    }
    
}
