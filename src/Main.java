
public class Main {

	public static void main(String[] args) {
		 IDsandPasswords idandpasswords = new IDsandPasswords();
		 
//		Will send our logininfo as an argument to our login page. idandpasswords.getLoginInfo() will return HashMap
		 LoginPage loginPage = new LoginPage(idandpasswords.getLoginInfo());
	}

}
