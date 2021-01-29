package models;

import java.util.ArrayList;

public class Faculty extends Person {
    private int officeNumber;
    private String officeHours;
    ArrayList<String> facultyCourses = new ArrayList<>();
    private boolean fulltime = true;

    //getters
    public int getOfficeNumber() {
        return officeNumber;
    }
    public String getOfficeHours() {
        return officeHours;
    }
    public boolean isFulltime() {
        return fulltime;
    }

    //setters
    public void setOfficeNumber(int officeNumber) {
        this.officeNumber = officeNumber;
    }
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    public void setFulltime(boolean fulltime) {
        this.fulltime = fulltime;
    }

    //constructors
    public Faculty(String name, String birthDate, String officeHours, int officeNumber, ArrayList facultyCourses, boolean fulltime) {
        this.name = name;
        this.birthDate = birthDate;
        this.officeNumber = officeNumber;
        this.officeHours = officeHours;
        this.facultyCourses = facultyCourses;
        this.fulltime = fulltime;
    }

    //default constructor
    public Faculty() {
    }


    @Override
    public String toString() {
        return "Faculty Name: " + getName() + "\nBirthday: " + getBirthDate() + "\nOffice Number: " + getOfficeNumber() + "\nOffice Hours: " + getOfficeHours() + "\nCurrent Courses: " + facultyCourses + "\nFulltime? " + fulltime;
    }
}
