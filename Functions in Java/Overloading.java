public class Overloading {
    public static void main(String[] args) {
        fun(78);
        fun("Rudra");
    }
    static void fun(int a){
        System.out.println("FIrst One");
     System.out.println(a);
    }
     static void fun(String name){
        System.out.println("Second one");
        System.out.println(name);
    }
}
