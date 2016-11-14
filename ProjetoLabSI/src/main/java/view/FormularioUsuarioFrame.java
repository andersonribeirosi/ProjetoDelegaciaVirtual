package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import javax.swing.JPasswordField;

public class FormularioUsuarioFrame extends JFrame 
{

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioUsuarioFrame frame = new FormularioUsuarioFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static final long serialVersionUID = 1L;
	
	JLabel lb_id_usuario, lb_nome, lb_telefones;
	JTextField tf_id_usuario, tf_nome, tf_telefones;
	//JComboBox<String> cb_tipo_da_ocorrencia, cb_acidente_de_transito;
	JButton bt_salvar, 
			bt_limpar, 
			bt_fechar;
	
	JButton cadastrarEndereco;
	
	ActionListener cadastrarEndereco_click;
	ActionListener bt_fechar_click;
	private JLabel bt_RG;
	private JLabel bt_CPF;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Create the frame.
	 */
	public FormularioUsuarioFrame() 
	{	
		
		final FormularioEnderecoFrame endereco = new FormularioEnderecoFrame();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setTitle("Cadastro de Usuario");
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		//eventos
		cadastrarEndereco_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				endereco.setVisible(true);
			}
		};
		
		bt_fechar_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		};
		
		
		lb_id_usuario = new JLabel("id_usuario:");
		lb_nome = new JLabel("Nome:");
		lb_telefones = new JLabel("Telefones:");
		
		tf_id_usuario = new JTextField("");
		tf_nome = new JTextField("");
		tf_telefones = new JTextField("");
				
		bt_salvar = new JButton("Salvar");
		bt_limpar = new JButton("Limpar");
		
		bt_fechar = new JButton("Fechar");
		bt_fechar.setBounds(190, 340, 80, 30);
		bt_fechar.addActionListener(bt_fechar_click);
		contentPane.setLayout(null);
		
		cadastrarEndereco = new JButton("Cadastrar Endereco");
		cadastrarEndereco.setBounds(20, 76, 156, 30);
		cadastrarEndereco.addActionListener(cadastrarEndereco_click);
		contentPane.setLayout(null);
		
		
		getContentPane().add(cadastrarEndereco);
				
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		getContentPane().add(lb_id_usuario);
		getContentPane().add(lb_nome);
		getContentPane().add(lb_telefones);
		
		getContentPane().add(tf_id_usuario);
		getContentPane().add(tf_nome);
		getContentPane().add(tf_telefones);
		
		getContentPane().add(bt_salvar);
		getContentPane().add(bt_limpar);
		getContentPane().add(bt_fechar);
		
		lb_id_usuario.setBounds(20, 20, 100, 15);
		tf_id_usuario.setBounds(20, 40, 80, 25);
		
		lb_nome.setBounds(118, 20, 100, 15);
		tf_nome.setBounds(118, 40, 400, 25);
				
		lb_telefones.setBounds(19, 189, 150, 15);
		tf_telefones.setBounds(19, 215, 127, 25);
		
		
		bt_salvar.setBounds(20, 340, 80, 30);
		bt_limpar.setBounds(105, 340, 80, 30);
		
		bt_RG = new JLabel("RG:");
		bt_RG.setBounds(19, 130, 100, 15);
		contentPane.add(bt_RG);
		
		bt_CPF = new JLabel("CPF:");
		bt_CPF.setBounds(173, 130, 100, 15);
		contentPane.add(bt_CPF);
		
		textField = new JTextField("");
		textField.setBounds(19, 153, 101, 25);
		contentPane.add(textField);
		
		textField_1 = new JTextField("");
		textField_1.setBounds(170, 155, 166, 23);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField("");
		textField_2.setBounds(19, 251, 127, 25);
		contentPane.add(textField_2);
		
		JLabel lb_email = new JLabel("Email:");
		lb_email.setBounds(173, 189, 100, 15);
		contentPane.add(lb_email);
		
		textField_3 = new JTextField("");
		textField_3.setBounds(173, 215, 334, 25);
		contentPane.add(textField_3);
		
		
		
	}
}
