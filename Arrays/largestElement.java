public class largestElement{
    public static void main(String[] args) {
    int largestElement = Integer.MIN_VALUE;
        int arr[]={12,56,89,00,76,12,54};
        for(int i=0;i<arr.length;i++){
            if (largestElement<arr[i]) {
                largestElement=arr[i];
            }
        }
        System.out.print("Largest element is " + largestElement);
    }
}