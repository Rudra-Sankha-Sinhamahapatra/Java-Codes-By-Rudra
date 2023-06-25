public class Pr9 {
    public static void main(String[] args){
        int num=23597;
        int rev=0;
        while(num>0){
            int rem=num%10;
            num/=10;
          rev=(rev*10)+rem;
        }
        System.out.println("Reverse:"+rev);
    }
}
