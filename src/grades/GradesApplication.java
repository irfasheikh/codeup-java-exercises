package grades;
import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap< String, Student> students = new HashMap<>(); // create a hashmap named students
        // keys are strings that rep github usernames/ values that are Student objects



        Student Vanessa = new Student("Vanessa");
        Vanessa.addGrade(70);
        Vanessa.addGrade(85);
        Vanessa.addGrade(90);
        Vanessa.addGrade(65);

        Student Jake = new Student("Jake");
        Jake.addGrade(70);
        Jake.addGrade(80);
        Jake.addGrade(90);
        Jake.addGrade(600);

        Student Iffy = new Student("Iffy");
        Iffy.addGrade(60);
        Iffy.addGrade(80);
        Iffy.addGrade(90);
        Iffy.addGrade(60);

        Student Sergio = new Student("Sergio");
        Sergio.addGrade(90);
        Sergio.addGrade(80);
        Sergio.addGrade(90);
        Sergio.addGrade(95);

        students.put("irfasheikh", Iffy); // put hashmap name then( key value 1, key value 2)
        students.put( "vpnoriega" , Vanessa);
        students.put( "sadavila" , Sergio);
        students.put( "jakechadwell", Jake);


            System.out.println("Welcome!");
            System.out.println();
            System.out.println("Here are the GitHub usernames of our students:");
            System.out.println();
            System.out.println(students.keySet()); // keyset is built in
            // System.out.println("irfasheikh | vpnoriega | sadavila | jakechadwell")
            System.out.println();
            System.out.println("What student would you like to see more information on?");


            boolean seeUsers = true;
            Scanner scanner = new Scanner(System.in);

            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("irfasheikh")) {
                // print name, username, and average
            } else if (userInput.equalsIgnoreCase("vpnoriega")){
                // print name, username, and average
        } else if (userInput.equalsIgnoreCase("sadavila")) {
                // print name, username, and average
            }        else if(userInput.equalsIgnoreCase("jakechadwell")){
                // print name, username, and average

                }
            }

        }










    }
}