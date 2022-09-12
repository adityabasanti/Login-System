import java.util.HashMap;

public class IDsandPasswords { //HashMap stores key-value pairs
	HashMap<String ,String> logininfo = new HashMap<String,String>();
	
	IDsandPasswords(){ // Constructor for ID and passwords class
		logininfo.put("Aditya", "science"); // To put key-value pairs use the "put" function
		logininfo.put("Eddy", "PYTHON");
		logininfo.put("ArIous", "abc123");
	}
	
	protected HashMap getLoginInfo(){ //If anyone calls this method it will send to logininfo(HashMap is the return type
		return logininfo;
	}
	
	
	

}
