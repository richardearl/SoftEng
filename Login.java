public class Login {

  private boolean userLogin =  false;    
  private String userID = "";

	public Login(boolean userLogin, String userID){
		setUserLogin(userLogin);
		setUserID(userID);
	}
	
	public void resetVariable() {
		setUserLogin(false);
		setUserID("");
		setUserType("");
	}
	
  public void setUserLogin(boolean userLogin) {
      this.userLogin = userLogin;
  }
  
  public boolean isUserLogin() {
      return userLogin;
  }
  
  public void setUserID(String userID) {
      this.userID = userID;
  }
  
  public String getUserID() {
      return userID;
  }
  
  public void setUserType(String userType) {
      this.userType = userType;
  }
  
  public String getUserType () {
      return userType;
  }     
    
}

}
