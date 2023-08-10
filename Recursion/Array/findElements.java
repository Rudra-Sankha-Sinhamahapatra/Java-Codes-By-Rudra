//Linear Search Using Recursion

import java.util.Scanner;

public class findElements {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the target Element");
        int target=in.nextInt();
        boolean result=find(arr, target, 0);
        if(result==true){
            System.out.println("Element found");
        }
        else if(result==false){
            System.out.println("Eleemnt not found");
        }
        else{
            System.out.println("Invalid");
        }
        System.out.println("Target element found:"+find(arr, target, 0));
        in.close();
    }
    static boolean find(int[]arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,index+1);
    }
}
