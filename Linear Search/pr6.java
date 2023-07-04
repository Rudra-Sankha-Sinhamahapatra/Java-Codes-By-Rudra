//!.Searching in 2D Array
//2.Maximum item in 2D Array

import java.util.Scanner;

public class pr6{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int row=in.nextInt();
        System.out.println("Enter the no of the columns");
        int col=in.nextInt();
        int[][]arr=new int[row][col];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
            arr[i][j]=in.nextInt();
            }
        }
        System.out.println("Enter the element to search");
        int target=in.nextInt();
       linear(arr,target);
       max(arr);
       in.close();
    }
    static void linear(int[][]arr,int target){
        if(arr.length==0){
            System.out.println("item not found");
        }
        for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==target){
                System.out.println("Element "+target+" found in the 2D array");
            }
        }
        }
    }
    static void max(int[][]arr){
        if(arr.length==0){
            System.out.println("Length of the array cant be zero");
        }
        int max=Integer.MIN_VALUE;
         
   for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[i].length;j++){
        if(max<arr[i][j]){
            max=arr[i][j];
        }
    }
   }
   System.out.println("Maximum item in the 2D Array is "+max);
}
}
