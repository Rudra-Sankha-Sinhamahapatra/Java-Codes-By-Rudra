//finding minimum element in the array
import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=in.nextInt();
        int[]arr=new int[size];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
      min(arr);
  
        in.close();

    }
    static void min(int[]arr){
        if(arr.length==0){
            System.out.println("Size of array cant be zero");
        } 
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
           
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum element in the array is "+min);
       
    }
}
