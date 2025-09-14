import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        int revNum = 0;
        while (n > 0) {
            int num = n % 10;
            revNum = (revNum * 10) + num;
            n = n / 10;
        }
        System.out.println(revNum);
    }
}
