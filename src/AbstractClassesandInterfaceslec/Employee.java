package AbstractClassesandInterfaceslec;

public abstract class Employee implements DailyWork{
    protected String name;
    protected String department;
    protected int id; // these are all fields for our objects

//    public abstract String work(); // setting up a blank method --our classes that inherit will fill in the details // this is an abstract method // this is blank bc we dont fill in details for method here

    public Employee(String name, String department, int id){
        this.name = name;
        this.department = department;
        this.id= id;
    } // setup constructor

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String){
//        this.name = name;
//    }
//
//    public String getDepartment(){
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }





}
