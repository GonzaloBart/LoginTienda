import dao.LoginDao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String n = "admin@tiendaonline.es";
		String p = "1234";
		
		if (LoginDao.checkUserLogin(n, p)) {
			System.out.println("Bien");
		
		} else {
			System.out.println("Mal");
		}		
		
		
	}

}
