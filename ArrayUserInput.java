
//arrys input in java

import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[12];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = obj.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}