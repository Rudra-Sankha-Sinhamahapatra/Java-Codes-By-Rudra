import java.util.*;

public class linearMultiple{
    public static void main(String[] args) {
       int[]arr={1,2,4,5};
       int target=4;
       System.out.println(find(arr,target,0));
       findAllIndex(arr, 4, 0);
       System.out.println("The index is "+list);
    }
    static boolean find(int[]arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
 static ArrayList<Integer> list=new ArrayList<>();
    static void findAllIndex(int[]arr,int target,int index){
        if(index==arr.length){
            return;
        }
        if(arr[index]==target){
           list.add(index);
        } 
        findAllIndex(arr, target, index+1);
    

}
}