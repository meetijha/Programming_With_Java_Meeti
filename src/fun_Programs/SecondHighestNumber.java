package fun_Programs;

import java.util.Scanner;

import java.util.Scanner;

public class SecondHighestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++) {
            System.out.println("Enter element -->" + i);
            arr[i] = scanner.nextInt();
        }

        System.out.println("Second highest number in this array is " + getSecongHighestNumber(arr));
        scanner.close();
    }

    public static int getSecongHighestNumber(int[] arr) {
        int secHighest = 0;
        int highest = 0;
        if (arr[0] < arr[1]) {
            secHighest = arr[0];
            highest = arr[1];
        } else {
            secHighest = arr[1];
            highest = arr[0];
        }
        if (arr.length > 2) {
            for (int i = 2; i <= arr.length - 1; i++) {
                if (arr[i] > highest && arr[i] > secHighest) {
                    secHighest = highest;
                    highest = arr[i];
                }

                if (arr[i] > secHighest && arr[i] < highest) {
                    secHighest = arr[i];
                }
            }
        }

        return secHighest;
    }
}



