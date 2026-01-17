import java.util.Scanner;

// Sort an array containing only 0s and 1s in-place using a two-pointer sweep
public class SortZeroesAndOnes {

        private static void sortZeroesAndOnes(int[] arr) {
                int left = 0;
                int right = arr.length - 1;

                while (left < right) {
                        while (left < right && arr[left] == 0) {
                                left++;
                        }
                        while (left < right && arr[right] == 1) {
                                right--;
                        }

                        if (left < right) {
                                int temp = arr[left];
                                arr[left] = arr[right];
                                arr[right] = temp;
                                left++;
                                right--;
                        }
                }
        }

        private static void printArray(int[] arr) {
                for (int value : arr) {
                        System.out.print(value + " ");
                }
                System.out.println();
        }

        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                try {
                        System.out.print("Enter array size: ");
                        int n = sc.nextInt();

                        int[] arr = new int[n];
                        System.out.println("Enter " + n + " elements (0 or 1):");
                        for (int i = 0; i < n; i++) {
                                arr[i] = sc.nextInt();
                        }

                        System.out.println("Original array:");
                        printArray(arr);

                        sortZeroesAndOnes(arr);

                        System.out.println("Sorted array:");
                        printArray(arr);
                } finally {
                        sc.close();
                }
        }
}