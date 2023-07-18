//https://leetcode.com/problems/find-all-duplicates-in-an-array/
//medium leetcode 442 finding all duplicates
import java.util.*;

public class allDuplicates {
 public static void main(String[] args) {
    int[]  nums = {4,3,2,7,7,2,3,4};
    List<Integer> answer=findDuplicates(nums);
    System.out.println("Duplicate Numbers are "+answer);

 }  
     public static List<Integer> findDuplicates(int[] arr) {
      
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
     List<Integer> ans=new ArrayList<>();
     for(int index=0;index<arr.length;index++){
        if(arr[index]!=index+1){
            ans.add(arr[index]);
        }
     }    
     return ans;
    }

}
