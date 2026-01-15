import java.util.Scanner;

//Q-14 find second -largest element in given array;
public class java14 {
static int findmax(int  arr[]){
    int max=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
return max;
}static int secodmax(int[]arr){
    int mx=findmax(arr);
    for (int i=0;i<arr.length;i++) {
        if (arr[i] == mx) {
            arr[i] = Integer.MIN_VALUE;

        }
    }int secodmax=findmax(arr);
    return secodmax;
     }

     public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter size of array");
         int n= sc.nextInt();
         System.out.println("enter arr");
         int arr[]=new int[n];
         for (int i=0;i<n;i++){
             arr[i]= sc.nextInt();
         }
         System.out.println("second maximum element: "+ secodmax(arr));

     }
}