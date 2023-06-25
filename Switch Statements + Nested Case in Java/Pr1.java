
//Switch Case Statements
import java.util.Scanner;
public class Pr1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a fruit name");
        String fruit=input.nextLine();
        switch(fruit){
            case "Mango":
            System.out.println("King of fruits");
            break;
        //break is important
            case "Apple":
            System.out.println("A Red Tasty Fruit");
            break;

            case "Orange":
            System.out.println("A sweet round fruit");
            break;

            case "Banana":
            System.out.println("A long yello or Green fruit");
            break;

            case "Grapes":
            System.out.println("Small green sweet fruit");
            break;

            default:
            System.out.println("Invalid Input");
        }
        input.close();
     }
 }
    

