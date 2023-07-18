import java.util.*;
public class cyclicsort{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=in.nextInt();
        int[]arr=new int[n];
        System.out.println("Enter the elements of the array(1 to n(n means size of the array) only)");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        sort(arr);
        System.out.println("The sorted array is "+Arrays.toString(arr));
        in.close();

    }
    static void sort(int[]arr){
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
    }
}