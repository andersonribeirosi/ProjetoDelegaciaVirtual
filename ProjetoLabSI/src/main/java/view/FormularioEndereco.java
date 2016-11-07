package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FormularioEndereco extends JFrame 
{	
	private static final long serialVersionUID = 1L;


	JLabel lb_rua, lb_numero, lb_bairro, lb_cidade;
	JTextField tf_rua, tf_numero, tf_bairro, tf_cidade;
	//JComboBox<String> cb_tipo_da_ocorrencia, cb_acidente_de_transito;
	JButton bt_salvar, bt_limpar, bt_fechar;
	private JLabel lblCep;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblComplemento;

	public FormularioEndereco()
	{

		setTitle("Dados do Endereco");
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		lb_rua = new JLabel("Rua");
		lb_numero = new JLabel("Numero");
		lb_bairro = new JLabel("Bairro");
		lb_cidade = new JLabel("Cidade");
		
	
		
		tf_rua = new JTextField("");
		tf_numero = new JTextField("");
		tf_bairro = new JTextField("");
		tf_cidade = new JTextField("");
	
		
		bt_salvar = new JButton("Salvar");
		bt_limpar = new JButton("Limpar");
		bt_fechar = new JButton("Fechar");
		
		getContentPane().setLayout(null);
		getContentPane().add(lb_rua);
		getContentPane().add(lb_numero);
		getContentPane().add(lb_bairro);
		getContentPane().add(lb_cidade);
		
		getContentPane().add(tf_rua);
		getContentPane().add(tf_numero);
		getContentPane().add(tf_bairro);
		getContentPane().add(tf_cidade);
		
		getContentPane().add(bt_salvar);
		getContentPane().add(bt_limpar);
		getContentPane().add(bt_fechar);
		
		lb_rua.setBounds(20, 20, 100, 15);
		tf_rua.setBounds(20, 40, 342, 25);
		
		lb_numero.setBounds(372, 20, 100, 15);
		tf_numero.setBounds(372, 40, 150, 25);
		
		lb_bairro.setBounds(20, 76, 100, 15);
		tf_bairro.setBounds(20, 96, 150, 25);
					
		lb_cidade.setBounds(180, 76, 150, 15);
		tf_cidade.setBounds(180, 96, 182, 25);
	
		
		bt_salvar.setBounds(20, 340, 80, 30);
		bt_limpar.setBounds(105, 340, 80, 30);
		bt_fechar.setBounds(190, 340, 80, 30);
		
		lblCep = new JLabel("CEP");
		lblCep.setBounds(372, 76, 46, 14);
		getContentPane().add(lblCep);
		
		textField = new JTextField("");
		textField.setBounds(372, 96, 150, 25);
		getContentPane().add(textField);
		
		textField_1 = new JTextField("");
		textField_1.setBounds(20, 156, 150, 25);
		getContentPane().add(textField_1);
		
		lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(20, 136, 100, 15);
		getContentPane().add(lblComplemento);
	}

	public static void main(String args[]) 
	{	new FormularioEndereco().setVisible(true);

	}
}
