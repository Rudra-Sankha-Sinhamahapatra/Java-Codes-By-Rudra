import java.util.Scanner;
//time complexity
public class Fibonacci{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the nth(index) fibonacci Number you want to search for:");
        int f=in.nextInt();
        System.out.println("The "+(f+1)+"th Fibonacci Number is "+fiboFormula(f));
        in.close();
    }
    static int fiboFormula(int n){
         return (int)((Math.pow(((1+Math.sqrt(5))/2),n)-Math.pow(((1-Math.sqrt(5))/2),n))/ Math.sqrt(5));
    }

}