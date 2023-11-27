package rachai;

import rachai.screens.Login;
import rachai.screens.Registro;
import rachai.utils.Navigate;

public class Main {
	public static void main(String[] args) {
		Login login = new Login();
		Registro registro = new Registro();
		Navigate navigate = new Navigate(
			login.telaLogin(), registro.telaRegistro()
		);
		login.setNavigate(navigate);
		registro.setNavigate(navigate);
		
		navigate.show();
	}
	
	public static void trocarTela(String tela)	{
	}
}