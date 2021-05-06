package AbstractClassesandInterfaceslec;

public interface DailyWork {
    String businessHours = "9:00 to 5:00, Monday through Friday";

    String work(); //method named work with no details
    String morningMeeting(); // method named morningMeeting w no details
    String lunchTime(); //method lunchTime w no details

    int dailyPay();
}
