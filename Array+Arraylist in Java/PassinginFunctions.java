
import java.util.*;
public class PassinginFunctions {
    public static void main(String[] args) {
        int []nums={3,4,4,44};
        System.out.println(Arrays.toString(nums));
        change(nums);
         System.out.println(Arrays.toString(nums));
    }
    static void change(int[]arr){
        arr[0]=99;
    }
}
//Strings are immutable in java but arrays are mutable