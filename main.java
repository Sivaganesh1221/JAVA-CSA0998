class overload{  
 void add(int a,int b)
 {
    System.out.println(a+b);
 }  
void add(int a,int b,int c)
 {
    System.out.println(a+b+c);
 } } 

public class main{  
public static void main(String[] args){  
overload obj=new overload();
obj.add(1,2); 
obj.add(1, 2, 3);
  
}}  