    import java.util.Scanner;
public class Pr4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day (1-7): ");
        int day = input.nextInt();

        switch (day) {
            case 1, 5, 7 -> System.out.println("Holiday");
            case 2, 3, 4, 6 -> System.out.println("Work day");
            default -> System.out.println("Invalid");
        }

        input.close();
    }
}


