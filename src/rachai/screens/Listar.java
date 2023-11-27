package rachai.screens;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Listar implements ActionListener{
	
	private static JLabel alterar;
	private static JTextField alterarTXT;
	private static JButton alterarBUT;
	private static JButton deletarBUT;
	private static JLabel sucesso;
	
	private static ImageIcon logoIMG=new ImageIcon("MicrosoftTeams-image.png");
	private static JLabel logo;
	
	public static void main(String[] args) {
		
				
		//Frame principal
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		frame.setResizable(false);

		frame.setSize(1080, 720);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		//logo
		//logoIMG = new ImageIcon(get.Class().get.Resource("potote.jpeg"));
		logo = new JLabel (logoIMG);
		logo.setIcon(logoIMG);
		logo.setBounds(85,0,100,100);
		panel.add(logo);
	
		
		//Texto alterar
		alterar = new JLabel("Qual dos seguintes dados deseja alterar/ deletar?");
		alterar.setBounds(10, 100, 500, 25);
		panel.add(alterar);
		
		alterarTXT = new JTextField();
		alterarTXT.setBounds(380, 100, 20, 25);
		panel.add(alterarTXT);
		
		//Botão de alterar cadastro
		alterarBUT = new JButton("Alterar");
		alterarBUT.setBounds(10, 130, 80, 25);
		panel.add(alterarBUT);
		
		//Botão de deletar cadastro
		deletarBUT = new JButton("Deletar");
		deletarBUT.setBounds(200, 130, 80, 25);
		panel.add(deletarBUT);
				
		
		//Feedback
		sucesso = new JLabel("");
		sucesso.setBounds(10, 150, 300, 25);
		panel.add(sucesso);
		sucesso.setText(null);
		
		
		frame.setVisible(true);
		
		
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}