public class methodsLecture {
    public static void main(String[]args){
        System.out.println("wazzzu methods");

        // Defining and Calling Methods with Various Inputs //
        sayGreeting();
        sayInput("Hello, class!"); // this requires an input to run
        System.out.println(getGreetingWithName("Marco"));
        System.out.println(returnProductOfThreeNumbers(1,2,3));
        System.out.println(getGreetingWithName("Wassup", "Iffy"));
        //countToLoop(100);
        countTo100(50);


    }
    // there are no inputs in the () and there are no outputs
    public static void sayGreeting(){
        System.out.println("Hello");
    }

    //no returned output with an input
    public static void sayInput(String input){
        System.out.println(input);
    }

    //return an output without an input

    public static String getDefaultGreeting(){
        return "Hello, ";
    }
     public static String getGreetingWithName(String name){
        return getDefaultGreeting() + " " + name;
     }
      public static double returnProductOfThreeNumbers(double num1, double num2, double num3){
        double result = num1 * num2 * num3;
        return result;
      }

      //Method Overloading

    public static String getGreetingWithName(String salutation, String name) {
        return salutation + name;
    }

    //Recursion

    public static void countToLoop (int num){
        for (int i = 0; i <= num; i++) {
            System.out.println(i);
        }
    }

    public static int countTo100(int num) {
        System.out.println(num);
        if( num == 100){
            return num;
        } else {
            return countTo100(++num);
        }
    }

}
