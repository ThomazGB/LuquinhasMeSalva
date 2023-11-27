package rachai.screens;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import rachai.utils.Navigate;

public class Login {
	private static ImageIcon logoIMG = new ImageIcon("images/logo.png");
	private static JLabel ra;
	private static JTextField raTXT;
	private static JLabel senha;
	private static JPasswordField senhaTXT;
	private static JButton login;
	private static JButton cadastrarSe;
	private static JLabel logo;

	private Navigate navigate;
	public void setNavigate(Navigate navigate) {
		this.navigate = navigate;
	}
		
	public JLabel logoRachai() {
		logo = new JLabel (logoIMG);
		logo.setIcon(logoIMG);
		logo.setBounds(96,0,100,100);
		return logo;
	}
	
	public JLabel labelRA() {
		ra = new JLabel("R.A.:");
		ra.setBounds(10, 120, 80, 25);
		return ra;
	}

	public JTextField textRA() {
		raTXT = new JTextField();
		raTXT.setBounds(120, 120, 165, 25);
		return raTXT;
	}
	
	public JLabel labelSenha() {
		senha = new JLabel("Senha:");
		senha.setBounds(10, 160, 140, 25);
		return senha;
	}

	public JTextField textSenha() {
		senhaTXT = new JPasswordField();
		senhaTXT.setBounds(120, 160, 165, 25);
		return senhaTXT;

	}
	
	public JButton botaoLogin() {
		login = new JButton("Conectar-se");
		login.setBounds(185, 240, 100, 25);
		login.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			}
		});
		return login;
	}
	
	public JButton botaoFazerCadastro() {
		cadastrarSe = new JButton("Cadastrar-se");
		cadastrarSe.setBounds(155, 280, 130, 25);
		cadastrarSe.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                navigate.setActualScreen("registro");
            }
        });

		return cadastrarSe;
	}

	public JFrame telaLogin() {
		//tela principal
		JFrame tela = new JFrame();
		tela.setSize(320, 500);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.getContentPane().setBackground(Color.decode("#EFEFEF"));
		tela.setResizable(false);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setTitle("Conectar-se");

		tela.getContentPane().add(logoRachai());
		tela.getContentPane().add(labelRA());
		tela.getContentPane().add(textRA());
		tela.getContentPane().add(labelSenha());
		tela.getContentPane().add(textSenha());
		tela.getContentPane().add(botaoLogin());
		tela.getContentPane().add(botaoFazerCadastro());

		return tela;
	}
	
}

