public class Notes {

    private String name;
    private String body;
    
    public void addNote() {
        //Upon note creation, call setNoteTitle() and setNoteBody().
        noteTitlePresent = setNoteTitle();
        noteBodyPresent = setNoteBody();
        
    }
    
    public boolean setNoteTitle() {
        
    }
    
    public boolean setNoteBody(String body){
      
    }
    
    public void saveChanges() {
        noteFinished = checkNoteComplete();
        
    }
    
    public boolean checkNoteComplete() {
        if ((noteTitlePresent && noteBodyPresent)) {
            return true;
        }
        else { 
            return false; 
        }
    }
    public void setName(String name){
      
    }
    
    public String getName(){
      
    } 
    
   
    
    public String getBody(){
      
    }
}
