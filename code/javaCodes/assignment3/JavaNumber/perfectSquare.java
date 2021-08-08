package JavaNumber;

import java.util.Scanner;
import java.lang.Math;

public class perfectSquare {
    static boolean checkPerfectSquare(double number) {
        double sqrt = Math.sqrt(number);
        return ((sqrt - Math.floor(sqrt)) == 0);
    }

    public static void main(String[] args) {
        System.out.print("Enter any number: ");
        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        sc.close();
        if (checkPerfectSquare(number))
            System.out.print("Yes, the given number is perfect square.");
        else
            System.out.print("No, the given number is not perfect square.");
    }
}
