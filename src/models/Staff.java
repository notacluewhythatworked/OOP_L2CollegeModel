package models;

public class Staff extends Person {
    private String jobTitle;
    private String advisingStudents;//Make this an ArrayList

    //getters
    public String getJobTitle() {
        return jobTitle;
    }
    public String getAdvisingStudents() {
        return advisingStudents;
    }

    //setters
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }
    public void setAdvisingStudents(String advisingStudents) {
        this.advisingStudents = advisingStudents;
    }


    //constructor
    public Staff(String name, String birthDate, String jobTitle, String advisingStudents) {
        this.name = name;
        this.birthDate = birthDate;
        this.jobTitle = jobTitle;
        this.advisingStudents = advisingStudents;
    }

    //default constructor
    public Staff() {
    }


    @Override
    public String toString() {
        return "Staff Name: " + getName() + "\nBirthday: " + getBirthDate() + "\nJob Title: " + getJobTitle() + "\nStudents they are advising: " + getAdvisingStudents();
    }
}
