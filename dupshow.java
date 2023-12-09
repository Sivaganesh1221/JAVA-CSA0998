import java.util.*;

public class dupshow {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {2, 4, 5, 6, 7};

        int[] commonElements = elements(arr1, arr2);

        System.out.println("Common elements: " + Arrays.toString(commonElements));
    }

    public static int[] elements(int[] arr1, int[] arr2) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    resultList.add(arr1[i]);
                    break; 
                }
            }
        }

        int[] commonArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            commonArray[i] = resultList.get(i);
        }

        return commonArray;
    }
}
