import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[]arr={77,90,87,777,9,6};
        System.out.println("The maximum item in the array is "+max(arr));
        System.out.println("Enter the starting range");
        int m=in.nextInt();
        System.out.println("Enter the ending range ");
        int n=in.nextInt();
        System.out.println("The maximum item in the range the array is "+maxRange(arr,m,n));
        in.close();
    }
    static int maxRange(int[] arr,int start,int end){
        if(end>start){
            return -1;
        }
        if(arr==null){
            return -1;
        }
        int max=arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int max(int[] arr){
        if(arr.length==0){
            return -1;
        }
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
