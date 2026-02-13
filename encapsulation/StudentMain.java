package com.encapsulation;

import java.util.ArrayList;
import java.util.Scanner;

class Student{
    private String name;
    private String course;
    private int sId;

    public Student(String course, String name, int sId) {
        this.course = course;
        this.name = name;
        this.sId = sId;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
public class StudentMain {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Student> class1=new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int id=sc.nextInt();
            String course=sc.next();
            String name=sc.next();
            Student s1=new Student(course,name,id);
            class1.add(s1);
        }
        System.out.println("Details");
        System.out.println("Student ID\tName\tcourse");
        for (Student std:class1) {
            System.out.println(std.getsId()+"\t\t"+std.getName()+"\t\t"+std.getCourse());

        }
    }
}
