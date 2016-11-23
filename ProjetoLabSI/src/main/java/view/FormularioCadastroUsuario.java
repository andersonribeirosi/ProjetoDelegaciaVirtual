package view;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ConexaoController;
import controller.UsuarioController;
import model.Usuario;

public class FormularioCadastroUsuario extends JFrame {
	
	Usuario usuario = new Usuario();
	UsuarioController controle = new UsuarioController();
	ConexaoController connex = new ConexaoController();
	
	
	private static final long serialVersionUID = 1L;
	private JTextField tf_nome;
	private JTextField tf_data;
	private JTextField tf_rg;
	private JTextField tf_cpf;
	private JTextField tf_senha;

	JLabel lb_usuario, lb_cpf, lb_rg, lb_dataDeNascimento, lb_senha;
	JTextField tf_usuario;
	JButton bt_salvar, bt_limpar, bt_fechar;

	public FormularioCadastroUsuario() {
		getContentPane().setBackground(Color.LIGHT_GRAY);

		// JOptionPane.showMessageDialog(null, "Cadastrar Usuario");
		setTitle("Cadastro de Usuario");
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		lb_usuario = new JLabel("Usuario");
		lb_usuario.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb_cpf = new JLabel("CPF");
		lb_cpf.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb_rg = new JLabel("RG");
		lb_rg.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb_dataDeNascimento = new JLabel("Data de Nascimento");
		lb_dataDeNascimento.setFont(new Font("Tahoma", Font.BOLD, 11));
		lb_senha = new JLabel("Senha");
		lb_senha.setFont(new Font("Tahoma", Font.BOLD, 11));

		tf_usuario = new JTextField("");

		bt_salvar = new JButton("Salvar");
		bt_salvar.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {

				usuario.setLogin(tf_nome.getText());
				usuario.setData_nasc(tf_data.getText());
				usuario.setCpf(tf_cpf.getText());
				usuario.setRg(tf_rg.getText());
				usuario.setSenha(tf_senha.getText());
				

				controle.salvarUsuario(usuario);
				
				new Login().show();  //retorna pra tela principal
				dispose();

			}
		});

		bt_limpar = new JButton("Limpar");
		bt_limpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				tf_nome.setText(null);
				tf_data.setText(null);
				tf_cpf.setText(null);
				tf_rg.setText(null);
				tf_senha.setText(null);
				
				
			}
		});
		
		
		
		bt_fechar = new JButton("Fechar");
		bt_fechar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {

				new Login().show(); // retorna pra tela principal
				dispose();

			}
		});

		getContentPane().setLayout(null);
		getContentPane().add(lb_usuario);
		getContentPane().add(lb_cpf);
		getContentPane().add(lb_rg);
		getContentPane().add(lb_dataDeNascimento);
		getContentPane().add(lb_senha);

		getContentPane().add(tf_usuario);

		getContentPane().add(bt_salvar);
		getContentPane().add(bt_limpar);
		getContentPane().add(bt_fechar);

		lb_usuario.setBounds(20, 44, 100, 15);

		lb_cpf.setBounds(202, 107, 100, 15);

		lb_rg.setBounds(20, 107, 100, 15);

		lb_dataDeNascimento.setBounds(326, 44, 163, 15);

		lb_senha.setBounds(20, 162, 150, 15);

		bt_salvar.setBounds(20, 340, 80, 30);
		bt_limpar.setBounds(105, 340, 80, 30);
		bt_fechar.setBounds(190, 340, 80, 30);

		tf_nome = new JTextField();
		tf_nome.setBounds(20, 64, 206, 20);
		getContentPane().add(tf_nome);
		tf_nome.setColumns(10);

		tf_data = new JTextField();
		tf_data.setBounds(326, 64, 172, 20);
		getContentPane().add(tf_data);
		tf_data.setColumns(10);

		tf_rg = new JTextField();
		tf_rg.setBounds(20, 124, 163, 20);
		getContentPane().add(tf_rg);
		tf_rg.setColumns(10);

		tf_cpf = new JTextField();
		tf_cpf.setBounds(201, 124, 206, 20);
		getContentPane().add(tf_cpf);
		tf_cpf.setColumns(10);

		tf_senha = new JTextField();
		tf_senha.setBounds(20, 179, 163, 20);
		getContentPane().add(tf_senha);
		tf_senha.setColumns(10);

		JLabel lblCadastroDeUsuario = new JLabel("Cadastro de Usu\u00E1rio");
		lblCadastroDeUsuario.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCadastroDeUsuario.setBounds(20, 11, 216, 14);
		getContentPane().add(lblCadastroDeUsuario);
	}

	public static void main(String args[]) {
		new FormularioCadastroUsuario().setVisible(true);
	}
}
