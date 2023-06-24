import java.util.Scanner;
public class pr2_loops {
    public static void main(String[] args){
        //Print numbers from 1 to 5 using for loop
      /*  for(int i=1;i<=5;i++){
            System.out.print("\t"+i);
        }
         */
        //Print numbers 1 to n
       Scanner input=new Scanner(System.in);
       /*  System.out.println("Enter the nth number");
        int n=input.nextInt();
        for (int i = 1; i<=n; i++) {
       //System.out.println(i);
       System.out.println("Hello World");
        }
        */
        //using while loop
        /*int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        */
        //using do while loop
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<11);
        input.close();
    }
    

}
