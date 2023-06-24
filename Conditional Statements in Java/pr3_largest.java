//finding largest among three numbers
import java.util.Scanner;

public class pr3_largest {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        float a=input.nextFloat();
        float b=input.nextFloat();
        float c=input.nextFloat();
        if(a>b && a>c){
            System.out.println(a+" is largest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is the largest");
        }
        else{
            System.out.println(c+" is the largest");
        }
         input.close();
    }
   
    
}
