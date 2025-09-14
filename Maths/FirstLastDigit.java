import java.util.Scanner;

public class FirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lastDigit = n % 10;
        int firstDigit = n;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        System.out.println("First digit is " + firstDigit + " Last digit is " + lastDigit);
    }
}
