import java.util.Arrays;
 
public class example {
 
    public static void main(String[] args) {
         
        String str1 = "Saket";
         
        // conversion into character array
        char[] chars = str1.toCharArray();
         
        System.out.println("Original String was: " + str1);
        System.out.println("Characters are: " + Arrays.toString(chars));
         
    }
 
}