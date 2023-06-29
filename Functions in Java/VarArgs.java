import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2,3,4,5,4,4,44,444,56,89,4637);
        fun(2,3,"Rudra","Kunal","Tanay");
    }
    //Variable arguments should be at the end they cant be like static void multiple(String ...v,int a,int b) they have to be like static void multiple(int a,int b,String ...v)
    static void fun(int a,int b,String ...v){
        System.out.println(a);
     System.out.println(Arrays.toString(v));
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
