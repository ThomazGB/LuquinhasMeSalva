package rachaiFront;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
//import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javaRachai.RachaiDAO;
//import rachaiFront.Alterar;

public class Login extends RachaiDAO implements ActionListener{
	
	private static JFrame telaLogin;
	private static JLabel ra;
	private static JTextField raTXT;
	private static JLabel senha;
	private static JPasswordField senhaTXT;
	private static JButton alterar;
	private static ImageIcon logoIMG=new ImageIcon("MicrosoftTeams-image.png");
	private static JLabel logo;
		
	public JLabel logoRachai() {
		logo = new JLabel (logoIMG);
		logo.setIcon(logoIMG);
		logo.setBounds(96,0,100,100);
		return logo;
	}
	
	public JLabel labelRA() {
		ra = new JLabel("R.A.:");
		ra.setBounds(10, 120, 140, 25);
		return ra;
	}

	public JTextField textRA() {
		raTXT = new JTextField();
		raTXT.setBounds(120, 120, 165, 25);
		return raTXT;
	}
	
	public JLabel labelSenha() {
		senha = new JLabel("Senha:");
		senha.setBounds(10, 210, 80, 25);
		return senha;
	}

	public JTextField textSenha() {
		senhaTXT = new JPasswordField();
		senhaTXT.setBounds(120, 210, 165, 25);
		return senhaTXT;

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		new Alterar();
		
	}

	public void telaLogin() {
			//tela principal
			tela = new JFrame();
			tela.setSize(320, 500);
			tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			tela.getContentPane().setBackground(Color.decode("#EFEFEF"));
			tela.setResizable(false);
			tela.setLocationRelativeTo(null);
			tela.setLayout(null);
			tela.setTitle("Cadastro");

			tela.getContentPane().add(logoRachai());
			tela.getContentPane().add(labelNome());
			tela.getContentPane().add(textNome());
			tela.getContentPane().add(labelRA());
			tela.getContentPane().add(textRA());
			tela.getContentPane().add(labelModeloCarro());
			tela.getContentPane().add(textModeloCarro());
			tela.getContentPane().add(labelPlacaCarro());
			tela.getContentPane().add(textPlacaCarro());
			tela.getContentPane().add(labelSenha());
			tela.getContentPane().add(textSenha());
			tela.getContentPane().add(botaoCadastrar());
//			tela.getContentPane().add(botaoAlterarCadastro());

			tela.setVisible(true);
		}
		
	}

}

