package oopLecture;

public class Student {
    // each student will have
    public String name;
    public String cohort;

    public Student (String studentName){
        name = "Unknown";
        cohort = "Unassigned";

    }

    public Student (String studentName){
    name = studentName;
    cohort = "Unassigned";
    };

    public Student (String studentName, String assignedCohort) {
    name = studentName;
    cohort = assignedCohort;
    };

    public Student(String nathan_adcock) {
    }


    public static void main(String[] args){
        //old way of doing things

        //Student exampleStudent = new Student ();
        // from here, we'd continue to fill in all of the fields ourselves


        // now: lets use our constructor

        Student nathan = new Student("Nathan Adcock");
        System.out.println("nathan.name = " + nathan.name);
        System.out.println("nathan.cohort = " + nathan.cohort);

        // im in a pickle, i need to handle if the student name is on record and we have an assigned cohort

        Student kenneth = new Student("Kenneth Howell", "Deimos");
        System.out.println
}
