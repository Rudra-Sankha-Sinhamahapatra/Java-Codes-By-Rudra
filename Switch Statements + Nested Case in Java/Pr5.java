  import java.util.Scanner;
public class Pr5 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("X. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextLine().charAt(0);

            switch (choice) {
                case '1':
                    System.out.print("Enter the first number: ");
                    double num1 = input.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = input.nextDouble();
                    input.nextLine(); // Consume the newline character

                    double additionResult = num1 + num2;
                    System.out.println("Result: " + additionResult);
                    break;
                case '2':
                    System.out.print("Enter the first number: ");
                    double num3 = input.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num4 = input.nextDouble();
                    input.nextLine(); // Consume the newline character

                    double subtractionResult = num3 - num4;
                    System.out.println("Result: " + subtractionResult);
                    break;
                case '3':
                    System.out.print("Enter the first number: ");
                    double num5 = input.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num6 = input.nextDouble();
                    input.nextLine(); // Consume the newline character

                    double multiplicationResult = num5 * num6;
                    System.out.println("Result: " + multiplicationResult);
                    break;
                case '4':
                    System.out.print("Enter the dividend: ");
                    double dividend = input.nextDouble();
                    System.out.print("Enter the divisor: ");
                    double divisor = input.nextDouble();
                    input.nextLine(); // Consume the newline character

                    if (divisor == 0) {
                        System.out.println("Error: Division by zero!");
                    } else {
                        double divisionResult = dividend / divisor;
                        System.out.println("Result: " + divisionResult);
                    }
                    break;
                case 'X':
                case 'x':
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

            System.out.println();
        } while (choice != 'X' && choice != 'x');

        input.close();
    }
}


