public class Armstrong {
    public static void main(String[] args) {

        int num = 157;
        int k = String.valueOf(num).length();
        int sum = 0;
        int n = num;
        while (n > 0) {
            int ld = n % 10;
            sum += Math.pow(ld, k);
            n = n / 10;
        }
        if (sum == num) {
            System.out.print("Yes armstrong");
        } else {
            System.out.print("No");
        }
    }

}
