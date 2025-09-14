/* 
                Input:N = 12345               
                Output:5
                Explanation:  The number 12345 has 5 digits.
 */

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some digits number to calculate its digits ");
        int num = sc.nextInt();
        int originalNum=num;
        int digits = 0;
        while (num > 0) {
            num = num / 10;
            digits++;
        }
        System.out.print("The number " + originalNum + " has " + digits + " digits");
        sc.close();
    }

}