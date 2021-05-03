public class Person {


    private String namePerson;



    //constructor



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

}

