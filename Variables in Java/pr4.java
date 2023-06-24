public class pr4 {
    public static void main(String[] args){
        int a=10;
        int b=5;
        int ans1=a*b/a-b;
        int ans2=(a*b)/(a-b);
        System.out.println("wrong answer :"+ans1);
        System.out.println("Right Answer:"+ans2);
    }
    //operator priority */%>-+
    //- & + stands in same priority
    
}
