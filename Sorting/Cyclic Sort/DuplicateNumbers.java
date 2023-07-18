// package Sorting.Cyclic Sort;
//Medium
//Amazon Question
//Find Duplicate Numbers in an array range 1 to n
//Leetcode 287
//https://leetcode.com/problems/find-the-duplicate-number/
public class DuplicateNumbers {
    public static void main(String[] args) {
        int[]arr={3,1,3,4,2};
        int answer=findDuplicate(arr);
        System.out.println(answer);
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            int check=nums[i]-1;
            if(nums[i]!=nums[check]){
                int temp=nums[i];
                nums[i]=nums[check];
                nums[check]=temp;        
          }
          else{
            i++;
          }

        }
       int ans=1;
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
            ans=(nums[index]);
            }
        }
        return ans;
    }
    
}
