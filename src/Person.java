public class Person {


    private String namePerson;



    //constructor
public Person (String name) {
    this.namePerson = name;
}


    public String getName(){
//TODO: return the person's name
        return namePerson;
    }

    public String setName(String name){
//TODO: change the name property to the passed value
        return namePerson = name;
    }
    public String sayHello() {
//TODO: print a message to the console using the person's name
        return "Hey wassup hello " + namePerson;
    }

    public static void main (String[] args) {
    Person Iffy = new Person("Iffy");
    System.out.println("Iffy.namePerson= "+ Iffy.namePerson);
    System.out.println("Iffy.getName()= " + Iffy.getName());
    System.out.println("Iffy.sayHello() =" + Iffy.sayHello());
    Iffy.setName("Irfa");
    System.out.println("Iffy.namePerson = " + Iffy.namePerson);


    // Understanding references //
//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());



    }

}

