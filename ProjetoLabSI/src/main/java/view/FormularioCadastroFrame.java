package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FormularioCadastroFrame extends JFrame {

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
				try 
				{
					FormularioCadastroFrame frame = new FormularioCadastroFrame();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}
	
	private static final long serialVersionUID = 1L;
	
	JLabel lb_usuario, lb_cpf,  lb_rg, lb_senha;
	JTextField tf_usuario, tf_cpf,  tf_rg, tf_senha;
	JComboBox<String> cb_usuario;
	JButton bt_salvar, bt_limpar, bt_fechar;

	/**
	 * Create the frame.
	 */
	public FormularioCadastroFrame() 
	{
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		setTitle("Cadastro");
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		lb_usuario = new JLabel("Usuario");
		lb_cpf = new JLabel("CPF");
		lb_rg = new JLabel("RG");
		lb_senha = new JLabel("Cadastro de Senha");
		
		tf_usuario = new JTextField("");
		tf_usuario.setBounds(0, 0, 0, 0);
		tf_cpf = new JTextField("");
		tf_rg = new JTextField("");
		tf_senha = new JTextField("");
	
		
		cb_usuario = new JComboBox<String>();
		
		bt_salvar = new JButton("Salvar");
		bt_limpar = new JButton("Limpar");
		bt_fechar = new JButton("Fechar");
		
		cb_usuario.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] 
				{ "Selecione um Usuario", "João",
				"Antonio", "Zé", "Biu"}));
		
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		getContentPane().add(lb_usuario);
		getContentPane().add(lb_cpf);
		getContentPane().add(lb_rg);
		getContentPane().add(lb_senha);
				
		getContentPane().add(cb_usuario);
		
		getContentPane().add(tf_usuario);
		getContentPane().add(tf_cpf);
		getContentPane().add(tf_rg);
		getContentPane().add(tf_senha);
		
		getContentPane().add(cb_usuario);

		getContentPane().add(bt_salvar);
		getContentPane().add(bt_limpar);
		getContentPane().add(bt_fechar);
		
		lb_usuario.setBounds(20, 20, 100, 15);
		cb_usuario.setBounds(20, 40, 170, 25);
		
		lb_cpf.setBounds(180, 70, 100, 15);
		tf_cpf.setBounds(180, 90, 150, 25);
		
		lb_rg.setBounds(20, 70, 100, 15);
		tf_rg.setBounds(20, 90, 150, 25);
		
		lb_senha.setBounds(20, 180, 150, 15);
		tf_senha.setBounds(20, 200, 100, 25);
		
		
		bt_salvar.setBounds(20, 340, 80, 30);
		bt_limpar.setBounds(105, 340, 80, 30);
		bt_fechar.setBounds(190, 340, 80, 30);
			
		
	}

}
