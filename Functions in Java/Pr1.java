import java.util.Scanner;

public class Pr1 {
    // Adding two numbers using functions

    static int mul() {
        Scanner input = new Scanner(System.in);
        int num1, num2, mul;
        System.out.println("Enter two Numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        mul = num1 * num2;
        input.close(); // Close the Scanner
        return mul;
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter two Numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();

        sum = num1 + num2;
        System.out.println("Sum:" + sum);
        in.close(); // Close the Scanner
    }

    static int dif(int a, int b) {
        int dif = a - b;
        return dif;
    }

    public static void main(String[] args) {
        sum();
        int ans = dif(40, 30);
        System.out.println(ans);
        int a = mul();
        System.out.println("Multiplication:" + a);
    }
}
