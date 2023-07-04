public class pr1{
    public static void main(String[] args) {
       int[] nums={12,42,93,64,7};
       int target=7;
       if(target==-1){
      System.out.println("-1 found in the array");
       }
       else{
       int ans=linearSearch(nums, target);
       System.out.println(ans+" found in the array");
    }
}
    static int linearSearch(int[] arr,int target){
if(arr.length == 0){
    return -1;
}
//run  a for loop
 for(int index=0;index<arr.length;index++){
    int element=arr[index];
    if(element==target){
        return target;
    }
    

 }
 return -1;
    }
}