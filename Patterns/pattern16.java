/* 
 Input Format: N = 3
Result: 
A
B B
C C C

Input Format: N = 6
Result:   
A 
B B
C C C
D D D D
E E E E E
F F F F F F
 */

import java.util.Scanner;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print pattern of alphabets :) ");
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }
            ch++;
            System.out.println();
        }
        sc.close();
    }
}
