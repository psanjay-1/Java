package Sanjay.Projects;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Armstrong{


    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number");
        int n=sc.nextInt();
        int m=n;
        int r = 0;
        int sum=0;
  
        while(n>0)
        {
          r= n%10;
          n= n/10;
          sum=sum+r*r*r;
         
        }
      
        if(sum==m){

        System.out.println("YES");
      }
      
      else
      
          System.out.println("NO");
      
    
  }
}