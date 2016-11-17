package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;

public class FormularioCadastroFurto extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JComboBox<String> comboBox_1;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JLabel lblNewLabel;
	private JLabel lblNmero;
	private JLabel lblComplemento;
	private JTextField textField_9;
	private JTextField textField_10;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> cb_estado;
	private JTextField textField_11;
	private JLabel lblEstado;
	private JLabel lblCep;
	private JLabel lblDataDeNascimento;
	private JLabel label;
	private JLabel lblSexo;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblTelefone;
	private JTextField textField_12;
	private JTextField textField_13;
	private JLabel lblCelular;
	private JTextField textField_14;
	private JButton btnLimpar;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Registrar Boleltim de Ocorrência");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioCadastroFurto frame = new FormularioCadastroFurto();
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

	public FormularioCadastroFurto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setText("");
		textField.setBounds(22, 80, 486, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(562, 80, 192, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setColumns(10);
		textField_2.setBounds(22, 134, 253, 20);
		contentPane.add(textField_2);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(285, 134, 189, 20);
		contentPane.add(textField_3);

		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.addItem("Paraíba");
		comboBox.addItem("Pernambuco");
		comboBox.addItem("Piauí");
		comboBox.addItem("Bahia");
		comboBox.addItem("São Paulo");
		comboBox.addItem("Rio de Janeiro");
		comboBox.setBounds(484, 134, 130, 22);
		contentPane.add(comboBox);

		comboBox_1 = new JComboBox<String>();
		comboBox_1.addItem("Masculino");
		comboBox_1.addItem("Feminino");
		comboBox_1.setBounds(624, 134, 130, 22);
		contentPane.add(comboBox_1);

		JLabel lblBoDeExtravio = new JLabel(" B.O. de Furto");
		lblBoDeExtravio.setIcon(new ImageIcon(
				"G:\\Desenvolvimento\\Desenvolvimento de Softwares\\Anderson\\Faculdade 2016.2\\Bruno Dias - Lab Sistemas\\Dados e telas StoryBoard\\Imagens\\icon_bo_furto.png"));
		lblBoDeExtravio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBoDeExtravio.setBounds(22, 11, 287, 42);
		contentPane.add(lblBoDeExtravio);

		JLabel lblNomeCompletosem = new JLabel("Nome Completo (sem abrevia\u00E7\u00F5es)");
		lblNomeCompletosem.setBounds(22, 58, 236, 20);
		contentPane.add(lblNomeCompletosem);

		JLabel lblCpfapenasOs = new JLabel("CPF (apenas os n\u00FAmeros)");
		lblCpfapenasOs.setBounds(22, 111, 160, 14);
		contentPane.add(lblCpfapenasOs);

		JLabel lb_cpf = new JLabel("RG");
		lb_cpf.setBounds(285, 111, 27, 14);
		contentPane.add(lb_cpf);

		JLabel lblNomeDaMe = new JLabel("Nome da M\u00E3e");
		lblNomeDaMe.setBounds(22, 166, 160, 14);
		contentPane.add(lblNomeDaMe);

		textField_4 = new JTextField();
		textField_4.setText("");
		textField_4.setColumns(10);
		textField_4.setBounds(22, 190, 452, 20);
		contentPane.add(textField_4);

		JLabel lblNomeDoPai = new JLabel("Nome do Pai");
		lblNomeDoPai.setBounds(22, 223, 160, 14);
		contentPane.add(lblNomeDoPai);

		textField_5 = new JTextField();
		textField_5.setText("");
		textField_5.setColumns(10);
		textField_5.setBounds(22, 248, 452, 20);
		contentPane.add(textField_5);

		textField_6 = new JTextField();
		textField_6.setBounds(22, 304, 409, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);

		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(443, 304, 86, 20);
		contentPane.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(539, 304, 215, 20);
		contentPane.add(textField_8);

		lblNewLabel = new JLabel("Endereço");
		lblNewLabel.setBounds(22, 279, 70, 14);
		contentPane.add(lblNewLabel);

		lblNmero = new JLabel("Número");
		lblNmero.setBounds(443, 279, 46, 14);
		contentPane.add(lblNmero);

		lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(540, 279, 102, 14);
		contentPane.add(lblComplemento);

		textField_9 = new JTextField();
		textField_9.setBounds(22, 354, 179, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);

		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(211, 354, 220, 20);
		contentPane.add(textField_10);

		cb_estado = new JComboBox<String>();

		cb_estado.addItem("Paraíba");
		cb_estado.addItem("Pernambuco");
		cb_estado.addItem("Piauí");
		cb_estado.addItem("Bahia");
		cb_estado.addItem("São Paulo");
		cb_estado.addItem("Rio de Janeiro");
		cb_estado.setBounds(443, 364, 130, 22);
		cb_estado.setBounds(443, 353, 130, 22);
		contentPane.add(cb_estado);

		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(594, 354, 160, 20);
		contentPane.add(textField_11);

		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(443, 335, 46, 14);
		contentPane.add(lblEstado);

		lblCep = new JLabel("CEP");
		lblCep.setBounds(594, 339, 46, 14);
		contentPane.add(lblCep);

		lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(562, 58, 130, 20);
		contentPane.add(lblDataDeNascimento);

		label = new JLabel("Estado");
		label.setBounds(483, 111, 46, 14);
		contentPane.add(label);

		lblSexo = new JLabel("Sexo");
		lblSexo.setBounds(624, 111, 46, 14);
		contentPane.add(lblSexo);

		lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(22, 335, 46, 14);
		contentPane.add(lblBairro);

		lblCidade = new JLabel("Cidade");
		lblCidade.setBounds(211, 335, 46, 14);
		contentPane.add(lblCidade);

		lblTelefone = new JLabel("Telefone Residencial");
		lblTelefone.setBounds(22, 403, 160, 14);
		contentPane.add(lblTelefone);

		textField_12 = new JTextField();
		textField_12.setBounds(22, 426, 160, 20);
		contentPane.add(textField_12);
		textField_12.setColumns(10);

		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(192, 426, 160, 20);
		contentPane.add(textField_13);

		lblCelular = new JLabel("Celular");
		lblCelular.setBounds(192, 403, 46, 14);
		contentPane.add(lblCelular);

		textField_14 = new JTextField();
		textField_14.setBounds(22, 479, 330, 20);
		contentPane.add(textField_14);
		textField_14.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setToolTipText("");
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(415, 425, 339, 74);
		contentPane.add(textArea);

		JLabel lblFaaUmaBreve = new JLabel("Fa\u00E7a uma breve descri\u00E7\u00E3o do fato ocorrido");
		lblFaaUmaBreve.setBounds(415, 403, 277, 14);
		contentPane.add(lblFaaUmaBreve);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(22, 528, 91, 23);
		contentPane.add(btnRegistrar);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(22, 454, 46, 14);
		contentPane.add(lblEmail);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(140, 528, 91, 23);
		contentPane.add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				textField.setText(null);
				textField_1.setText(null);
				textField_2.setText(null);
				textField_3.setText(null);
				comboBox_1.setSelectedItem(null);
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
//				lblNewLabel.setText(null);
//				lblNmero.setText(null);
//				lblComplemento.setText(null);
				textField_9.setText(null);
				textField_10.setText(null);
				comboBox_2.setSelectedItem(null);
				cb_estado.setSelectedItem(null);
				textField_11.setText(null);

				textField_12.setText(null);
				textField_13.setText(null);
				textField_14.setText(null);

			}
		});

//		contentPane.add(btnLimpar);

		btnCancelar = new JButton("Fechar");
		btnCancelar.setBounds(261, 528, 91, 23);
		contentPane.add(btnCancelar);

		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});

	}

	public JComboBox<String> getComboBox_2() {
		return comboBox_2;
	}

	public void setComboBox_2(JComboBox<String> comboBox_2) {
		this.comboBox_2 = comboBox_2;
	}

}
