  import java.util.Scanner;
public class Pr7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter empId");
        int empId = input.nextInt();
        input.nextLine(); // Consume the newline character

     System.out.println("Enter department");
        String department = input.nextLine();
        switch (empId) {
            case 1:
                System.out.println("Rudra Sankha");
                break;
            case 2:
                System.out.println("Rahul Jena");
                break;
            case 3:
            System.out.println("Employee no 3");
                switch (department) {
                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("No department");
                        break;
                }
                break;
            default:
                System.out.println("Enter correct empId");
        }

        input.close();
    }
}
