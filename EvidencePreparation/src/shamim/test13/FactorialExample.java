package shamim.test13;

import java.util.Scanner;

public class FactorialExample {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        while (n != 0) {
            System.out.println("Enter a value for evaluate factorial: ");
            n = sc.nextInt();
            int f = 1;
            for (int i = 1; i <= n; i++) {
                f *= i;
            }
            System.out.println("The factorial is: "+f);
        }
    }
}
