package oopLecture;

import java.util.Scanner;

public class PersonLecture {
    public String firstName;
    public String lastName;
    public String joinsChat(){
        return lastName + ", " + firstName + " has joined the chat!";
    }

    public static long worldPop = 7_860_000_000L;

    public static void main(String[] args) {
        PersonLecture ken = new PersonLecture();
        PersonLecture douglas = new PersonLecture();
        System.out.println(ken);

        Scanner myScanner = new Scanner(System.in);

        String myName= "Ken";
        ken.firstName = myName;
        ken.lastName = "Howell";


        PersonLecture vanessa = new PersonLecture();
        vanessa.firstName = "Vanessa";
        vanessa.lastName = "Noriega";

        douglas.firstName = "Douglas";
        douglas.lastName = "Hirsh";



        System.out.println("ken.firstName= " + ken.firstName);
        System.out.println("ken.lastName =" + ken.lastName);
        System.out.println("ken.joinsChat() = " + ken.joinsChat());


        //world pop

                System.out.println("worldpop= "+ PersonLecture.worldPop);
                Perspn

    }
}
