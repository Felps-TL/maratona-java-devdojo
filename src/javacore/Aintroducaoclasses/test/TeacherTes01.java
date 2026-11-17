package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.domain.Teacher;

public class TeacherTes01 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.name = "Mestre Kami";
        teacher.age = 140;
        teacher.sex = 'M';

        System.out.println("Nome: " + teacher.name + ", idade: " + teacher.age + ", sex: " + teacher.sex);
    }
}
