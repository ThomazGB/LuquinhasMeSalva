package javaRachai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utilidade {


	public static boolean validarSenha(String input) {

		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!])(?=\\S+$).{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	}

	//função para validar se o nome tem caracteres numéricos
	public static boolean validarNome(String nome) {
		String padraoRegex = "^[a-zA-Z ]+$";
		Pattern pattern = Pattern.compile(padraoRegex);
		Matcher matcher = pattern.matcher(nome);
		return matcher.matches();
	}
}

//Teste12345!