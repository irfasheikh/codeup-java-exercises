import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {

        boolean talkMore = true;
        String question = "Sure."; //input end ?
        String yell = "Whoa, chill out!"; //input end !
        String nothing = "Fine. Be that way!"; // empty input
        String anything = "Whatever."; // input end w other


        Scanner scanner = new Scanner(System.in);

        String userInput = scanner.nextLine();
        System.out.println(userInput);

        //fixed conditional and loop
        if (userInput.endsWith("?")) {
            System.out.println(question);
        } else if (userInput.endsWith("!")) {
            System.out.println(yell);
        } else if (userInput.endsWith(" ")) {
            System.out.println(nothing);
        } else if (userInput.endsWith(".")) {
            System.out.println(anything);
        }
        System.out.println("Do you want still want to talk to Bob? [y/n]");
        String keepGoing = scanner.nextLine();

        if (keepGoing.equalsIgnoreCase("y")) {
            talkMore = true; // this is the boolean from the top
        } else {
            talkMore = false;


    } while(talkMore);
}
}

//!!WALKTHROUGH!!//

//import java.util.Scanner;
//public class Bob {
//    public static void main(String[] args) {
//    }
//
//        public static void talkToBob() {
//            boolean keepTalking; // this is the boolean for the loop
//            Scanner scanner = new Scanner(System.in);
//            System.out.println("Bob comes up to you to talk.");
//            System.out.println("His head down, he sits down.");
//            System.out.println("He looks at you boredly.");
//
//            do { // this is to keep talking to bob
//                System.out.println("What would you like to say to bob?");
//                String userInput = scanner.nextLine();
//
//
//                if (userInput.endsWith("?")) {
//
//                    //make bob say "sure"
//                    System.out.println("Bob looks at his feet and then you and says\n 'Sure.'");
//                } else if (userInput.endsWith("!")) {
//
//                    // make bob say "whoa! chill out!"
//                    System.out.println("He is shocked and looks at ya and says \n 'Whoa! Chill out!'");
//                } else if (userInput.length() == 0) {
//
//                    //make bob say "fine. be that way"
//                    System.out.println("Bob rolls his eyes. \n 'Fine. Be that way.' he says.");
//                } else {
//
//                    // make bob say "whatever"
//                    System.out.println("Without doing anything, he mutters 'whatever.'.");
//                }
//                System.out.println("Would you like to talk to Bob some more? [yes/no]");
//                String userContinue = scanner.nextLine();

//                if (userContinue.equalsIgnoreCase("yes")) {
//                    keepTalking = true;
//                } else {
//                    keepTalking = false;
//                }
//
//                //if ? = "sure"
//                //else if ! = "whoa! chill out!"
//                // else if "" = "Fine. be that way."
//                // else everything else = "whatever."
//
//
//            } while (keepTalking);
//
//        }
//    }


