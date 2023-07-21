// package Strings and Stringbuilder;
import java.util.*;
public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');//will take the ascii values of a and b a=97,b=98 ..result=195
        System.out.println("a"+"b");//will concatenate the string //ab
        System.out.println('a'+3);//97+3=100
        System.out.println ((char)('a'+3));//will return d

        System.out.println("a"+1);//a1 because will not convert a into ascii value this time
       //Integer will be converted to Integer that will call toString method 
    
         System.out.println("Rudra"+new ArrayList<>());//Rudra[]
        //  System.out.println("Rudra"+new Integer(56));//Rudra56

        // System.out.println(new Integer(56)+new ArrayList<>());//error cant be added
        // System.out.println(new Integer(56)+""+new ArrayList<>());//56[] this will work because of the empty string between these two
  
        
    }
}
