package Sanjay.Projects;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Reverseanumber {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Please Enter the number");
    int n= sc.nextInt();
    int rev=0, r;

    

    while(n>0){
    r=n%10;
    n=n/10;   
    
    rev=rev*10+r;

    

    }
    System.out.println(rev);

}
}