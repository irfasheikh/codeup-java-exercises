package AbstractClassesandInterfaceslec;

public class Accountant extends Employee {

    public Accountant(String name, String department, int id) {
        super(name, department, id);
    }



    public String work() {
        return "TPS reports have been drafted";
    } // now we need to fill in those details!

    public String morningMeeting(){
        return "accountants have meetings beginning at 9:15 AM and run until 8:45 AM";
    }

    public String lunchTime(){
        return "accountants take their lunch break when they want to eat at their desk";
    }

    public int dailyPay() {
        return 500;
    }
}

