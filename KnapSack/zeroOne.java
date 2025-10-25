public class zeroOne {

    public static void main(String[] args) {
        int[] values = { 60, 100, 120 };
        int[] weights = { 10, 20, 30 };
        int W = 50;
        int n = values.length;

        int maxValue = knapsack(weights, values, W, n);
        System.out.println("Max Value that can be stored in the bag is: " + maxValue);
    }

    public static int knapsack(int[] weights, int[] values, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }

        if (weights[n - 1] > w) {
            return knapsack(weights, values, w, n - 1);
        } else {
            int include = values[n - 1] + knapsack(weights, values, w - weights[n - 1], n - 1);
            int exclude = knapsack(weights, values, w, n - 1);

            return Math.max(include, exclude);
        }
    }
}
