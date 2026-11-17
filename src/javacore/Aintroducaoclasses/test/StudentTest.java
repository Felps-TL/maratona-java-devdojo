package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.domain.Student;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Luffy";
        student.age = 21;
        student.sex = 'M';

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.sex);
        System.out.println(student);
    }
}