// package Sorting.Cyclic Sort;
//Google Question
//448. Find All Numbers Disappeared in an Array
//Easy
// Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 import java.util.*;
public class disappearedNumbers {
    public static void main(String[] args) {
        int[]arr={4,3,2,7,8,2,3,1};
        List<Integer> answer=findDisappearedNumbers(arr);
        System.out.println(answer);
    }
    public static List<Integer> findDisappearedNumbers(int[]arr){
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
             ans.add(index+1);
            }
        }
        return ans;
    }
}
