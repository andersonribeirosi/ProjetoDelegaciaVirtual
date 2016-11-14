package dao;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import view.FormularioCadastroOcorrencia;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;

public class Login extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textLogin;
	private JPasswordField passwordField;
	private JLabel lblLogin_1;
	private JLabel lblEntreComOs;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textLogin = new JTextField();
		textLogin.setBounds(162, 119, 150, 20);
		contentPane.add(textLogin);
		textLogin.setColumns(10);

		JButton btnAcessar = new JButton("Acessar");
		btnAcessar.setBounds(186, 239, 91, 23);
		btnAcessar.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {

				Acesso cl = new Acesso();

				cl.acesso(textLogin.getText(), passwordField.getText());

				if (cl.acesso == true) {

					FormularioCadastroOcorrencia form = new FormularioCadastroOcorrencia();
					form.show();

				}
			}
		});
		contentPane.add(btnAcessar);

		JLabel lblLogin = new JLabel("Usu\u00E1rio");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblLogin.setBounds(118, 122, 46, 14);
		contentPane.add(lblLogin);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblSenha.setBounds(118, 158, 46, 14);
		contentPane.add(lblSenha);

		passwordField = new JPasswordField();
		passwordField.setBounds(162, 155, 150, 20);
		contentPane.add(passwordField);
		
		lblLogin_1 = new JLabel("Login");
		lblLogin_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLogin_1.setBounds(48, 26, 119, 32);
		contentPane.add(lblLogin_1);
		
		lblEntreComOs = new JLabel("Entre com os dados corretamente para acessar o sistema.");
		lblEntreComOs.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblEntreComOs.setBounds(48, 59, 346, 14);
		contentPane.add(lblEntreComOs);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mantenha-me conectado");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 10));
		chckbxNewCheckBox.setBackground(Color.LIGHT_GRAY);
		chckbxNewCheckBox.setBounds(115, 194, 197, 23);
		contentPane.add(chckbxNewCheckBox);

	}
}
