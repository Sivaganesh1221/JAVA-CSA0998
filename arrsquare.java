import java.util.*;

public class arrsquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower range: ");
        int lowerRange = scanner.nextInt();

        System.out.print("Enter the upper range: ");
        int upperRange = scanner.nextInt();

        int[][] result = squarr(lowerRange, upperRange);

        printarray(result);
    }

    public static int[][] squarr(int lowerRange, int upperRange) {
        int size = upperRange - lowerRange + 1;
        int[][] result = new int[size][2];

        for (int i = 0; i < size; i++) {
            result[i][0] = lowerRange + i; 
            result[i][1] = (lowerRange + i) * (lowerRange + i);
        }

        return result;
    }

    public static void printarray(int[][] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("(" + array[i][0] + ", " + array[i][1] + ")");
            
            }
        }
        
    }

