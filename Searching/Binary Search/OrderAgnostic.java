
import java.util.Scanner;
public class OrderAgnostic {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        System.out.println("Enter the elements of the array");
        int[]nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }
 
        System.out.println("Enter the element to search");
        int target=in.nextInt();
               if(orderAgnostic(nums,target)==-1){
            System.out.println("Element not found");
        }
        else if(orderAgnostic(nums, target)>=0){
       System.out.println( "Element found at Index "+orderAgnostic(nums, target));
      
    }
     in.close();
    }
    static int orderAgnostic(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        boolean isAsc=arr[start]<arr[end];
        while(start<=end){
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return target;
        }
        if(isAsc){
      
        if(target<arr[mid]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    } else{
        if(target>arr[mid]){
            end=mid-1;
        }else{
            start=mid+1;
        }
    }
}
return -1;
    }
}