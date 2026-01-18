import java.sql.SQLOutput;
import java.util.*;

public class IntroToMethods{
    public static void printhelloworld() { // define here class
        System.out.println("hello word");

    }

    public static void sum(int a, int b) { // function with parameter
        Scanner obj = new Scanner(System.in);
        int sum = a + b;
        System.out.println("sum is" + sum);

    }

    public static void main(String args[]) {
        printhelloworld();
        printhelloworld();
        Scanner obj = new Scanner(System.in);
        int a = obj.nextInt();
        int b = obj.nextInt();
        sum(a, b);// (arguments)
    }
}
