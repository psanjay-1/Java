package Sanjay.Projects;
class Circle{
    public double radius;
}

class Cylinder extends Circle{
public double height;

public double area(){
    return radius*height;
}
}

public class Inher {
    public static void main(String[]args){
        Cylinder c = new Cylinder();
        c.radius=20;
        c.height=20;
        System.out.println(c.area());



    }
}