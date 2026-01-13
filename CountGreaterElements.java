//Q-7 count the number of elements strictly greater than value x
public class CountGreaterElements {
    public static void main(String[] args) {
        int x = 5;
        int count = 0;
        int arr[] = { 2, 4, 5, 6, 4, 7, 5, 3, 8 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > x) {
                count++;

            }
        }
        System.out.println(count);
    }
}
