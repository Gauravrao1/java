
//Q-9 make an array  from given array where only present last greatest and first smallest index
//of any given array
import java.util.Arrays;

public class MinMaxFinder {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 3, 4, 5, 6 };
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + ",");
        }
    }
}
