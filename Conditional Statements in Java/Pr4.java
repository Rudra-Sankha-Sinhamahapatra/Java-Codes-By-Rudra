import java.util.Scanner;
public class Pr4 {
    
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
       System.out.println("Enter three integers");
        int a=input.nextInt();
        int b=input.nextInt();
        int c=input.nextInt();
       int max=Math.max(c,Math.max(a,b));
      System.out.println(max);
      input.close();
    }
}
