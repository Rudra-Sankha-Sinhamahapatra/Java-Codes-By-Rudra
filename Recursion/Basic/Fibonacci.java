import java.util.Scanner;

public class Fibonacci{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the nth fibonacci Number you want to search for:");
        int f=in.nextInt();
        System.out.println("The "+f+"th Fibonacci Number is "+fibo(f));
        in.close();
    }
    static int fibo(int n){
       //base condition
       if(n<2){
         return n;
       }
    
        return fibo(n-1) + fibo(n-2);
    }
}