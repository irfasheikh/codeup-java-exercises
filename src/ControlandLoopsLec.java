import java.util.Scanner;

public class ControlandLoopsLec {

    public static void main(String[] args) {

        //Boolean Expressions

        System.out.println("(5==5) =" + (5 == 5));
        System.out.println("(5 < 6) = " + (5 < 6));
        System.out.println("(5 > 6) =" + (5 > 6));

        System.out.println("('y' == 'Y') = " + ('y' == 'Y'));
        System.out.println("('y' == 'y') =" + ('y' == 'y'));
//
        //  boolean isAdmin = true;

        //  System.out.println("(isAdmin == false) =" + (isAdmin ==true));

        //logical operators combine multiple boolean expressions for evaluation -isAdmin $ isLoggedIn, shoppingCart.length > 5 || isDiscountMember


        //boolean isLoggedIn = true;
        //boolean isOwner = false;

//        System.out.println("(isAdmin && is LoggedIn) = " + (isAdmin && isLoggedIn) + ". Do I reveal the hidden administrator portal?" + (isAdmin && isLoggedIn));
//
//        System.out.println("(isOwner || isAdmin =" + (isOwner || isAdmin) + ". Is this the admin or the user who made this post? Do I show the 'edit' button for this post?" + (isOwner || isAdmin));
//
//        System.out.println("(!isLoggedIn) = " + (!isLoggedIn) + ". Am I not logged in and need to login?" + (!isLoggedIn));
//
//
        //Sting are not primitive

        //== for strings will tell you reference is equal not value. use the equals method

        //If..

//        boolean isAdmin = true;
//        boolean isLoggedIn = true;
//        boolean isOwner = false;
//
//        if(isAdmin && isLoggedIn){
//            System.out.println("Admin protal accessed");
//        }
//        if(isOwner || isAdmin){
//            System.out.println("Show the edit button for this post");
//        }
//        if(isLoggedIn){
//            System.out.println("Welcome to our website!");
//
//        }

        //If..else:
//        boolean isAdmin = true;
//        boolean isLoggedIn = true;
//        boolean isOwner = false;
//
//
//        if(isLoggedIn && isAdmin) {
//            System.out.println("Show the 'admin' button on the home page and all recent posts by all users");
//        } else if (isLoggedIn && isOwner) {
//            System.out.println("Show the 'my account' button w user's most recent posts");
//        } else if (!isLoggeIn){
//            System.out.println("Show the login/ registration page to begin user of the application");
//        }
        //switch case

        int diceRoll = (int) (Math.random() * 6 - 1 + 1) + 1;
        System.out.println("diceroll = " + diceRoll);


        switch (diceRoll) {
            case 1:
                System.out.println("rolled a one!");
                break;
            case 2:
                System.out.println("rolled a two!");
                break;
            case 3:
                System.out.println("rolled a three!");
                break;
            case 4:
                System.out.println("rolled a four!");
                break;
            case 5:
                System.out.println("rolled a five!");
                break;
            case 6:
                System.out.println("rolled a six!");
                break;
        }

        //While
//        int i = 0;
//            while (i <= 10) {
//                System.out.println("i is" + i);
//                i++;
//            }

        //scanner takes a variable
//            boolean newsLetterSignup = true;
//            Scanner scanner = new Scanner(System.in); //incoming inputs
//
//            while(newsLetterSignup){
//                System.out.println("Are you ready to sign up for our newslett? Note: only 'yes' will work :p");
//                String userInput = scanner.nextLine();
//
//                if(userInput.equalsIgnoreCase("yes")) {
//                    System.out.println("We are happy blahblah thank you signing up");
//                    newsLetterSignup = false;
//                } else {
//                    System.out.println("Sorry thats unacceptable");
//                }

        //Do While
//        boolean newsLetterSignup;
//        Scanner scanner = new Scanner(System.in); //incoming inputs
//
//        do {
//            System.out.println("Are you ready to sign up for our newslett? Note: only 'yes' will work :p\n");
//            String userInput = scanner.nextLine();
//
//            if(userInput.equalsIgnoreCase("yes")) {
//                System.out.println("We are happy blahblah thank you signing up");
//                newsLetterSignup = false;
//            } else {
//                System.out.println("Sorry thats unacceptable");
//                newsLetterSignup = true;
//            }
//            } while (newsLetterSignup);

        //for loop

//        for (int i = 0; i < 10; i += 1) {
//            System.out.println("i is currently: " + i);
//        }
//
//        String [] fruits = {"apples", "bananas", "jackfruit"};
//
//        for(int i = 0; i < fruits.length; i++){
//            System.out.println("Here's a fruit: " + fruits [i]);
//
//        }
//
//        }

        //break and continue (not just switch case!)
        // goal print only up to number 7

//        for (int i = 1; i < 100; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                System.out.println("Whoops- hit the stopping point!");
//                break;
//            }
//        }

        for(int i = 1; i <= 10; i++){
            if(i % 2 == 1){
                System.out.println("odd number-get out!");
                continue;
            }
            System.out.println("nice! even nums" + i );
        }
    }
}
