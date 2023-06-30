import java.util.*;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 23;
        arr[1] = 25;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 5;
      System.out.println("Write the array elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
       for(int num:arr){
        System.out.print(num+" ");//here num represents elements of the array
       }
       System.out.println(Arrays.toString(arr));
        in.close();
    }
}
