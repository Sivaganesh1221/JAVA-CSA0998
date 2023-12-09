import java.io.*;
import java.util.*;
class strings {
public static void main (String[] args) {
String str1, str2;
boolean result;
Scanner s=new Scanner(System.in);
System.out.print("Enter the  word: ");
str1=s.next();
System.out.print("Enter the  word: ");
str2=s.next();
result=str1.equals(str2);
if(result==false)
System.out.println("invalid strings");
else
System.out.print("valid strings");
}
}