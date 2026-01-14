//Q3-search the given element xin the array if present then return index value else return -1;

class arrysexample {
    static void serchinarrrys() {
        int[] arr = { 5, 6, 7, 4, 6, 8, 8, 9, 2 };
        int x = 9;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;

            }
        }
        System.out.println(ans);
    }
}

public class LinearSearch {
    public static void main(String[] args) {
        arrysexample.serchinarrrys();
    }
}
