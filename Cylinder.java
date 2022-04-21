package Sanjay.Projects;

class Cylinder1{
    double radius;
    double height;


    double lidArea(){
        return Math.PI*radius*radius;
    }

    double totalSurfaceArea(){
        return 2*Math.PI*radius*lidArea();



    }
}

public class Cylinder{
    public static void main(String[]args){
      

        Cylinder1 c1=new Cylinder1();
        c1.radius=7;
        System.out.println(c1.lidArea());





    }

}



