//Q-6find the last occurrence of an element x in given array

public class LastOccurrenceIndex {
    public static void main(String[] args) {
        int X = 5;
        int locc = -1;
        int[] arr = { 1, 2, 3, 4, 5, 6, 65, 4, 4, 4, 5, 6 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == X) {
                locc = i;
            }
        }
        System.out.println(locc);
    }
}
