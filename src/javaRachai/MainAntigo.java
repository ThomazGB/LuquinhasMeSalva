//package javaRachai;
//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String args[]) {
//
//		boolean conti = true;
//		Scanner input = new Scanner(System.in);
//		RachaiDAO rachaiDAO = new RachaiDAO();
//
//
//		while (conti) {
//			System.out.println("Qual operacao voce deseja fazer?");
//			System.out.println("1 - Criar");
//			System.out.println("2 - Listar");
//			System.out.println("3 - Atualizar");
//			System.out.println("4 - Deletar");
//			System.out.println("5 - Fechar");
//
//			int choice = input.nextInt();
//
//			switch (choice) {
//
//			case 1:				
//				User user = new User();
//
//				System.out.println("Informe o seu nome:");
//				String novoNome = input.next();
//				user.setNome(novoNome);
//
//				System.out.println("Informe o RA:");
//				String novoRA = input.next();
//				if (rachaiDAO.findbyRA(novoRA)) {
//					System.out.println("O RA ja foi informado anteriormente!");
//					break;
//				}
//				user.setRA(novoRA);
//
//				System.out.println("Informe o modelo do carro:");
//				String novoModelo = input.next();
//				user.setModeloCarro(novoModelo);
//
//				System.out.println("Informe a placa do carro:");
//				String novaPlaca = input.next();
//				user.setPlacaCarro(novaPlaca);
//
//				rachaiDAO.criar(user);
//				System.out.println("Item adicionado à lista.");
//				break;
//
//			case 2: 
//				rachaiDAO.list();
//				break;
//
//			case 3:				
//				rachaiDAO.list();
//
//				System.out.println("Qual e o indice do usuario que deseja atualizar?");
//				int indexUpdate = input.nextInt();
//
//				System.out.println("Digite o novo nome desejado:");
//				String updatedName = input.next();
//				User updatedUser = new User();
//
//				System.out.println("Informe o RA:");
//				String updatedRA = input.next();			
//
//				System.out.println("Informe o modelo do carro:");
//				String updatedModelo = input.next();
//
//				System.out.println("Informe a placa do carro:");
//				String updatedPlaca = input.next();
//
//				rachaiDAO.update(indexUpdate, updatedUser, updatedName, updatedRA, updatedModelo, updatedPlaca);
//				break;
//
//			case 4:
//				rachaiDAO.list();
//
//				System.out.println("Qual o RA do usuario que deseja deletar?");
//				String deletedRA = input.next();
//
//				rachaiDAO.delete(deletedRA);
//				break;
//
//			case 5: 
//				conti = false;
//				break;
//
//			default:
//				System.out.println("Opcao invalida");
//				break;
//			}
//		}
//		input.close();
//	}
//}
package javaRachai;

