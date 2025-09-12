/* 
 
Input Format: N = 3
Result: 
A B C
A B
A

Input Format: N = 6
Result:   
A B C D E F
A B C D E 
A B C D
A B C
A B
A

 */

import java.util.Scanner;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print pattern of alphabets :) ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (char j = 'A'; j <= 'A' + n - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
