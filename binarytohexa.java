import java.util.Scanner;
class binarytohexa 
   {
    Scanner scan = new Scanner(System.in);
	int num;
	void getVal() 
	    {
		System.out.println("Binary to HexaDecimal");
		scan = new Scanner(System.in);
		System.out.println("\nEnter the number :");
		num = Integer.parseInt(scan.nextLine(), 2);
	    }
	void convert() 
	   {
		String hexa = Integer.toHexString(num);
		System.out.println("HexaDecimal Value is : " + hexa);
	   }
    }
class Main_Class
 {
           public static void main(String [] args) 
            {
	binarytohexa obj = new binarytohexa();
	obj.getVal();
	obj.convert();
              }
}