public class primenumber {
    public static void main(String[] args) {
        /*
         * int n = 2;
         * int extranum = 1;
         * if (n == 1) {
         * System.out.print("1 is niether prime nor composite");
         * return;
         * }
         * for (int i = 2; i <= n; i++) {
         * if (n % i == 0) {
         * extranum++;
         * }
         * }
         * if (extranum == 2) {
         * System.out.print("Yes its a prime number");
         * } else {
         * System.out.print("Not a prime number");
         * }
         */

        /* Method 2 */
        int n = 29;
        boolean isPrime = true;

        if (n == 1) {
            System.out.println("1 is neither prime nor composite");
            return;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Yes, it's a prime number");
        } else {
            System.out.println("Not a prime number");
        }
    }
}
