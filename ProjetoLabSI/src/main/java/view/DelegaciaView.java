package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class DelegaciaView extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DelegaciaView frame = new DelegaciaView();
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

	JButton comando_sair;
	JButton criarFormularioVeiculo;
	JButton cadastrarOcorrencia;
	JButton btnCadastrar;

	// eventos
	ActionListener comando_sair_click;
	ActionListener criarFormularioVeiculo_click;
	ActionListener cadastrarOcorrencia_click;
	ActionListener btnCadastrar_click;
	
	
//	private JButton btnCadastrar;
	
	

	public DelegaciaView() {
		// Inicializações
		final FormularioConsultaVeiculo fveiculo = new FormularioConsultaVeiculo();
		final FormularioCadastroOcorrencia ocorrencia = new FormularioCadastroOcorrencia();
		final FormularioCadastroFurto furto = new FormularioCadastroFurto();
		
		////////////////////////////////////////////////////////////////////////////////////////////
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setForeground(Color.ORANGE);
		setBackground(UIManager.getColor("Button.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// definir o titulo do formulario

		setTitle("Delegacia Virtual");
		setSize(364, 315);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		////////////////////////////////////////////////////////////////////////////////////////////
		// eventos
		comando_sair_click = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				// System.out.println("Foi clicado o botão sair");
			}
		};

		////////////////////////////////////////////////////////////////////////////////////////////
		criarFormularioVeiculo_click = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fveiculo.setVisible(true);

			}
		};

		btnCadastrar_click = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				furto.setVisible(true);
			}
		};
		
		
		////////////////////////////////////////////////////////////////////////////////////////////
		cadastrarOcorrencia_click = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ocorrencia.setVisible(true);

			}
		};

		// criar os botões
		comando_sair = new JButton("Sair");
		comando_sair.setBounds(19, 228, 120, 30);
		comando_sair.addActionListener(comando_sair_click);

		criarFormularioVeiculo = new JButton("Consultar Situa\u00E7\u00E3o do Ve\u00EDculo");
		criarFormularioVeiculo.setBounds(19, 26, 204, 30);
		criarFormularioVeiculo.addActionListener(criarFormularioVeiculo_click);
		contentPane.setLayout(null);

		cadastrarOcorrencia = new JButton("Cadastrar Ocorrencia");
		cadastrarOcorrencia.setBounds(19, 75, 204, 30);
		cadastrarOcorrencia.addActionListener(cadastrarOcorrencia_click);
		contentPane.setLayout(null);

		// adicionar os botões ao formulario
		getContentPane().add(comando_sair);

		getContentPane().add(criarFormularioVeiculo);
		getContentPane().add(cadastrarOcorrencia);
		
		
		btnCadastrar = new JButton("Cadastrar Ocorr\u00EAncia de Furto");
		btnCadastrar.setBounds(19, 128, 204, 30);
		btnCadastrar.addActionListener(btnCadastrar_click);
		contentPane.add(btnCadastrar);

	}
}
