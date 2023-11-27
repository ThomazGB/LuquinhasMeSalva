package rachai.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validador {
	public static boolean validarSenha(String input) {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

	public static boolean validarNome(String nome) {
		String padraoRegex = "^[a-zA-Z ]+$";
		Pattern pattern = Pattern.compile(padraoRegex);
		Matcher matcher = pattern.matcher(nome);
		return matcher.matches();
	}
}
