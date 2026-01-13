//Q-2 Calculate the maximum value out of all the element in arrys;
class Arrysexample {
    static void gre() {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}

public class ArrayMaxFinder {
    public static void main(String[] args) {
        Arrysexample.gre();
    }
}
