import java.util.*;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
    //    // int[][]arr=new int[3][];
    //    int[][]arr={
    //     {1,2,3},//0th index
    //     {4,5},//1st index
    //     {6,7,8,9}//2nd index -> arr[2]={6,7,8,9};
       //};
       
       System.out.println("enter number of rows");
       int m=in.nextInt();
       System.out.println("Enter number of columns");
       int n=in.nextInt();
       int [][] arr=new int[m][n];
      System.out.println(arr.length);//no of rows
       //input
       System.out.println("Enter the elements for the rows and columns");
       for(int row=0;row< arr.length;row++){
       //for each column in every row
       for(int col=0;col<arr[row].length;col++){
        arr[row][col]=in.nextInt();
       }
       }
      //output
    //      for(int row=0;row< arr.length;row++){
    //    //for each column in every row
    //    for(int col=0;col<arr[row].length;col++){
    //  System.out.print(arr[row][col]+" ");
   
    //    }
    //   System.out.println();
    //    }
    for(int[]a:arr){
        System.out.println(Arrays.toString(a));
    }
      in.close();
    }
}
