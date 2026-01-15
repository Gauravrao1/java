//Q-11find the total number of pair in array whose sum  is equal to the given value x
class Arrysproblem {
    void sumequal() {
        int arr[] = { 1, 2, 3, 4, 15, 5, 4, 4, 3, 2 };
        int target = 20;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

public class TargetSumFinder {
    public static void main(String[] args) {
        Arrysproblem obj = new Arrysproblem();
        obj.sumequal();
    }
}
