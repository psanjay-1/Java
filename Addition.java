package Sanjay;

import java.util.Scanner;

public class Addition {

    public static void main(String[] args){

    
    Scanner sc= new Scanner(System.in);
    System.out.println("Please enter the two numbers");
    int a=sc.nextInt();
    int b=sc.nextInt();
    sc.nextLine();
    int c=a+b;
    int d=a-b;
    int e=a*b;
    int f=a/b;
    System.out.println("Please enter option in words");
    String s= sc.nextLine();

    switch(s){

    
        case "Add": System.out.println(c);
        break;
        case "Multiply": System.out.println(e);
        break;
        case "Divide": System.out.println(f);
        break;
        case "Subtract": System.out.println(d);
        break;

    }

        

    }











}



