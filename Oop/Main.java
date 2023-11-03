import java.util.*;

public class Main {
   public static void main(String[] args) {
      // store 5 roll nos
      // int[]numbers=new int[5];

      // store 5 names
      // String[]names=new String[5];

      // data of 5 students : (roll no,name,marks)
      // int[]rno=new int[5];
      // String[]name=new String[5];
      // float[]marks=new float[5];

      Student[] students = new Student[5];
      // System.out.println(Arrays.toString(students));
      // returns 5 students null
      //   Student Kunal;
      //   Kunal=new Student();
     Student Kunal = new Student();
     System.out.println(Kunal);
      System.out.println(Kunal.rno);
       System.out.println(Kunal.name);
        System.out.println(Kunal.marks);

   }

   
}
// create a class
   // for every single student
  class Student {
      int rno;
      String name;
      float marks;
   }