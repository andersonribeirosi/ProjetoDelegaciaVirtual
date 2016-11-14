package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FormularioEnderecoFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					FormularioEnderecoFrame frame = new FormularioEnderecoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static final long serialVersionUID = 1L;


	JLabel lb_rua, lb_numero, lb_bairro, lb_cidade;
	JTextField tf_rua, tf_numero, tf_bairro, tf_cidade;
	//JComboBox<String> cb_tipo_da_ocorrencia, cb_acidente_de_transito;
	JButton bt_salvar, 
			bt_limpar, 
			bt_fechar;
	
	ActionListener bt_fechar_click;
	
	
	
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public FormularioEnderecoFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		bt_fechar_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
			}
		};
		
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
		bt_fechar.setBounds(190, 340, 80, 30);
		bt_fechar.addActionListener(bt_fechar_click);
		contentPane.setLayout(null);
		
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
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
		
		lb_rua.setBounds(20, 56, 100, 15);
		tf_rua.setBounds(20, 82, 486, 25);
		
		lb_numero.setBounds(20, 112, 100, 15);
		tf_numero.setBounds(20, 138, 63, 25);
		
		lb_bairro.setBounds(130, 112, 100, 15);
		tf_bairro.setBounds(130, 138, 249, 25);
					
		lb_cidade.setBounds(20, 11, 150, 15);
		tf_cidade.setBounds(20, 26, 273, 25);
	
		
		bt_salvar.setBounds(20, 340, 80, 30);
		bt_limpar.setBounds(105, 340, 80, 30);
		
		
		JLabel lb_CEP = new JLabel("CEP");
		lb_CEP.setBounds(20, 176, 100, 15);
		contentPane.add(lb_CEP);
		
		textField = new JTextField("");
		textField.setBounds(20, 196, 150, 25);
		contentPane.add(textField);
		
	}
}
