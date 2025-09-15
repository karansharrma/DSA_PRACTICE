public class HalfSort {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 6, 3, 8, 4 };
        int n = arr.length;
        int mid = n / 2;

        for (int i = 0; i < mid - 1; i++) {
            for (int j = i + 1; j < mid; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int i = mid; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
