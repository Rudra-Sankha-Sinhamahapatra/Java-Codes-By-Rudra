class EvenDigits {
    public static void main(String[] args) {
        int nums[]={12,345,2,6,7896};
        System.out.println("Number of even numbers int the array: "+findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check whether  a number contains even digit or not
    private static boolean even(int num){
        int numberofDigits=digits(num);
        if(numberofDigits % 2 ==0){
            return true;
        }
        return false;
}
//function to count number of digits
static int digits(int num){
int count=0;
while(num>0){
    count++;
    num/=10;
}
return count;
}
}