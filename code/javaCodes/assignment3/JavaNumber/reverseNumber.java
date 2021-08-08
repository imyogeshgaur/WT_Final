package JavaNumber;

import java.util.Scanner;

public class reverseNumber {
    public static void main(String[] args) {

        int num, reversed = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the Number : ");
        num = sc.nextInt();
        sc.close();

        while (num != 0) {

            int digit = num % 10;
            reversed = reversed * 10 + digit;

            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
