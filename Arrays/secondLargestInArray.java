import java.util.Arrays;

public class secondLargestInArray {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 4, 6, 7, 5 };
        /*
         * Arrays.sort(arr);
         * int secondLargest = 0;
         * secondLargest = arr[arr.length - 2];
         * System.out.print("Second largest array is " + secondLargest);
         */

        /* Without using sort */

        if (arr.length == 1 || arr.length == 0) {
            System.out.print(-1 + "  is the smallest and largest ");
            return;
        }
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        
        for (int i = 0; i < arr.length; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < second_small && arr[i] != small) {
                second_small = arr[i];
            }
            if (arr[i] > second_large && arr[i] != large) {
                second_large = arr[i];
            }
        }

        System.out.println("Second smallest is " + second_small);
        System.out.println("Second largest is " + second_large);
    }
}
