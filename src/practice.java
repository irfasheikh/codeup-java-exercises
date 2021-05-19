public class practice {
}

public class User extends Person { //extends is inherit
    protected static boolean admin;

    public static void main(String[] args){
        System.out.println("Assessment.square(2) =" + Assessment.square(2));
        System.out.println("sum = " + Assessment.sum(5,5));

    }






    public User(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public User(String firstName, String lastName, boolean admin){ // it asked to pass 3 parameters
        super(firstName, lastName);
        this.admin = admin; //this is for the 3rd parameter, constructor overload
    }

    public boolean isAdmin(){
        return this.admin;
    }


}


