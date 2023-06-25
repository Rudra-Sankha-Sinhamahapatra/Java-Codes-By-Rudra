//Calculator program using if else
/* +,-,*,/,% and X for exit
 * Make a menu driven program
 * on the infinite loop while(true)
 * char op=input.next().trim().charAt(0);
 */
import java.util.Scanner;
public class Pr10 {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int ans=0;
      while(true){
    System.out.println("Press +,-,*,/,% to do operations and X to exit the operations\n");
    char op=input.next().trim().charAt(0);
    
        if(op=='+'|| op=='-'|| op=='*' || op=='/' || op=='%'){
     System.out.println("Enter two integers\n");
    int num1=input.nextInt();
    int num2=input.nextInt();
    System.out.println();
        if(op=='+'){
      ans=num1+num2;
      
        }
        
         if(op=='-'){
      ans=num1-num2;
      
        }
         if(op=='*'){
      ans=num1*num2;
      
        }
        if(op=='%'){
            ans=num1%num2;
    
        }
        if(op=='/'){
            if(num2!=0){
                ans=num1/num2;
            
            }
            else{
                System.out.println("2nd number cant be 0");
            
            }
        }
    }
        else if(op=='X'||op=='x'){
            System.out.println("Exiting the program");
        break;
        }
        //ook
     else{
            System.out.println("Invalid");
        }
        System.out.println(ans);
    }
    
    input.close();
    }

}
