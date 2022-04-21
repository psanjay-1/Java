package Sanjay.Projects;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Fib {

    public static void main(String[]args){
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of fib");
        c=sc.nextInt();
        int a=0; int b=1; int sum; 
        System.out.print(a + ",");
        System.out.print(b + ",");
        for(int i=0;i<c;i++){
        System.out.print((sum=a+b) + ",");
        a=b;
        b=sum;

        }


    }
    
}
