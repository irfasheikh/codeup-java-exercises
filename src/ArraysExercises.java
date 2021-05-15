//import java.util.Arrays;
//
//public class ArraysExercises {
//    public static void main(String[] args) {
//
////        //1.
////        //a.
////        int[] numbers = {1, 2, 3, 4, 5};
////        System.out.println(Arrays.toString(numbers));
//////need to string bc it returns the value in a string, otherwise it returns an error, hey the values in this array that are actually numbers need to be turned into a string
////        //b. Person objects
////
//////String [] personOne = new String [2]; this is not correct, you want person not string
////
////        Person[] persons = new Person[3]; // create an array that holds 3 person objects
////        // the type of array im creating is person then named persons and then we are saying there are 3
////
////        persons[0] = new Person("person1");
////        persons[1] = new Person("person2");
////        persons[2] = new Person("person3");
////
////        for (int i = 0; i < persons.length; i++) {
////            System.out.println(persons[i].getName());
////        }
////Person Larry = new Person ("Larry");
////        addPerson(persons, Larry );
////
////        for (int i = 0; i < persons.length+1; i++) {//bc new array is one longer than original if you add something
////            System.out.println(addPerson(persons, Larry) [i].getName());
////        }
////    } // this is closing off the main method, new methods start w the public static blah blah
//////we start the new method on line 28
////    // create a static method named addPerson
////    public static Person[] addPerson(Person[] people, Person person) {
////        Person[] newPersons = Arrays.copyOf(people, people.length + 1);
////                newPersons[newPersons.length-1] = person; // this gives us the index of the last spot and then we pass the person into the last spot
////        return newPersons;
////
////
//
//        public static void main(String[] args) {
//            int[][] primes = new int[3][3];
//            primes[2][2] = 1;
//
//            System.out.println(primes[1][2]);
//
//
//
//    }
//}
//
//
