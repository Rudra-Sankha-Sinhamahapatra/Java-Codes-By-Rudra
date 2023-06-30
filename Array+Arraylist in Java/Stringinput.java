import java.util.*;

public class Stringinput {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[]str=new String[4];
        System.out.println("Enter the Strings");
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        for(int i=0;i<str.length;i++){
            System.out.print(str[i]+" ");
        }
        //modify
        str[1]="Kunal";
        System.out.println(Arrays.toString(str));
        
        in.close();
    }
    
}
