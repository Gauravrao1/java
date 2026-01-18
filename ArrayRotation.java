import java.util.Scanner;

//Q-21 Rotate the given array 'a' by k steps,where k is non negative
public class ArrayRotation {
    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int j = 0;
        int[] ans = new int[n];
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];

        }
        return ans;
    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter arrya size");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("enter k: ");
        int k = sc.nextInt();
        System.out.println("original array");
        printArray(arr);
        int[] ans = rotate(arr, k);
        System.out.println("Array after rotation");
        printArray(ans);

    }

}
