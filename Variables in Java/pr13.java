import java.util.Scanner;
public class pr13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter celsius");
        float celsius=input.nextFloat();
        float fahrenheit=(celsius*1.8f)+32;
        System.out.println("Fahrenheit value:"+fahrenheit+" degree F");

        input.close();
    }
}
