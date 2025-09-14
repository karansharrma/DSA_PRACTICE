public class printmissingnumber {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7 };
        int n = 7;
        int sum = 0;
        int total = n * (n + 1) / 2;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Missing number is " + (total - sum));
    }
}
