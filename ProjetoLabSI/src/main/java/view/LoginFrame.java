package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextArea;
import javax.swing.JLabel;
import javax.swing.JButton;

public class LoginFrame extends JFrame 
{

	private JPanel contentPane;
	private JPasswordField passwordField;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					LoginFrame frame = new LoginFrame();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	JButton cadastrarUsuario;
	JButton comando_sair;
	
	ActionListener cadastrarUsuario_click;
	ActionListener comando_sair_click;
	
	
	
	
	
	public LoginFrame() 
	{	
		final FormularioUsuarioFrame usuario = new FormularioUsuarioFrame();		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setTitle("Delegacia Virtual - Login");
		
		////////////////////////////////////////////////////////////////////////////////////////////
		//Eventos
		cadastrarUsuario_click = new ActionListener() 
		{		
			public void actionPerformed(ActionEvent e)
			{
				usuario.setVisible(true);
		
			}
		};
		
		
		comando_sair_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		};
		
		
		
		passwordField = new JPasswordField();
		passwordField.setBounds(24, 128, 137, 20);
		contentPane.add(passwordField);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(24, 103, 46, 14);
		contentPane.add(lblSenha);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setBounds(24, 11, 46, 14);
		contentPane.add(lblLogin);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(21, 47, 46, 14);
		contentPane.add(lblUsuario);
		
		textField = new JTextField();
		textField.setBounds(21, 72, 140, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		cadastrarUsuario = new JButton("Cadastrar Usuario");
		cadastrarUsuario.setBounds(24, 170, 144, 30);
		cadastrarUsuario.addActionListener(cadastrarUsuario_click);
		getContentPane().add(cadastrarUsuario);
		
		comando_sair = new JButton("Sair");
		comando_sair.setBounds(24, 221, 120, 30);
		comando_sair.addActionListener(comando_sair_click);
		getContentPane().add(comando_sair);
	}
}
