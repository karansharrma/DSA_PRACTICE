import java.util.ArrayList;
import java.util.List;

public class printDivisor {
    public static void main(String[] args) {
        int n = 3624324;
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        System.out.print(factors);
    }
}
