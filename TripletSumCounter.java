//Q-12count the number of triplets whose sum is equal to given value x;

public class TripletSumCounter {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 4, 2, 2 };
        int target = 12;
        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }

        }
        System.out.println(ans);

    }
}