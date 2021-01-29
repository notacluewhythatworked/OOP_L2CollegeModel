package models;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Person {
    protected String name;
    protected String birthDate;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Faculty> faculty = new ArrayList<>();
    ArrayList<Staff> staff = new ArrayList<>();

    //getters
    public String getName() {
        return name;
    }
    public String getBirthDate() {
        return birthDate;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public static void run(){
        Student s = new Student();
        s.setName("Jeff Lennon");
        s.setBirthDate("January 5, 2000");
        s.setGPA(3.37);
        s.studentClasses.add("CSC150");
        s.studentClasses.add("SCI160");
        s.studentClasses.add("HIS360");

        Faculty f = new Faculty();
        f.setName("Stephen McKenna");
        f.setBirthDate("November 23, 1988");
        f.setOfficeHours("Mon - Thurs, 11am - 1pm");
        f.setOfficeNumber(110);
        f.facultyCourses.add("SCI160");
        f.facultyCourses.add("HIS360");
        f.facultyCourses.add("POL230");
        f.setFulltime(false);

        Staff t = new Staff();
        t.setName("James Donovan");
        t.setBirthDate("July 17, 1995");
        t.setJobTitle("Financial Advocate");

        //values that are set after the object is created so they can be cross-referenced before being stored.
        s.setAdvocate(t);
        t.setAdvisingStudents(s.name);

        //writing to database
        s.students.add(new Student(s.getName(), s.getBirthDate(), s.getGPA(), s.getAdvocate(), s.studentClasses));
        f.faculty.add(new Faculty(f.getName(), f.getBirthDate(), f.getOfficeHours(), f.getOfficeNumber(), f.facultyCourses, f.isFulltime()));
        t.staff.add(new Staff(t.getName(), t.getBirthDate(), t.getJobTitle(), t.getAdvisingStudents()));

        //printing the values in the database
        System.out.println(s.students.toString());
        System.out.println();
        System.out.println(f.faculty.toString());
        System.out.println();
        System.out.println(t.staff.toString());
        System.out.println();


        s.studentClasses.remove("SCI160");
        System.out.println(s.name + " has REMOVED one or more courses. Their new courses are now " + s.studentClasses);
        s.studentClasses.add("MUS460");
        System.out.println(s.name + " has ADDED one or more courses. Their new courses are now " + s.studentClasses);

        String oldHours = f.getOfficeHours();
        f.setOfficeHours("M-F, 11am-12:30pm");
        System.out.println(f.name + " has changed their office hours. They have been changed from " + oldHours + " to " + f.getOfficeHours());

        s.studentClasses.remove(s.getAdvocate());
        System.out.println(t.name + " has been removed as the advisor for " + s.name);
        System.out.println(s.students.toString());

        int oldOffice = f.getOfficeNumber();
        f.setOfficeNumber(325);
        System.out.println(f.name + " has moved from office " + oldOffice + " to office " + f.getOfficeNumber());

        System.out.println(f.name + " has been removed from the institution. Farewell!");
    }

    @Override
    public String toString() {
        return toString();
    }

    //    protected static String promptForString(String prompt, boolean allowBlank){
//        if(prompt == null || prompt.isBlank()){
//            throw new IllegalArgumentException("The prompt cannot be null, empty, or just white space. prompt= " + prompt);
//        }
//        String input = null;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        boolean inputIsInvalid = true;
//
//        do{
//            System.out.print(prompt);
//
//            try{
//                input = br.readLine();
//                inputIsInvalid = input == null || (!allowBlank && input.isBlank());
//
//                if(inputIsInvalid){
//                    System.out.println("Your input is invalid. Please try again.");
//                }
//            } catch(IOException ioe){
//                System.out.println("There was a problem and your input was not received. Please try again.");
//            }
//        } while(inputIsInvalid);
//
//        return input;
//    }

}

//TODO: KNOWN ERRORS
//MOST technical aspects (specifically, removing from advising) do not effect that actual data. It just looks like it does.

