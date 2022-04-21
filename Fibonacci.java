package Sanjay.Projects;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter the number");
        int c= sc.nextInt();
        int a=0, b=1, d;
        System.out.print(a + ",");
        System.out.print(b + ",");
        for(int i=0; i<c; i++){
            System.out.print((d=a+b) + ",");
            a=b;
            b=d;



        }
}
}