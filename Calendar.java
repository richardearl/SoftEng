public class Calendar {
  //Calendar should be a list of all days that can have multiple instances of appointment added to each day
  public Calendar(){
    int january = 31;
    int february = 28;
    int march = 31;
    int april = 30;
    int may = 31;
    int june = 30;
    int july = 31;
    int august = 31;
    int september = 30;
    //create an array or arraylists size 365 that can store mutliple appointments for every day
    ArrayList[] days = new ArrayList[365];
  }
  
  public void addAppointment(int day, Appointment appt ){
    days[day].add(appt)
  }
  
  public void delAppointment(int day, String name){
    for(Appointment a: days[day]){
      if(a.getName.equals(name)){
        a.delete();
      }
    }
  }
  public void printAppointments(){
    //prints all appointments
    int x = 0;
    while(x<366){
    for(Appointment a: days[day]){
      
        System.out.println(a.getName());
      
    }
    x++;
  }
  
  public void userInput(){
    Scanner scan = new Scanner();
    System.out.println("Press 1 to add an Appointment");
    System.out.println("Press 2 to add an Remove");
    System.out.println("Press 3 to view the calendar");
    String input = scan.nextLine();
    if(input.equals("1")){
       addAppointment(int day, Appointment appt );
    }
    if(input.equals("2")){
        delAppointment(int day, String name)
    }
    if(input.equals("3")){
       printAppointments()
    }
  }
  
}
