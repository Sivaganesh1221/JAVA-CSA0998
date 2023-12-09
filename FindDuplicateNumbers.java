
import java.util.Scanner;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Read the array elements
        int[] numbers = new int[size];
        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        {    
                    //Searches for duplicate element  
                    for(int i = 0; i < size; i++) {  
                        for(int j = i + 1; j < size; j++) {  
                            if(numbers[i] == numbers[j])  
                                System.out.println(numbers[j]);  
                        }  
                    }  
                }  
            } 
}
