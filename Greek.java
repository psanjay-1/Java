package Sanjay;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Greek {

    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
      System.out.println("Please enter number");
      int n=sc.nextInt();
      int r = 0;

      while(n>0)
      {
        n= n/10;
      
       r++;
      }
    
      System.out.println(r++);
    }
    
     
    
    
  }
  
