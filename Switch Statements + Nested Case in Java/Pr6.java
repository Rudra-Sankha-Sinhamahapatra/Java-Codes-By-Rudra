import java.util.Scanner;

public class Pr6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter empId");
        int empId = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.println("Enter department");
        String department = input.nextLine();
        switch (empId) {
            case 1 -> System.out.println("Rudra Sankha");
            case 2 -> System.out.println("Rahul Jena");
            case 3 -> {
                System.out.println("Employee no 3");
                switch (department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management department");
                    default -> System.out.println("No department");
                }
            }
            default -> System.out.println("Enter correct empId");
        }

        input.close();
    }
}
