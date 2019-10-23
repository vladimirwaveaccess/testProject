package com.company.LS7OOP;

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student("studentName1", "studentSurname1", "A1", 4.0);
        Aspirant aspirant1 = new Aspirant("aspirantName1", "aspirantSurname1", "G1", 5.0, "work1");
        Student aspirant2 = new Aspirant("aspirantName2", "asprirantSurname2", "G2", 4.0, "work2");

        System.out.println(student1.getFirstName() + " " + student1.getLastName() + " " + student1.getGroup() + " " + student1.getAverageMark());
        System.out.println(aspirant1.getFirstName() + " " + aspirant1.getLastName() + " " + aspirant1.getGroup() + " " + aspirant1.getAverageMark() + " " + aspirant1.getScienceWork());
        System.out.println(aspirant2.getFirstName() + " " + aspirant2.getLastName() + " " + aspirant2.getGroup() + " " + aspirant2.getAverageMark());

        Student[] students = {student1, aspirant1, aspirant2};

        System.out.println(aspirant2);

        for (Student student: students) {
            System.out.println(student.getScholarship());
        }


    }
}
