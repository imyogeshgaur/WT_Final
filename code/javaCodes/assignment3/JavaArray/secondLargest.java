package JavaArray;

import java.lang.Integer;
import java.util.Scanner;

public class secondLargest {
    public static void main(String[] args) {
        int secondlargest = Integer.MIN_VALUE;
        int thirdlargest = Integer.MIN_VALUE;
        int largest = Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array values: ");
        int arr[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            if (largest < arr[i]) {
                secondlargest = largest;
                largest = arr[i];
            }
            if (secondlargest < arr[i] && largest != arr[i]) {
                thirdlargest = secondlargest;
                secondlargest = arr[i];
                if (thirdlargest < arr[i] && secondlargest != arr[i])
                    thirdlargest = arr[i];
            }
            input.close();
        }
        System.out.println(
                "Second Largest number is: " + secondlargest + "\nThird largest number is=====" + thirdlargest);
    }
}
