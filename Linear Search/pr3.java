import java.util.Scanner;

public class pr3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String ");
        String name=scanner.next();
        System.out.println("Enter the searching character");
        char target=scanner.next().charAt(0);
       stringlinear(name,target);
       scanner.close();

    }
    static void stringlinear(String name,char target){
        
        if(name.length()==0){
            System.out.println("character not found");
        }
        if(name.length()!=0){
        for(int i=0;i<name.length();i++){
            
            char element=name.charAt(i);
            if(target==element){
                System.out.println("Character found on the String");
            }
        }
    }


    }
}
