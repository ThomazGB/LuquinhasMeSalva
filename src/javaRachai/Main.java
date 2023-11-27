package javaRachai;

import rachaiFront.Login;
import rachaiFront.Registro;

public class Main {
	public static void main(String[] args) {
		
		Login login = new Login();
		Registro registro = new Registro();
		login.telaLogin();
		registro.telaRegistro();
		
	}
	
	public static void trocarTela(String tela)	{
	}
}






/*
import org.gamix.DAO.UserDAO;

public class Main {  
    public static void main(String[] args) {
    	UserDAO DAO = new UserDAO();
		Register register = new Register();
    	Home home = new Home();
    	Update update = new Update();
    	Login login = new Login(register, home);
    	UserProfile profile = new UserProfile(update, login, home);
    	
    	register.setRegister(login);
    	home.setHome(login, profile);
    	update.getUpdate(profile);
  	
    	login.loginScreen(DAO);
    }	
}
*/