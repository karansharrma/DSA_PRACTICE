public class MissingNumber {
    public static void main(String[] args) {
        int nums[] = {9, 6, 4, 2, 3, 5, 7, 0, 1};

        int n = nums.length; 
        int expectedSum = n * (n + 1) / 2; 
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing number is: " + missing);
    }
}
