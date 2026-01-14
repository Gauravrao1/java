import java.util.Arrays;

//Q-10 make an array  from given array where only present second last greatest and second  smallest index
//of any given array
public class SecondMinMaxFinder {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 5, 2, 4, 6, 8, 3, 4, 5, };
        Arrays.sort(arr);
        int ans[] = { arr[arr.length - 2], arr[1] };
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
