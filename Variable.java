package Sanjay.Projects;

public class Variable

{

static int Variable2(int ...A)
    
    {

    int max=0;
    for(int i=0; i<A.length-1; i++)
        max=A[i]+ A[i+1];
        return max;
    }
    




    public static void main(String[]args)
    
    {
    
    System.out.println(Variable2(1,2,4,5,6,7,8,9));
    
    }

}
