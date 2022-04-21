package Sanjay.Projects;



class Cylinder{
private double radius;
private double height;

public double getRadius(){
    return radius;
    }
    
    public double getHeight(){
        return height;
    }

    public double area(){
        return radius * height;
    }

    public Cylinder(double r, double h){
    radius=r;
    height=h;
    }


}



public class Cylinder2 {
    public static void main(String[] args){
       Cylinder c= new Cylinder(15,25);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());


    
}
}