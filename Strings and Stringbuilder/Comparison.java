// package Strings and Stringbuilder;

public class Comparison {
   public static void main(String[] args) {
    String a="Rudra";
    String b="Rudra";
    //==
    System.out.println(a==b);//true
    String c=new String("Kunal");
    String d=new String("Kunal");

    System.out.println(c==d);//false

    System.out.println(c.equals(d));//true:only checking values

      String e=c;
    System.out.println(e==c);//true

    String f=new String("Kunal");
    String g=new String(" Kunal");

     System.out.println(f.equals(g));//false:because of extra space in g the values are now different
     
     System.out.println(a.charAt(0));//R
    } 
}
