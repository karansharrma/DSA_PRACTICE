
/* 
  Example 1:
                Input:N1 = 9, N2 = 12
                
                
                Output:3
                Explanation:Factors of 9: 1, 3 and 9
                Factors of 12: 1, 2, 3, 4, 6, 12
                Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.



*/
import java.util.ArrayList;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int n, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        n = sc.nextInt();
        System.out.print("Enter Second Number: ");
        j = sc.nextInt();

        ArrayList<Integer> factors1 = new ArrayList<>();
        ArrayList<Integer> factors2 = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors1.add(i);
            }
        }

        for (int k = 1; k <= j; k++) {
            if (j % k == 0) {
                factors2.add(k);
            }
        }

        int gcd = 1;
        for (int i = 0; i < factors1.size(); i++) {
            int f1 = factors1.get(i);
            if (factors2.contains(f1)) {
                gcd = f1;
            }
        }

        System.out.println("GCD of " + n + " and " + j + " = " + gcd);

        sc.close();
    }
}
