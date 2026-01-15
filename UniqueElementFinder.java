//Q-13//pattern array manipulation
//find the unique number in given Array where all the element are  being
//repeated twice with one value being unique


import java.util.Scanner;

public class java13 {
    static int findunique(int[] arr) {
        int ans = -1;
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your array size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("enter"+n+"elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("unique element: " + findunique(arr));

    }

}
