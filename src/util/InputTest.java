import java.util.ArrayList;
import java.util.List;
public class InputTest {
    public static void main(String[] args) {
////        List<Integer> numbers = new ArrayList<>();
////        numbers.add(13);
////        numbers.add(new Integer(8)); // Line 7
////        numbers.add(3.6); // Line 8
////        for (Integer number: numbers) System.out.println(number); // Line 9
//int[][] primes = new int[3][3];
//    primes[2][2] = 1;

//        System.out.println(primes[1][2]);

        String[] names = {"Rick", "Stacey", "Brad", "Becca"};
        String x;
        try {
            x = names[100];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught!");
            x = "";
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("This will always run.");
        }
    }
}
//        Input newInput = new Input();
//        System.out.println("newInput.getInt() " + newInput.getInt());


//        Input booleanInput = new Input();
//        System.out.println(booleanInput.yesNo());
//package util;
//        import java.util.Scanner;