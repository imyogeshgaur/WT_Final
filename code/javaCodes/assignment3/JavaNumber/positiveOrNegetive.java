package JavaNumber;

import java.util.Scanner;

public class positiveOrNegetive {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number : ");
        num = sc.nextInt();
        sc.close();
        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
