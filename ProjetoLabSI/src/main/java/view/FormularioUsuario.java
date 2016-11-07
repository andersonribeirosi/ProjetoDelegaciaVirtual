package view;

import javax.swing.JButton;
//import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioUsuario extends JFrame 
{	
private static final long serialVersionUID = 1L;
	
	JLabel lb_id_usuario, lb_nome, lb_Endereco, lb_telefones;
	JTextField tf_id_usuario, tf_nome, tf_Endereco, tf_telefones;
	//JComboBox<String> cb_tipo_da_ocorrencia, cb_acidente_de_transito;
	JButton bt_salvar, bt_limpar, bt_fechar;
	
	public FormularioUsuario(){

		JOptionPane.showMessageDialog(null, "Dados do Usuario");
		setTitle("Dados do Usuario");
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		lb_id_usuario = new JLabel("id_usuario:");
		lb_nome = new JLabel("Nome:");
		lb_Endereco = new JLabel("Endereco");
		lb_telefones = new JLabel("Telefones:");
		
		tf_id_usuario = new JTextField("");
		tf_nome = new JTextField("");
		tf_Endereco = new JTextField("");
		tf_telefones = new JTextField("");
				
		bt_salvar = new JButton("Salvar");
		bt_limpar = new JButton("Limpar");
		bt_fechar = new JButton("Fechar");
				
		getContentPane().setLayout(null);
		getContentPane().add(lb_id_usuario);
		getContentPane().add(lb_nome);
		getContentPane().add(lb_Endereco);
		getContentPane().add(lb_telefones);
		
		getContentPane().add(tf_id_usuario);
		getContentPane().add(tf_nome);
		getContentPane().add(tf_Endereco);
		getContentPane().add(tf_telefones);
		
		getContentPane().add(bt_salvar);
		getContentPane().add(bt_limpar);
		getContentPane().add(bt_fechar);
		
		lb_id_usuario.setBounds(20, 20, 100, 15);
		tf_id_usuario.setBounds(20, 40, 80, 25);
		
		lb_nome.setBounds(118, 20, 100, 15);
		tf_nome.setBounds(118, 40, 400, 25);
		
		lb_Endereco.setBounds(20, 70, 100, 15);
		tf_Endereco.setBounds(20, 90, 500, 25);
				
		lb_telefones.setBounds(20, 180, 150, 15);
		tf_telefones.setBounds(20, 200, 100, 25);
		
		
		bt_salvar.setBounds(20, 340, 80, 30);
		bt_limpar.setBounds(105, 340, 80, 30);
		bt_fechar.setBounds(190, 340, 80, 30);
	}

	public static void main(String args[]) {
		new FormularioUsuario().setVisible(true);
	}

}
