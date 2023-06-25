import java.util.Scanner;
public class Pr5 {
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   System.out.println("Enter a character");
  //lets see
   char ch=input.next().charAt(0);
    if(ch>='a' && ch<='z'){
        System.out.println("It is a lowercase");
    }
    else if(ch>='A' && ch<='Z'){
        System.out.println("It is a Uppercase letter");
    }
    input.close();
    }
    
    
}
