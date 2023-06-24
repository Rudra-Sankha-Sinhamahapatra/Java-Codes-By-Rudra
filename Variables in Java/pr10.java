//Typecasting in java
import java.util.Scanner;
public class pr10 {
   public static void main(String[] args){
Scanner input=new Scanner(System.in);
 //float num=input.nextFloat();
 //System.out.println(num);
 //type casting
 int num=(int)(78.88f);
 System.out.println(num);

 //Automatic type promotion in expressions
 int a=256;
 byte b=(byte)(a); //0 to 256 find nearest value 128=-128 127=127 257=1 256=0
 System.out.println(b);
 input.close();
   }
}
