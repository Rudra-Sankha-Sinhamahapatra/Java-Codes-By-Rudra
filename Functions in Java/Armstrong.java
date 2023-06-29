 import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       // System.out.println("Enter a number");
       // int n=input.nextInt();
        for(int i=100;i<1000;i++){
            if(isArmstrong(i)){
                System.out.println(i+" is a Armstrong number");
            }
        }
      input.close();
    }
static boolean isArmstrong(int n){
    int original=n;
    int sum=0;
    while(n>0){
        int rem=n%10;
        n=n/10;
        sum=sum+(rem*rem*rem);
    }
    if(sum == original){
        return sum==original;
    }
    return false;
}

}
