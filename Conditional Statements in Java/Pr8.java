//how many times 7 here(1385757879) find
public class Pr8 {
public static void main(String[] args){
    long num=1385757879l;
    long count=0;
    while(num>0){
     long rem=num%10;
     num/=10;
     if(rem==7){
        count++;
     }
    }
    System.out.println("here 7:"+count+"Times");
}
    
}

