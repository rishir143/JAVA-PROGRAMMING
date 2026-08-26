package OOPS;

import java.util.Scanner;

class Student{
    String name;
    int rollno;
    double cgpa;
    void print(){
        System.out.println(name + " " + rollno + " " + cgpa);
    }

}
public class UserDefiinedDataType {
    public static void main(String[] args) {


        Student s1 = new Student();
        s1.name = "Rishi";
        s1.rollno = 54;
        s1.cgpa = 7.3;

        Student s2 = new Student();
        s2.name = "Raj";
        s2.rollno = 78;
        s2.cgpa = 8.4;

        Student s3 = new Student();
        s3.name = "Raghav";
        s3.rollno = 96;
        s3.cgpa = 8.1;

        System.out.println(s2.name + " " + s2.rollno + " " + s2.cgpa);

        s1.print();
        print(s3);

    }
    public static void print(Student s){
        System.out.println(s.name  + " " + s.cgpa);
    }
}
