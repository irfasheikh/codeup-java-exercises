public class ServerNameGenerator {
    public static void main(String [] args){
        String [] adjectives = {"hard","sad","happy", "loving", "smart", "talkative", "kind", "attractive", "funny", "sweet"};
        String [] nouns = {"Pakistan", "New York", "cat", "fish", "baby", "sofa", "Dallas", "laptop", "phone", "desk"};

        System.out.println(randomElement(adjectives));
        System.out.println(randomElement(nouns));
        System.out.println("Here is your name: ");
        System.out.println("Hyphenated it is "+ randomElement(nouns)+ "-" + randomElement(adjectives));
    }

    // create a method that will return a random element from array of strings

    public static String randomElement(String[] word) { // we need to pass in array
//        return word[(int) Math.floor(Math.random() * (word.length-1))];// need a way to pass a random value that is the length of that array

        return word [(int) (Math.random() * (word.length-1))]; // another way to do this
    }







}
