package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormularioCadastroUsuario extends JFrame
{	
	private static final long serialVersionUID = 1L;
	
	JLabel lb_usuario, lb_cpf,  lb_rg, lb_dataDeNascimento, lb_senha;
	JTextField tf_usuario, tf_cpf,  tf_rg, tf_dataDeNascimento, tf_senha;
	JComboBox<String> cb_usuario;
	JButton bt_salvar, bt_limpar, bt_fechar;
	
	public FormularioCadastroUsuario(){
		getContentPane().setBackground(Color.LIGHT_GRAY);

//		JOptionPane.showMessageDialog(null, "Cadastrar Usuario");
		setTitle("Cadastro de Usuario");
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		lb_usuario = new JLabel("Usuario");
		lb_cpf = new JLabel("CPF");
		lb_rg = new JLabel("RG");
		lb_dataDeNascimento = new JLabel("Data de Nascimento");
		lb_senha = new JLabel("Cadastro de Senha");
		
		tf_usuario = new JTextField("");
		tf_cpf = new JTextField("");
		tf_rg = new JTextField("");
		tf_dataDeNascimento = new JTextField("");
		tf_senha = new JTextField("");
	
		
		cb_usuario = new JComboBox<String>();
		cb_usuario.setBackground(Color.LIGHT_GRAY);
		
		bt_salvar = new JButton("Salvar");
		bt_limpar = new JButton("Limpar");
		bt_fechar = new JButton("Fechar");
		
		cb_usuario.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] 
				{ "Selecione um Usuario", "João",
				"Antonio", "Zé", "Biu"}));
		
		getContentPane().setLayout(null);
		getContentPane().add(lb_usuario);
		getContentPane().add(lb_cpf);
		getContentPane().add(lb_rg);
		getContentPane().add(lb_dataDeNascimento);
		getContentPane().add(lb_senha);
				
		getContentPane().add(cb_usuario);
		
		getContentPane().add(tf_usuario);
		getContentPane().add(tf_cpf);
		getContentPane().add(tf_rg);
		getContentPane().add(tf_dataDeNascimento);
		getContentPane().add(tf_senha);
		
		getContentPane().add(cb_usuario);

		getContentPane().add(bt_salvar);
		getContentPane().add(bt_limpar);
		getContentPane().add(bt_fechar);
		
		lb_usuario.setBounds(20, 20, 100, 15);
		cb_usuario.setBounds(20, 40, 170, 25);
		
		lb_cpf.setBounds(180, 76, 100, 15);
		tf_cpf.setBounds(180, 96, 197, 25);
		
		lb_rg.setBounds(20, 76, 100, 15);
		tf_rg.setBounds(20, 96, 150, 25);		
		
		lb_dataDeNascimento.setBounds(330, 25, 300, 15);
		tf_dataDeNascimento.setBounds(330, 45, 180, 20);
		
		lb_senha.setBounds(20, 143, 150, 15);
		tf_senha.setBounds(20, 163, 150, 25);
		
		
		bt_salvar.setBounds(20, 340, 80, 30);
		bt_limpar.setBounds(105, 340, 80, 30);
		bt_fechar.setBounds(190, 340, 80, 30);
	}

	public static void main(String args[]) {
		new FormularioCadastroUsuario().setVisible(true);
	}

}
