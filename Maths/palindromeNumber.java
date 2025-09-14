import java.util.Scanner;

public class palindromeNumber {
    public static void main(String[] args) {
        int reverseNum = 0;
        int n, originalNum;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextInt();
        originalNum = n; 

        while (n > 0) {
            int digit = n % 10;
            reverseNum = (reverseNum * 10) + digit;
            n = n / 10; 
        }

        if (reverseNum == originalNum) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
