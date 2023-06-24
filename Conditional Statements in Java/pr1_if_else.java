//package com.Rudra;

public class pr1_if_else {
public static void main(String[] args){
    /*
     * Syntax of if statements
     * if(boolean expression T or F){
     * //body
     * }
     * else{
     * //do this
     * }
     */
     int salary=26400;
     /* 
         if (salary>10000) {
        salary=salary+2000;
    }
    else{
        salary=salary+1000;
    }
    */
    //Multiple if else
    if(salary<20000){
        salary+=2000;
    }
    else if(salary>20000){
        salary+=3000;
    }
    else{
        salary+=1000;
    }

    System.out.println("New Salary="+salary);

}    
}
