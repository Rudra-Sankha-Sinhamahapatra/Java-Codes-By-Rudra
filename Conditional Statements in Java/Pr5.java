import java.util.Scanner;
public class Pr5 {
    public static void main(String[] args) {
   Scanner input=new Scanner(System.in);
   char ch;
   System.out.println("Enter a character");
   ch=input.next().charAt(0);
    if(ch>='a' && ch<='z'){
        System.out.println("It is a lowercase");
    }
    else if(ch>='A' && ch<='Z'){
        System.out.println("It is a Uppercase letter");
    }
    }
    
}
