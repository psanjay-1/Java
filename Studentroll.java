package Sanjay.Projects;

import javax.lang.model.util.ElementScanner14;

class Student{
int roll;
String Name;
String course;
private double m1,m2,m3;


public double getm1(){
    return m1;

}
public double getm2(){
    return m2;

}
public double getm3(){
    return m3;

}
public void setm1(double m){
    if (m>0)
        m1=m;
    else
        m1=0;

}
public void setm2(double n){
    if (n>0)
    m2=n;
else
    m1=0;

}
public void setm3(double o){
    if (o>0)
    m3=o;
else
    m1=0;

}
double total(){
return m1+m2+m3;
}

double  average(){
return (m1+m2+m3)/3;
}

String grade(){
if (average()>60){
return "A";}
if (average()>39){
    return "B";}
    else 
    return "C";
}

}
public class Studentroll{
public static void main(String[]args){
Student s1=new Student();
s1. Name="Sanjay";
s1.course="Science";
s1.setm1(47);
s1.setm2(55);
s1.setm3(75);

System.out.println(s1.total());
System.out.println(s1.average());
System.out.println(s1.grade());

System.out.println(s1.getm1());
System.out.println(s1.getm2());
System.out.println(s1.getm3());
}




}
