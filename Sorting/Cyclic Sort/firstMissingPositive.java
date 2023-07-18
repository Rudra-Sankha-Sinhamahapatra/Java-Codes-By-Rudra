//Leetcode 41 Hard
//https://leetcode.com/problems/first-missing-positive/
//Amazon Question
public class firstMissingPositive {
    public static void main(String[] args) {
        int[]nums={3,4,-1,1};
        int result=FirstMissingPositive(nums);
        System.out.println("First Missing Positive Number is "+result);
    }
    public static int FirstMissingPositive(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i]<arr.length && arr[i]>0 && arr[i]!=arr[correct]){
                int temp=arr[i];
                arr[i]=arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }
        }
        for(int index=0;index<arr.length;index++){
            if(arr[index]!=index+1){
                           
                return index+1;
            }
            else if(index+1==arr.length){
                return index+2;
            }

        }
        return arr.length;
    }
}
