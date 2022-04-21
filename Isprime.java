package Sanjay.Projects;

import java.util.Scanner;


public class Isprime {

    static boolean Prime(int n, int m){
for(int i=0; i<n; i++){

    if(n%i==0)
    return false;
}

    return true;
    }
public static void main(String[]args){

Scanner sc= new Scanner(System.in);
System.out.println("Please enter a number:" );
int num= sc.nextInt();
int num1=sc.nextInt();

if(Prime(num, num1)){

    System.out.println("Yes it is prime Number");
}
else
System.out.println("No it is not a Prime Number");

}


    }
    

