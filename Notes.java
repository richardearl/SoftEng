import java.util.Scanner;

public class Notes {

    private String title;
    private String body;
    private Notes note;
    private String userInstruction;
    private Scanner in;
    private boolean noteTitlePresent;
    private boolean noteBodyPresent;
    
    public Notes() {
    	
    }
    
    //main is for testing purposes
    
    public static void main(String[] args) {
    	Notes note = new Notes();
    	note.Notes();
            }
    
    public void Notes() {
    	 Scanner in = new Scanner(System.in);
    	 while (true) {
             
             if (in.nextLine().equals("add note")) {
            	 System.out.println("OK");
            	 title = in.nextLine();
            	 System.out.println(title);
                 addNote(title);
             }
             else if (in.nextLine().equals("Done")) {
                 saveChanges();
             }
             
         }
    }
    public void addNote(String title) {
        //Upon note creation, call setNoteTitle() and setNoteBody().
        noteTitlePresent = setNoteTitle(title);
        noteBodyPresent = setNoteBody(body);
        
    }
    
    public boolean setNoteTitle(String title) {
    	if (title != null) {
        	return true;
        }
        else {
        	return false;
        }
    }
    
    public boolean setNoteBody(String body) {
        if (body != null) {
        	return true;
        }
        else {
        	return false;
        }
    }
    
    public void saveChanges() {
        boolean noteFinished = checkNoteComplete();
        if (noteFinished) {
        	System.out.println(title+body);
            //create the new note. For the GUI this will need to create a new button.
        }
        
    }
    
    public boolean checkNoteComplete() {
    	System.out.println(noteTitlePresent);
    	System.out.println(noteBodyPresent);
        if ((noteTitlePresent && noteBodyPresent)) {
        	System.out.println("oook");
            return true;
        }
        else { 
            return false; 
        }
    }
    public void setName(String name){
      
    }
    
    public void getName(){
      
    } 
    
   
    
    public void getBody(){
      
    }
}
