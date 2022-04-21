package Sanjay.Projects;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Cylinder{
private double radius;
private double height;

public double getRadius(){
return radius;
}

public double getHeight(){
    return height;
}

public Cylinder(double r, double h){
    setRadius(r);
    setHeight(h);
    }

public void setRadius(double r){
    if (r>=0)
    radius=r;        
else; 
    radius=0;
}

public void setHeight(double h){
    if (h>=0)
    height=h;         
     else; 
    h=0;
    }

public Cylinder(){
    radius=1;
    height=1;
}


public double area(){
    return radius*height;
}
}



public class Cylinder1 {
    public static void main(String[] args){
       Cylinder c= new Cylinder(15, 25);
        System.out.print(c.area());

    
}
}