import java.util.Arrays;

public class Stringmethods {
    public static void main(String[] args) {
        String name="Rudra Sankha";
        System.out.println(Arrays.toString(name.toCharArray()));
        
        System.out.println(name.indexOf('a'));

        System.out.println("  Rudra ".strip());

        System.out.println(Arrays.toString(name.split(" ")));
    } 
}
