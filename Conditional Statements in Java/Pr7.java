//Fibonacci numbers program using while loop
import java.util.Scanner;
public class Pr7 {
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
    
    int i=3;
    while(i<=n){
     int fib=first+second;
    first=second;
    second=fib;
    i++;
System.out.println(fib);
    }
    input.close();
}
}
