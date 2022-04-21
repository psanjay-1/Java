package Sanjay.Projects;

import javax.lang.model.util.ElementScanner14;
import javax.print.attribute.standard.MediaSize.JIS;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args)
    
    {
        
        int[][]A={{1,2,3}, {2,3,4}, {4,5,6}};
        int[][]B={{1,2,3}, {2,3,4}, {4,5,6}};
        int C [][] ;
        C=new int[3][3];
        

        for (int i=0; i<3; i++)
            for(int j=0; j<3;j++){
                C[i][j]=A[i][j]*B[i][j];
                
                

            }
            for (int x[]:C){
                for (int y:x){
            System.out.print(y +" ");
           
        }
        System.out.println(" ");

    }
    }
}
