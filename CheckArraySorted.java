//Q-8check if given array  is sorted or not
public class CheckArraySorted {
    public static void main(String[] args) {
        boolean check = true;
        int arr[] = { 1, 2, 3, 4, 4, 5, 6 };
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                check = false;
                break;
            }
        }
        System.out.println(
                check);
    }
}
