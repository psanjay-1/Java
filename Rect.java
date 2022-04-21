package Sanjay.Projects;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
class Rectangle {
    private double length;
    private double breadth;
    public double getLength(){
        return length;

    }
    public double getBreadth(){
            return breadth;

    }

    public double area(){
        return length*breadth;


    }

    public double circumference(){
        return area()*length;



    }
    public boolean isSquare(){
        if (length==breadth)
        return true;
        else;
        return false;
    }
    public Rectangle(double l, double b){

        length=l;
        breadth=b;
         


    }
    public Rectangle(){
length=1;
breadth=1;

    }
}
public class Rect {
public static void main(String[]args){

Rectangle r=new Rectangle(22,81);
System.out.println(r.area());
System.out.println(r.circumference());
System.out.println(r.isSquare());
System.out.println("Length is " + r.getLength());
System.out.println("Breadth is " + r.getBreadth());
}





}