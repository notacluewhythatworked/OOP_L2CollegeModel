package models;

import java.util.ArrayList;

public class Student extends Person {
    private double GPA;
    private Staff advocate;
    ArrayList<String> advocateName = new ArrayList<>();
    ArrayList<String> studentClasses = new ArrayList<>();

    //getters
    public double getGPA() {
        return GPA;
    }
    public Staff getAdvocate() {
        return advocate;
    }
    public String getAdvisorName(){
        Staff adv = getAdvocate();
        String advisorName = adv != null ? adv.getName() : "NOT ASSIGNED";

        return advisorName;
    }

    //setters
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public void setAdvocate(Staff advocate) {
        this.advocate = advocate;
    }


    //custom constructor
    public Student(String name, String birthDate, double GPA, Staff advocate, ArrayList studentClasses) {
        this.name = name;
        this.birthDate = birthDate;
        this.GPA = GPA;
        this.advocate = advocate;
        this.studentClasses = studentClasses;
    }

    //default constructor
    public Student() {
    }


    @Override
    public String toString() {
        return "Student Name: " + getName() + "\nBirthday: " + getBirthDate() + "\nGPA: " + getGPA() + "\nAdvocate: " + getAdvisorName() + "\nCourses: " + studentClasses;
    }


}
