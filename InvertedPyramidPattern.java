import java.util.Scanner;

 class InvertedPyramidPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the inverted pyramid: ");
        int rows = scanner.nextInt();

        printInvertedPyramid(rows);
    }

    static void printInvertedPyramid(int rows) {
        int starCount = 2 * rows - 1;

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= starCount; k++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();

            // Decrease star count for the next row
            starCount -= 2;
        }
    }
}
