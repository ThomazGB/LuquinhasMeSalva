package rachai.screens;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import rachai.data.RachaiDAO;
import rachai.models.User;
import rachai.utils.Navigate;
import rachai.utils.Validador;

public class Registro {
	private static JLabel nome;
	private static JTextField nomeTXT;
	private static JLabel ra;
	private static JTextField raTXT;
	private static JLabel modelo;
	private static JTextField modeloTXT;
	private static JLabel placa;
	private static JTextField placaTXT;
	private static JLabel senha;
	private static JPasswordField senhaTXT;
	private static JButton alterar;
	private JButton cadastrar;
	private static ImageIcon logoIMG=new ImageIcon("MicrosoftTeams-image.png");
	private static JLabel logo;
	private Navigate navigate;

	public void setNavigate(Navigate navigate) {
		this.navigate = navigate;
	}

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

	public JLabel logoRachai() {
		logo = new JLabel (logoIMG);
		logo.setIcon(logoIMG);
		logo.setBounds(96,0,100,100);
		return logo;
	}

	public JLabel labelNome() {
		nome = new JLabel("Nome:");
		nome.setBounds(10, 90, 80, 25);
		return nome;
	}

	public JTextField textNome() {
		nomeTXT = new JTextField();
		nomeTXT.setBounds(120, 90, 165, 25);
		return nomeTXT;
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

	public JLabel labelModeloCarro() {
		modelo = new JLabel("Modelo do Carro:");
		modelo.setBounds(10, 150, 100, 25);
		return modelo;
	}

	public JTextField textModeloCarro() {	
		modeloTXT = new JTextField();
		modeloTXT.setBounds(120, 150, 165, 25);
		return modeloTXT;
	}

	public JLabel labelPlacaCarro() {
		placa = new JLabel("Placa do Carro:");
		placa.setBounds(10, 180, 100, 25);
		return placa;
	}

	public JTextField textPlacaCarro() {
		placaTXT = new JTextField();
		placaTXT.setBounds(120, 180, 165, 25);
		return placaTXT;
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

	public JButton botaoCadastrar() {
		cadastrar = new JButton("Cadastrar");
		cadastrar.setBounds(185, 240, 100, 25);
		cadastrar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				User user = new User();
				char[] caracteresSenha = senhaTXT.getPassword();
				String senha = new String(caracteresSenha);
				RachaiDAO dao = new RachaiDAO();
				
				if(!Validador.validarNome(nomeTXT.getText())) {
					JOptionPane.showMessageDialog(null, "O seu nome tem caracteres inválidos", "Cadastro", JOptionPane.WARNING_MESSAGE);					
					if(!Validador.validarSenha(senha)) {
						JOptionPane.showMessageDialog(null, "A senha precisa possuir 8 caracteres, "
								+ "1 letra maiúscula e 1 caracter especial.", "Cadastro", JOptionPane.WARNING_MESSAGE);

					} else {
						dao.criar(user);
						JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso", "Cadastro", JOptionPane.DEFAULT_OPTION);
					}
				}
			}
		});
		return cadastrar;
	}

	public JButton botaoAlterarCadastro() {
		alterar = new JButton("Alterar Cadastro");
		alterar.setBounds(155, 270, 130, 25);
		alterar.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
                navigate.setActualScreen("login");
            }
        });

		return alterar;
	}

	public JFrame telaRegistro() {
		//tela principal
		JFrame tela = new JFrame();
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
		tela.getContentPane().add(botaoAlterarCadastro());

		return tela;
	}

}



