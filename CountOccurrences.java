//Q-5 count the number of occurrence in array in any given arrays
public class CountOccurrences {
    public static void main(String[] args) {
        int x = 5;
        int count = 0;
        int arr[] = { 1, 3, 5, 5, 67, 8, 7, 6, 45, 5, 5, 5, };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;

            }
        }
        System.out.println(count);
    }
}
