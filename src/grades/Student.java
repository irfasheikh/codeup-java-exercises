package grades;

import java.util.ArrayList;

public class Student {

    private static String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }


    public String getName(){ // method
        return name;
    }

    public void addGrade(int grade) { // method
        this.grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        double totalGrades = this.grades.size(); // .size tell you the length of it

        for(double grade : this.grades){
            total += grade;
        }
        return total/totalGrades;

    }

    public static void main(String[] args){
       Student Iffy = new Student("Iffy");
       System.out.println("Iffy.name =" + Iffy.name);
        System.out.println("Iffy.grades = " + Iffy.grades); // this is empty
        Iffy.addGrade(60); // these are all filling ^ up
        Iffy.addGrade(80);
        Iffy.addGrade(90);
        Iffy.addGrade(60);
        System.out.println("Iffy.grades = " + Iffy.grades); //. grades holds is empty array, addGrade adds integers to the array
        System.out.println("Iffy's average is " + Iffy.getGradeAverage());

        Student Vanessa = new Student("Vanessa");
        System.out.println("Vanessa.name =" + Vanessa.name);
        System.out.println("Vanessa.grades = " + Vanessa.grades);
        Vanessa.addGrade(70);
        Vanessa.addGrade(85);
        Vanessa.addGrade(90);
        Vanessa.addGrade(65);
        System.out.println("Vanessa.grades = " + Vanessa.grades);
        System.out.println("Vanessa's average is " + Vanessa.getGradeAverage());

        Student Jake = new Student("Jake");
        System.out.println("Jake.name =" + Jake.name);
        System.out.println("Jake.grades = " + Jake.grades);
        Jake.addGrade(70);
        Jake.addGrade(80);
        Jake.addGrade(90);
        Jake.addGrade(600);
        System.out.println("Jake.grades = " + Jake.grades);
        System.out.println("Jakes's average is " + Jake.getGradeAverage());

        Student Sergio = new Student("Sergio");
        System.out.println("Sergio.name =" + Sergio.name);
        System.out.println("Sergio.grades = " + Sergio.grades);
        Sergio.addGrade(90);
        Sergio.addGrade(80);
        Sergio.addGrade(90);
        Sergio.addGrade(95);
        System.out.println("Sergio.grades = " + Sergio.grades);
        System.out.println("Sergio's average is " + Sergio.getGradeAverage());



    }
}
