/* 
 Input Format: N = 3
Result: 
***
* *
***

Input Format: N = 6
Result:   
******
*    *
*    *
*    *
*    *
******
 
*/

import java.util.Scanner;

public class pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print pattern :) ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == n || j == 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
