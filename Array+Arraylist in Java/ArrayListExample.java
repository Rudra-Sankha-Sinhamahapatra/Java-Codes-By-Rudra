import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        //Syntax
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(67);
         list.add(6);
          list.add(7);
           list.add(678);
            list.add(8);
            System.out.println(list.contains(678));
            list.set(0, 24);
            list.remove(2);
     System.out.println(list);
     Scanner in=new Scanner(System.in);
     System.out.println("Add 5 elements to the array list");
     for(int i=0;i<5;i++){
        list.add(in.nextInt());
     }
     System.out.println("First few elements here:");
     //get item at any index
     for (int i = 0; i < 5; i++) {
        System.out.println(list.get(i));//pass index here,list[index] syntax will not work here
     }
       System.out.println("The modified Arraylist is now");
        System.out.print(list+" ");
     
     in.close();
    }
}
