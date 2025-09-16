public class CheckArraySort {
    public static void main(String[] args) {
        Boolean isSorted = false;
        int arr[] = {  98, 94, 8, 4,2 };
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = true;
            } else {
                isSorted = false;
            }
        }
        System.out.print("The Array sorted in descending = " + isSorted);
    }

}
