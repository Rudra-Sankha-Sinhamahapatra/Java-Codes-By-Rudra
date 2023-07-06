import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        System.out.println("Enter the elements of the array in ascending order");
        int[]nums=new int[n];
        for (int i = 0; i < n; i++) {
            nums[i]=in.nextInt();
        }
 
        System.out.println("Enter the element to search");
        int target=in.nextInt();
               if(binarySearch(nums,target)==-1){
            System.out.println("Element not found");
        }
        else if(binarySearch(nums, target)>=0){
       System.out.println( "Element found at Index "+binarySearch(nums, target));
       in.close();
    }
}
    static int binarySearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //find thr middle element
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            } else if(target>arr[mid]){
                start=mid+1;            
            }
            else{
                //ans found
                return mid;
            }

            }
            return -1;
        }
        
    }
