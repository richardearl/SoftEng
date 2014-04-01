
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
  
}
