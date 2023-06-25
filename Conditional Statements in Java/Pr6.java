//Fibonacci numbers program using for loop
import java.util.Scanner;
public class Pr6{
    public static void main(String[] args){
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the nth term");
    int n=input.nextInt();
    int first=0;
    int second=1;
    
    System.out.printf("The %dth fibonacci numbers are:",n);
    System.out.println(" ");
    System.out.println(first);
    System.out.println(second);
   for(int i=1;i<n-1;i++){
   //condition
    int fib=first+second;
    first=second;
    second=fib;
    System.out.println(fib);
   }
    input.close();    
    }
    }
