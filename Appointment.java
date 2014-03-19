public class Appointment(){
  
  private String name;
  private String startTime;
  private String endTime;
  private int priority;
  private int repeat; 
  
  public Appointment(String iname, String istartTime, String iendTime,int ipriority, int irepeat){
     name = iname;
     startTime= istartTime;
     endTime = iendTime;
     priority = ipriority;
     repeat = irepeat;
  }
  
  public void setName(String input){
    name = input;
  }
  
  public void setStartTime(String input){
    startTime = input;
  }
  
  public void setEndTime(String input){
    endTime = input;
  }
  
  public void setPriority(int input){
    priority = input;
  }
  
  public void setRepeat(int input){
    repeat = input;
  }
}
