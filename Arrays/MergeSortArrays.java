import java.util.Arrays;

public class MergeSortArrays {

    public static void main(String[] args) {
        int[] arr1 = { 7, 2, 5 };
        int[] arr2 = { 6, 3, 4 };

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int[] merged = new int[arr1.length + arr2.length];

        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            merged[k] = arr1[i];
            k++;
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[k] = arr2[i];
            k++;
        }

        Arrays.sort(merged);

        System.out.println("Merged Sorted Array: " + Arrays.toString(merged));
    }
}
