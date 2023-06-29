import java.util.Scanner;

public class Pr2 {
    public static void main(String[] args) {
        String message = great();
        System.out.println(message);
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Name");
        String naam=input.nextLine();
        String personal=myGreet(naam);
        System.out.println(personal);
        input.close();
    }
    static String myGreet(String name){
      String message="Hello " + name;
      return message;
    }
    static String great(){
        String green="leaf";
        return green;
    }
    
}
