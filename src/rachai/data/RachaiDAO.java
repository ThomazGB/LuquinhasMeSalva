package rachai.data;

import rachai.models.User;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class RachaiDAO extends User {

	private List<User> lista = new ArrayList<>();

	public void criar (User newUser) {
		lista.add(newUser);
	}

	public void list() {
		for(User user : lista) {
			System.out.println(" - Nome: " + user.getNome());
			System.out.println("RA: " + user.getRA());
			System.out.println("Modelo: " + user.getModeloCarro());
			System.out.println("Placa: " + user.getPlacaCarro() + "\n");			
		}
	}

	//	public void update(int index, User newUser, String updatedName, String updatedRA, String updatedModelo, String updatedPlaca) {
	//		if (index < 0 || lista[index]==null) {
	//			System.out.println("Indice invalido, nenhum item atualizado.");
	//		} else {
	//			lista[index].setNome(updatedName);
	//			lista[index].setRA(updatedRA);
	//			lista[index].setModeloCarro(updatedModelo);
	//			lista[index].setPlacaCarro(updatedPlaca);
	//			System.out.println("Item atualizado com sucesso.");
	//		}
	//	}

	//função para validar se a senha tem pelo menos uma maiúscula


	//método para verificar os campos
	private static void verificarCampos(JTextField... campos) {
		boolean peloMenosUmVazio = false;
		for (JTextField campo : campos) {
			if (campo.getText().isEmpty()) {
				peloMenosUmVazio = true;
				break;

			}
		}
		if (peloMenosUmVazio) {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos antes de continuar.", "Campos Vazios", JOptionPane.WARNING_MESSAGE);
		}
	}

}
	/* public void delete (int index, User newUser) {
        if (index < 0 || lista[index]==null) {
        	System.out.println("Indice invalido, nenhum item foi deletado.");
        } else {

        	User user = new User();
        	User novaLista[] = new User [10];

        	for(int i=0; lista[index]!=null; i++) {

        		if ( lista[i].getNome()!=null) {
        		novaLista[index] = newUser;
        		index++;     		
        		}

        	lista = novaLista;
            System.out.println("Item deletado com sucesso.");

        	}        
        }
    } */

	//	public void delete(String ra) {
	//		for(int i = 0; i < index; i++) {
	//
	//			if (lista[i].getRA().equals(ra)) {
	//
	//				for(int j = i; j < index - 1; j++) { // conta todos os items pra frente do item que vai ser deletado menos o último
	//					lista[j] = lista[j+1]; // joga todos os elementos que estavam na frente para trás
	//				} 
	//				index--; // diminui o tamanho do index em 1 para que a próxima adição esteja no lugar certo
	//				lista[index] = null; // limpa a ultima posição que está vazia
	//				System.out.println("Usuário com RA " + ra + " deletado com sucesso.");
	//				return;
	//			}
	//			System.out.println("Usuário com RA " + ra + " não encontrado.");
	//		}
	//	}
	//	public boolean  findbyRA(String string) {
	//		for(int i = 0; i < index; i++) {
	//
	//			if (lista[i].getRA().equals(string)) {
	//
	//				return true;
	//			}
	//
	//		}
	//		return false;
	//	}
	//	
	//	
	//}