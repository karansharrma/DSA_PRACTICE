public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 5, 4, 3, 2, 1 };
        int num = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.print("Number is at index  " + i);
                return;
            }
        }
    }
}
