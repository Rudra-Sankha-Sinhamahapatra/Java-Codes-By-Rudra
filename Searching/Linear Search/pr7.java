public class pr7 {
  public static void main(String[] args) {
    int[]nums={23,45,67,333,24,3,5,3,67,90};
    System.out.println("Even numbers in the array: "+findNumbers(nums));
  }
    public static int findNumbers(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int digit=0;;
            while(nums[i]>0){
                digit++;
                nums[i]/=10;
            }
        
            if(digit%2==0){
                ans++;;
            }
        }
        return ans;
    }
}
    

