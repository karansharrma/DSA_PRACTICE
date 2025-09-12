
/* 
 
Input Format: N = 3
Result: 
  *  
  **
  ***  
  **
  *   
Input Format: N = 6
Result:   
     *
     **
     *** 
     ****
     *****
     ******  
     *****
     ****
     ***    
     **
     *

 */
import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to print pattern: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n - 1; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
