// package Sorting.Cyclic Sort;
//Leetcode 268: Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//Amazon Question
 //source:https://leetcode.com/problems/missing-number/


public class missingnumber {
    public static void main(String[] args) {
        int[]arr={3,2,1,0};
        int missingNumber=sort(arr);
       System.out.println("Missing Number:"+missingNumber);

    }
    static int sort(int[]arr){
        int i=0;
        while(i<arr.length){
        int correct=arr[i];

        if(arr[i]<arr.length && arr[i]!=arr[correct]){
             
         
            int temp=arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
         
        }
        else{
            i++;
        }
        }
                //searching
        for(int j=0;j<arr.length;j++){
        if(arr[j]!=j){
        return j;
        }
        }
        //case 2
        return arr.length;
        }
        
    }


