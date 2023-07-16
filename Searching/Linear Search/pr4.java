import java.util.Scanner;

public class pr4 {
 public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the size of the array ");
    int size=scanner.nextInt();
    int[]arr=new int[size];
    System.out.println("Enter the elements of the array");
    for(int i=0;i<size;i++){
    arr[i]=scanner.nextInt();
    }
    System.out.println("Enter the start element");
    int start=scanner.nextInt();
    System.out.println("Enter the end element");
    int end=scanner.nextInt();
    System.out.println("Enter the target element");
    int target=scanner.nextInt();
    linear(arr,target,start,end);
    scanner.close();
 }    

 static void linear(int[]arr,int target,int start,int end){
    if(arr.length==0){
        System.out.println("Size of array cant be zero");
    }
    for(int i=start;i<end;i++){
        int element=target;
        if(arr[i]==element){
            System.out.println("Element "+target+" found on "+i+" index");
        }
    }
 }
}