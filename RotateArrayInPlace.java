import java.util.Scanner;

//Q-21 Rotate the given array 'a' by k steps,where k is non-negative 'without using extra space
public class RotateArrayInPlace {
    static  void reverse(int[]arr,int st, int end){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j++;
        }
    }static  void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static  void rotate(int[]arr,int k){
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }

static  void printArray(int arr []) {
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
        System.out.println("Array after rotation");

    }}