//Easy Leetcode 645
//https://leetcode.com/problems/set-mismatch/

import java.util.*;

public class setMismatch {
    public static void main(String[] args) {
        int[]nums={1,2,2,4};
        int[]ar=findErrorNums(nums);
        System.out.println(Arrays.toString(ar));
    }
    public static int[] findErrorNums(int[] arr) {
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
        int missing=0;
        int duplicate=0;
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                missing=index+1;
                duplicate=arr[index];
            }
        }
        int []ar={duplicate,missing};
        
        return ar; 
    }
    
}
