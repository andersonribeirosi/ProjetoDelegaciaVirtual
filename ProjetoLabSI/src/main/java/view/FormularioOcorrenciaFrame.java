package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;

public class FormularioOcorrenciaFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioOcorrenciaFrame frame = new FormularioOcorrenciaFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static final long serialVersionUID = 1L;
	
	JLabel lb_protocolo, lb_data, lb_hora, lb_extravio_ou_perda, lb_acidente_de_transito,
	lb_furto_simples, lb_tipo_da_ocorrencia, lb_despacho;
	JTextField tf_protocolo, tf_data, tf_hora, tf_extravio_ou_perda, tf_acidente_de_transito,
	tf_furto_simples, tf_tipo_da_ocorrencia, tf_despacho;
	JComboBox<String> cb_tipo_da_ocorrencia, cb_acidente_de_transito;
	JButton bt_salvar, bt_limpar, bt_fechar;
	
	JButton cadastrarEndereco;
	
	ActionListener cadastrarEndereco_click;
	ActionListener comando_salvar_click;
	ActionListener comando_fechar_click;
	
	

	/**
	 * Create the frame.
	 */
	public FormularioOcorrenciaFrame() {
		
		final FormularioEnderecoFrame endereco = new FormularioEnderecoFrame();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
			
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		lb_protocolo = new JLabel("Protocolo");
		lb_data = new JLabel("Data(dd/mm/aaaa)");
		lb_hora = new JLabel("Hora");
		//lb_extravio_ou_perda = new JLabel("Extravio ou Perca");
		//lb_acidente_de_transito = new JLabel("Acidente de Transito");
		lb_furto_simples = new JLabel("Furto Simples - Tipo");
		lb_tipo_da_ocorrencia = new JLabel("Tipo da Ocorrencia");
		lb_despacho = new JLabel("Expedi��o da Situa��o");
		
		tf_protocolo = new JTextField("");
		tf_data = new JTextField("");
		tf_hora = new JTextField("");
		//tf_extravio_ou_perda = new JTextField("");
		//tf_acidente_de_transito = new JTextField("");
		tf_furto_simples = new JTextField("");
		tf_despacho = new JTextField("");
		
		cb_tipo_da_ocorrencia = new JComboBox<String>();
		
		bt_salvar = new JButton("Salvar");
		bt_limpar = new JButton("Limpar");
		bt_fechar = new JButton("Fechar");
		
		
		//eventos
		cadastrarEndereco_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				endereco.setVisible(true);
			}
		};
		
		comando_salvar_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println();
			}
		};
		
		comando_fechar_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				final DelegaciaFrame delegacia = new DelegaciaFrame();
				delegacia.setVisible(true);
						
			}
		};
			
		
		cb_tipo_da_ocorrencia.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] 
				{ "Selecione a Ocorrencia", "Furto",
				"Extravio", "Perda", "Acidente_de_Transito"}));
		
		bt_salvar = new JButton("Salvar");
		bt_salvar.setBounds(20, 340, 80, 30);
		bt_salvar.addActionListener(comando_salvar_click);
		
		bt_fechar = new JButton("Fechar");
		bt_fechar.setBounds(210, 236, 80, 30);
		bt_fechar.addActionListener(comando_fechar_click);
		
		cadastrarEndereco = new JButton("Cadastrar Endereco");
		cadastrarEndereco.setBounds(115, 89, 150, 30);
		cadastrarEndereco.addActionListener(cadastrarEndereco_click);
		contentPane.setLayout(null);
		
		getContentPane().add(cadastrarEndereco);
		
		getContentPane().setLayout(null);
		contentPane.setLayout(null);
		getContentPane().add(lb_protocolo);
		getContentPane().add(lb_data);
		getContentPane().add(lb_hora);
		//getContentPane().add(lb_extravio_ou_perda);
		//getContentPane().add(lb_acidente_de_transito);
		getContentPane().add(lb_furto_simples);
		getContentPane().add(lb_tipo_da_ocorrencia);
		getContentPane().add(lb_despacho);
		
		getContentPane().add(cb_tipo_da_ocorrencia);
		
		getContentPane().add(tf_protocolo);
		getContentPane().add(tf_data);
		getContentPane().add(tf_hora);
		//getContentPane().add(tf_extravio_ou_perda);
		//getContentPane().add(tf_acidente_de_transito);
		getContentPane().add(tf_furto_simples);
		getContentPane().add(tf_despacho);
		
		getContentPane().add(cb_tipo_da_ocorrencia);

		getContentPane().add(bt_salvar);
		getContentPane().add(bt_limpar);
		getContentPane().add(bt_fechar);
		
		lb_protocolo.setBounds(20, 20, 100, 15);
		tf_protocolo.setBounds(20, 40, 80, 25);
		
		lb_data.setBounds(115, 20, 100, 15);
		tf_data.setBounds(115, 40, 150, 25);
		
		lb_hora.setBounds(20, 70, 100, 15);
		tf_hora.setBounds(20, 90, 80, 25);
		
		//lb_extravio_ou_perda.setBounds(20, 120, 300, 15);
		//tf_extravio_ou_perda.setBounds(20, 140, 250, 25);
		
		lb_tipo_da_ocorrencia.setBounds(300, 25, 300, 15);
		cb_tipo_da_ocorrencia.setBounds(300, 45, 180, 20);
				
		//lb_acidente_de_transito.setBounds(280, 120, 150, 15);
		//tf_acidente_de_transito.setBounds(280, 140, 200, 25);
			
		lb_furto_simples.setBounds(20, 180, 150, 15);
		tf_furto_simples.setBounds(20, 200, 100, 25);
		
		lb_despacho.setBounds(160, 180, 150, 15);
		tf_despacho.setBounds(160, 200, 80, 25);
		
		
		bt_salvar.setBounds(20, 340, 80, 30);
		bt_limpar.setBounds(105, 340, 80, 30);
		bt_fechar.setBounds(190, 340, 80, 30);
		
	
	}

}
