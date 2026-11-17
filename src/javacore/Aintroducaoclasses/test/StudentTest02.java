package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.domain.Student;

public class StudentTest02 {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = new Student();

        student.name = "Sanji";
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student.name);

        System.out.println("----------------------");
        System.out.println(student2.age);
        System.out.println(student2.sex);
        System.out.println(student2.name);
    }
}