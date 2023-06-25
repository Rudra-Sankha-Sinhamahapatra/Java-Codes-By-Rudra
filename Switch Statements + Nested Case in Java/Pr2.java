//Switch Case Statements
import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit name");
        String fruit = input.nextLine();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            // break is not necessary when using "->"

            case "Apple" -> System.out.println("A Red Tasty Fruit");

            case "Orange" -> System.out.println("A sweet round fruit");

            case "Banana" -> System.out.println("A long yellow or Green fruit");

            case "Grapes" -> System.out.println("Small green sweet fruit");

            default -> System.out.println("Invalid Input");
        }
        input.close();
    }
}
