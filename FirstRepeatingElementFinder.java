import java.util.Scanner;

//Q-15 Given array consisting of integer. return the first value that is repeating in this array.if no value is being repeated return -1
public class java15 {
    static int smilearelement(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];

                }
            }
        }
return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array lenght");
        int n = sc.nextInt();
        System.out.println("Enter your Array  element ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("your similer  element is "+smilearelement(arr));
    }

}


