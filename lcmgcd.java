import java.util.*;
public class lcmgcd {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int size;
    System.out.print("enter n value:");
    size=sc.nextInt();
    int [] arr= new int[size];
    
    for (int i = 0; i < arr.length; i++) {
        System.out.print("Number "+(i+1)+"=");
        arr[i]=sc.nextInt();      
    }
    size=1;
    int gcd = 1;
    for (int i = 0; i < size; i++) {
         for(int j = 1; j <=arr[i]  && j <= arr[i+1]; ++j) {
    
      if(arr[i] % j == 0 && arr[i+1] % j == 0)
        gcd = j;
    }
}
    System.out.println("gcd="+gcd);
    int sum=1;
    for (int i = 0; i < arr.length; i++) {
         sum =sum *arr[i];      
    }
    int lcm = sum / gcd;
    System.out.println("LCM="+lcm);
}
}