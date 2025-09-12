/* 
Input Format: N = 3
Result: 
A
A B
A B C

Input Format: N = 6
Result:   
A
A B
A B C
A B C D
A B C D E
A B C D E F 

 */

import java.util.Scanner;

public class pattern14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print pattern of alphabets :) ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");

            }
            System.out.println();
        }

    }
}