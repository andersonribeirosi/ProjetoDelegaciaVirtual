package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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

	JButton criarFormularioVeiculo;
	JButton cadastrarOcorrencia;
	JButton registrarOcorrenciaDeVeiculo;
	JButton btnCadastrar;

	// eventos
	ActionListener comando_sair_click;
	ActionListener criarFormularioVeiculo_click;
	ActionListener criarOcorrenciaDeVeiculo_click;
	ActionListener cadastrarOcorrencia_click;
	ActionListener btnCadastrar_click;
	private JLabel label;
	private JLabel lblNewLabel;
	private JLabel label_1;
	private JButton btnLogout;
	private JButton btnSair;

	// private JButton btnCadastrar;

	public DelegaciaView() {
		// Inicializações
		final FormularioConsultaVeiculo fveiculo = new FormularioConsultaVeiculo();
		final FormularioCadastroOcorrencia ocorrencia = new FormularioCadastroOcorrencia();
		final FormularioCadastroFurto furto = new FormularioCadastroFurto();
		final FormularioCadastroOcorrenciaDeVeiculo furtoVeiculo = new FormularioCadastroOcorrenciaDeVeiculo();

		////////////////////////////////////////////////////////////////////////////////////////////
		setFont(new Font("Arial Black", Font.PLAIN, 12));
		setForeground(Color.ORANGE);
		setBackground(UIManager.getColor("Button.background"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// definir o titulo do formulario

		setTitle("Delegacia Virtual");
		setSize(670, 528);
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
		
		criarOcorrenciaDeVeiculo_click = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				furtoVeiculo.setVisible(true);

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

		criarFormularioVeiculo = new JButton("Consultar Situa\u00E7\u00E3o do Ve\u00EDculo");
		criarFormularioVeiculo.setBounds(196, 75, 222, 43);
		criarFormularioVeiculo.addActionListener(criarFormularioVeiculo_click);
		contentPane.setLayout(null);
		criarFormularioVeiculo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();

			}
		});
		
		registrarOcorrenciaDeVeiculo = new JButton("Registrar Ocorrência de Veiculo");
		registrarOcorrenciaDeVeiculo.setBounds(196, 280, 216, 43);
		registrarOcorrenciaDeVeiculo.addActionListener(criarOcorrenciaDeVeiculo_click);
		contentPane.setLayout(null);
		registrarOcorrenciaDeVeiculo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();

			}
		});

		cadastrarOcorrencia = new JButton("Registro de B.O Extravio / Perda");
		cadastrarOcorrencia.setBounds(196, 142, 222, 43);
		cadastrarOcorrencia.addActionListener(cadastrarOcorrencia_click);
		contentPane.setLayout(null);
		cadastrarOcorrencia.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();

			}
		});

		getContentPane().add(criarFormularioVeiculo);
		getContentPane().add(cadastrarOcorrencia);
		getContentPane().add(registrarOcorrenciaDeVeiculo);

		btnCadastrar = new JButton("Cadastrar Ocorr\u00EAncia de Furto");
		btnCadastrar.setBounds(196, 208, 222, 43);
		btnCadastrar.addActionListener(btnCadastrar_click);
		contentPane.add(btnCadastrar);
		btnCadastrar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();

			}
		});

		label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\ProjetosGit\\ProjetoDelegaciaVirtual\\Imagens\\icon_extrravio_perda.jpg"));
		label.setBounds(147, 124, 46, 55);
		contentPane.add(label);

		lblNewLabel = new JLabel("");
		lblNewLabel
				.setIcon(new ImageIcon("C:\\ProjetosGit\\ProjetoDelegaciaVirtual\\Imagens\\icon_consulta_furto.png"));
		lblNewLabel.setBounds(147, 51, 46, 43);
		contentPane.add(lblNewLabel);

		label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\ProjetosGit\\ProjetoDelegaciaVirtual\\Imagens\\icon_bo_furto.png"));
		label_1.setBounds(147, 208, 46, 43);
		contentPane.add(label_1);

		btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogout.setBounds(163, 445, 113, 23);
		contentPane.add(btnLogout);
		btnLogout.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				Login form = new Login();
				form.show();
				dispose();

			}
		});

		btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSair.setBounds(351, 445, 91, 23);
		contentPane.add(btnSair);
		
		JButton btnFaleConosco = new JButton("Fale Conosco");
		btnFaleConosco.setSelectedIcon(new ImageIcon("C:\\ProjetosGit\\ProjetoDelegaciaVirtual\\Imagens\\icon_faleconosco.png"));
		btnFaleConosco.setBounds(196, 349, 222, 43);
		contentPane.add(btnFaleConosco);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("C:\\ProjetosGit\\ProjetoDelegaciaVirtual\\Imagens\\icon_faleconosco.png"));
		label_2.setBounds(147, 284, 46, 43);
		contentPane.add(label_2);
		btnSair.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

	}
}
