//reverse the array even or odd

public class ArrayReverser {
    // public static void main(String[] args) {
    // int []arr={1,3,4,5,5,7,8,4};
    // for (int i=arr.length-1;i>=0;i--){
    // System.out.print(arr[i]);}
    static void printarry(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    static int[] raversearray(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            arr[j++] = arr[i];

        }
        return ans;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int[] ans = raversearray(arr);
        printarry(ans);

    }
}
