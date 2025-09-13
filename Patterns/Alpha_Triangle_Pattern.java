/* 
Input Format: N = 3
Result: 
C
B C
A B C

Input Format: N = 6
Result:   
F
E F
D E F
C D E F
B C D E F
A B C D E F 

 */

import java.util.Scanner;

public class Alpha_Triangle_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to print pattern ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (char ch = (char) (int) ('A' + n - 1 - i); ch <= (char) (int) ('A' + n - 1); ch++) {

                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
