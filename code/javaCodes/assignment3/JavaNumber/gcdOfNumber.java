package JavaNumber;

import java.util.Scanner;

public class gcdOfNumber {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the First Number : ");
        n1 = sc.nextInt();
        System.out.printf("Enter the Second Number : ");
        n2 = sc.nextInt();
        sc.close();
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {

            if (n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }

        System.out.println("GCD of " + n1 + " and " + n2 + " is " + gcd);
    }
}
