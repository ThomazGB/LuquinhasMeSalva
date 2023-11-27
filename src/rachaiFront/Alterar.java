package rachaiFront;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
//import javaRachai.User;

public class Alterar implements ActionListener {
	private static JLabel modelo;
	private static JTextField modeloTXT;
	private static JLabel placa;
	private static JTextField placaTXT;
	private static JLabel senha;
	private static JPasswordField senhaTXT;
	private static JButton alterar;
	private static JLabel sucesso;
	
	
	private static ImageIcon logoIMG=new ImageIcon("MicrosoftTeams-image.png");
	private static JLabel logo;

	public static void main(String[] args) {
		
		new Alterar();
		
		//Frame principal
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setResizable(false);
		frame.setSize(320, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		//logo
		//logoIMG = new ImageIcon(get.Class().get.Resource("potote.jpeg"));
		logo = new JLabel (logoIMG);
		logo.setIcon(logoIMG);
		logo.setBounds(85,0,100,100);
		panel.add(logo);
					
		
			
		//Modelo do carro
		modelo = new JLabel("Novo Modelo do Carro:");
		//x,y,largura,altura
		modelo.setBounds(10, 100, 80, 25);
		panel.add(modelo);
		
		modeloTXT = new JTextField();
		modeloTXT.setBounds(100, 100, 165, 25);
		panel.add(modeloTXT);
		
		//Placa do carro
		placa = new JLabel("Nova Placa do Carro:");
		placa.setBounds(10, 130, 80, 25);
		panel.add(placa);
		
		placaTXT = new JTextField();
		placaTXT.setBounds(100, 130, 165, 25);
		panel.add(placaTXT);
		
		//Senha
		senha = new JLabel("Nova Senha:");
		senha.setBounds(10, 160, 80, 25);
		panel.add(senha);
		
		senhaTXT = new JPasswordField();
		senhaTXT.setBounds(100, 160, 165, 25);
		panel.add(senhaTXT);
		
			
		//Botão de cadastro
		alterar = new JButton("Alterar Cadastro");
		alterar.setBounds(10, 220, 80, 25);
		panel.add(alterar);
		
		//Feedback
		sucesso = new JLabel("");
		sucesso.setBounds(10, 110, 300, 25);
		panel.add(sucesso);
		sucesso.setText(null);
		
		
		frame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		new Listar();
		
	}

}
