package view;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;

public class DelegaciaFrame extends JFrame 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
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
					DelegaciaFrame frame = new DelegaciaFrame();
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
	
	JButton comando_sair;
	JButton criarFormularioVeiculo;
	JButton cadastrarOcorrencia;
		
	//eventos
	ActionListener comando_sair_click;
	ActionListener criarFormularioVeiculo_click;
	ActionListener cadastrarOcorrencia_click;
	
	
	public DelegaciaFrame() 
	{	
		//Inicializações
		final FormularioVeiculoFrame fveiculo = new FormularioVeiculoFrame();
		final FormularioOcorrenciaFrame ocorrencia = new FormularioOcorrenciaFrame();		
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setForeground(Color.ORANGE);
		setBackground(UIManager.getColor("Button.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//definir o titulo do formulario
		
		setTitle("Delegacia Virtual");
		setSize(364, 315);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		////////////////////////////////////////////////////////////////////////////////////////////
		//eventos
		comando_sair_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				System.exit(0);
				//System.out.println("Foi clicado o botão sair");
			}
		};
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		criarFormularioVeiculo_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				fveiculo.setVisible(true);
				
			}
		};		

		////////////////////////////////////////////////////////////////////////////////////////////
		cadastrarOcorrencia_click = new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{	
				ocorrencia.setVisible(true);
				
			}
		};
	
		
		
		
		//criar os botões
		comando_sair = new JButton("Sair");
		comando_sair.setBounds(19, 228, 120, 30);
		comando_sair.addActionListener(comando_sair_click);
		
		
		criarFormularioVeiculo = new JButton("Criar Formulario de Veiculo");
		criarFormularioVeiculo.setBounds(19, 26, 204, 30);
		criarFormularioVeiculo.addActionListener(criarFormularioVeiculo_click);
		contentPane.setLayout(null);
		
		cadastrarOcorrencia = new JButton("Cadastrar Ocorrencia");
		cadastrarOcorrencia.setBounds(19, 72, 178, 30);
		cadastrarOcorrencia.addActionListener(cadastrarOcorrencia_click);
		contentPane.setLayout(null);
		
		
		
		
		
		//adicionar os botões ao formulario
		getContentPane().add(comando_sair);
		
		getContentPane().add(criarFormularioVeiculo);
		getContentPane().add(cadastrarOcorrencia);
				
		
	
	}
}
