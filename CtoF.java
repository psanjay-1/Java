package Sanjay.Projects;
import java.util.Scanner;

public class CtoF {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter Celcius");
        int a=sc.nextInt();
        int b;


        b=((a * 9/5) + 32);

        System.out.println(b);


    }
    
}
