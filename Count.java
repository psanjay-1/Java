package Sanjay.Projects;

import javax.lang.model.util.ElementScanner14;
import javax.print.attribute.standard.MediaSize.JIS;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Count {
  static void max(int A[], int ind, int value ){
    A[ind]=value;
   }
   


    

    public static void main(String[] args){
        int A[]={1,2,3,4,5,6,7,8};
        max(A,2,20);
        max(A,3,25);
        max(A,4,27);


        for(int x:A){
        System.out.print(x +"  ");
        }
    }


}