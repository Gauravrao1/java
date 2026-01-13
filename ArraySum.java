//Q1 calculate the sum of all the element in given arrys
class Arraysexample {
    void sumofArray() {
        int[] arr = { 5, 3, 4, 55, 32, 5, 8, 9 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
}

public class ArraySum {
    public static void main(String[] args) {
        Arraysexample obj = new Arraysexample();
        obj.sumofArray();

    }
}