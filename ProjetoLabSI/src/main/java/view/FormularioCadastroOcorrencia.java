package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.ConexaoController;
import controller.OcorrenciaController;
import model.Ocorrencia;

public class FormularioCadastroOcorrencia extends JFrame {

	Ocorrencia ocorrencia = new Ocorrencia();
	OcorrenciaController controle = new OcorrenciaController();
	ConexaoController connex = new ConexaoController();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_nomeUsuario;
	private JTextField tf_dataNasc;
	private JTextField tf_cpf;
	private JTextField tf_rg;
	private JComboBox<String> cb_sexo;
	private JTextField tf_nomeMae;
	private JTextField tf_NomePai;
	private JTextField tf_endereco;
	private JTextField tf_numero;
	private JTextField tf_complemento;
	private JLabel lblNewLabel;
	private JLabel lblNmero;
	private JLabel lblComplemento;
	private JTextField tf_bairro;
	private JTextField tf_cidade;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> cb_estado;
	private JTextField tf_cep;
	private JLabel lblEstado;
	private JLabel lblCep;
	private JLabel lblDataDeNascimento;
	private JLabel label;
	private JLabel lblSexo;
	private JLabel lblBairro;
	private JLabel lblCidade;
	private JLabel lblTelefone;
	private JTextField tf_telres;
	private JTextField tf_celular;
	private JLabel lblCelular;
	private JTextField tf_email;
	private JButton btnLimpar;
	private JButton btnCancelar;
	private JLabel label_8;
	private JLabel label_9;

	public static void main(String[] args) {
		// JOptionPane.showMessageDialog(null, "Registrar Boleltim de
		// Ocorr�ncia");
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioCadastroOcorrencia frame = new FormularioCadastroOcorrencia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormularioCadastroOcorrencia() {
		setTitle("  B.O Cadastrar Ocorr�ncia  ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tf_nomeUsuario = new JTextField();
		tf_nomeUsuario.setText("");
		tf_nomeUsuario.setBounds(22, 80, 486, 20);
		contentPane.add(tf_nomeUsuario);
		tf_nomeUsuario.setColumns(10);
		
		

		tf_dataNasc = new JTextField();
		tf_dataNasc.setBounds(562, 80, 192, 20);
		contentPane.add(tf_dataNasc);
		tf_dataNasc.setColumns(10);

		tf_cpf = new JTextField();
		tf_cpf.setText("");
		tf_cpf.setColumns(10);
		tf_cpf.setBounds(22, 134, 241, 20);
		contentPane.add(tf_cpf);

		tf_rg = new JTextField();
		tf_rg.setColumns(10);
		tf_rg.setBounds(285, 134, 160, 20);
		contentPane.add(tf_rg);

		final JComboBox<String> cb_estado1 = new JComboBox<String>();
		cb_estado1.addItem("Para�ba");
		cb_estado1.addItem("Pernambuco");
		cb_estado1.addItem("Piau�");
		cb_estado1.addItem("Bahia");
		cb_estado1.addItem("S�o Paulo");
		cb_estado1.addItem("Rio de Janeiro");
		cb_estado1.setBounds(484, 134, 130, 22);
		contentPane.add(cb_estado1);

		cb_sexo = new JComboBox<String>();
		cb_sexo.addItem("Masculino");
		cb_sexo.addItem("Feminino");
		cb_sexo.setBounds(624, 134, 130, 22);
		contentPane.add(cb_sexo);

		JLabel lblBoDeExtravio = new JLabel(" B.O. de Extravio / Perda");
		lblBoDeExtravio.setIcon(new ImageIcon("ProjetoDelegaciaVirtual\\Imagens\\icon_extrravio_perda.jpg"));
		lblBoDeExtravio.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBoDeExtravio.setBounds(22, 11, 287, 43);
		contentPane.add(lblBoDeExtravio);

		JLabel lblNomeCompletosem = new JLabel("Nome Completo (sem abrevia\u00E7\u00F5es)");
		lblNomeCompletosem.setBounds(22, 59, 236, 20);

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

		tf_nomeMae = new JTextField();
		tf_nomeMae.setText("");
		tf_nomeMae.setColumns(10);
		tf_nomeMae.setBounds(22, 190, 452, 20);
		contentPane.add(tf_nomeMae);

		JLabel lblNomeDoPai = new JLabel("Nome do Pai");
		lblNomeDoPai.setBounds(22, 223, 160, 14);
		contentPane.add(lblNomeDoPai);

		tf_NomePai = new JTextField();
		tf_NomePai.setText("");
		tf_NomePai.setColumns(10);
		tf_NomePai.setBounds(22, 248, 452, 20);
		contentPane.add(tf_NomePai);

		tf_endereco = new JTextField();
		tf_endereco.setBounds(22, 304, 394, 20);
		contentPane.add(tf_endereco);
		tf_endereco.setColumns(10);

		tf_numero = new JTextField();
		tf_numero.setColumns(10);
		tf_numero.setBounds(443, 304, 75, 20);
		contentPane.add(tf_numero);

		tf_complemento = new JTextField();
		tf_complemento.setColumns(10);
		tf_complemento.setBounds(550, 304, 204, 20);
		contentPane.add(tf_complemento);

		lblNewLabel = new JLabel("Endere�o");
		lblNewLabel.setBounds(22, 279, 70, 14);
		contentPane.add(lblNewLabel);

		lblNmero = new JLabel("N�mero");
		lblNmero.setBounds(443, 279, 46, 14);
		contentPane.add(lblNmero);

		lblComplemento = new JLabel("Complemento");
		lblComplemento.setBounds(550, 279, 102, 14);
		contentPane.add(lblComplemento);

		tf_bairro = new JTextField();
		tf_bairro.setBounds(22, 354, 179, 20);
		contentPane.add(tf_bairro);
		tf_bairro.setColumns(10);

		tf_cidade = new JTextField();
		tf_cidade.setColumns(10);
		tf_cidade.setBounds(211, 354, 220, 20);
		contentPane.add(tf_cidade);

		cb_estado = new JComboBox<String>();

		cb_estado.addItem("Para�ba");
		cb_estado.addItem("Pernambuco");
		cb_estado.addItem("Piau�");
		cb_estado.addItem("Bahia");
		cb_estado.addItem("S�o Paulo");
		cb_estado.addItem("Rio de Janeiro");
		cb_estado.setBounds(443, 364, 130, 22);
		cb_estado.setBounds(443, 353, 130, 22);
		contentPane.add(cb_estado);

		tf_cep = new JTextField();
		tf_cep.setColumns(10);
		tf_cep.setBounds(594, 354, 160, 20);
		contentPane.add(tf_cep);

		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(443, 335, 46, 14);
		contentPane.add(lblEstado);

		lblCep = new JLabel("CEP");
		lblCep.setBounds(594, 335, 46, 14);
		contentPane.add(lblCep);

		lblDataDeNascimento = new JLabel("Data de Nascimento");
		lblDataDeNascimento.setBounds(562, 59, 130, 17);
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

		tf_telres = new JTextField();
		tf_telres.setBounds(22, 426, 152, 20);
		contentPane.add(tf_telres);
		tf_telres.setColumns(10);

		tf_celular = new JTextField();
		tf_celular.setColumns(10);
		tf_celular.setBounds(191, 426, 150, 20);
		contentPane.add(tf_celular);

		lblCelular = new JLabel("Celular");
		lblCelular.setBounds(192, 403, 46, 14);
		contentPane.add(lblCelular);

		tf_email = new JTextField();
		tf_email.setBounds(22, 479, 330, 20);
		contentPane.add(tf_email);
		tf_email.setColumns(10);

		final JTextArea ta_descricao = new JTextArea();
		ta_descricao.setToolTipText("");
		ta_descricao.setWrapStyleWord(true);
		ta_descricao.setLineWrap(true);
		ta_descricao.setBounds(374, 425, 380, 74);
		contentPane.add(ta_descricao);

		JLabel lblFaaUmaBreve = new JLabel("Fa\u00E7a uma breve descri\u00E7\u00E3o do fato ocorrido");
		lblFaaUmaBreve.setBounds(374, 403, 277, 14);
		contentPane.add(lblFaaUmaBreve);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(22, 528, 91, 23);
		contentPane.add(btnRegistrar);
		btnRegistrar.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {

				// if(tf_nomeUsuario.getText().equals("")){
				// JOptionPane.showMessageDialog(null, "Campo obrigat�rio");
				// }
				//

				// Todos os componentes do Painel do Frame

				 
//				Component components[] = getContentPane().getComponents();
//				
//				// Para cada componente
//				for (int i = 0; i < components.length; i++) {
//					// � campo de texto?
//					if (components[i] instanceof JTextField) {
//						// Est� preenchido?
//						if (((JTextField) components[i]).getText().isEmpty()) {
//							// N�o, ent�o exibo mensagem de erro
//							JOptionPane.showMessageDialog(null, "Preencher todos os campos");
//							break;
//						}
//					}
//
//				}
				
				ocorrencia.setNome(tf_nomeUsuario.getText());
				ocorrencia.setData(tf_dataNasc.getText());
				ocorrencia.setCpf(tf_cpf.getText());
				ocorrencia.setRg(tf_rg.getText());
				ocorrencia.setEstado1((String) cb_estado1.getSelectedItem());
				ocorrencia.setSexo((String) cb_sexo.getSelectedItem());
				ocorrencia.setMae(tf_nomeMae.getText());
				ocorrencia.setPai(tf_NomePai.getText());
				ocorrencia.setEndereco(tf_endereco.getText());
				ocorrencia.setNumero(tf_numero.getText());
				ocorrencia.setComplemento(tf_complemento.getText());
				ocorrencia.setBairro(tf_bairro.getText());
				ocorrencia.setCidade(tf_cidade.getText());
				ocorrencia.setEstado((String) cb_estado.getSelectedItem());
				ocorrencia.setCep(tf_cep.getText());
				ocorrencia.setTelefoneres(tf_telres.getText());
				ocorrencia.setCelular(tf_celular.getText());
				ocorrencia.setEmail(tf_email.getText());
				ocorrencia.setDescricao(ta_descricao.getText());

				controle.salvarOcorrencia(ocorrencia);

				tf_nomeUsuario.setText(null);
				tf_dataNasc.setText(null);
				tf_cpf.setText(null);
				tf_rg.setText(null);
				cb_estado1.setSelectedItem(null);
				cb_sexo.setSelectedItem(null);
				tf_nomeMae.setText(null);
				tf_NomePai.setText(null);
				tf_endereco.setText(null);
				tf_numero.setText(null);
				tf_complemento.setText(null);
				tf_bairro.setText(null);
				tf_cidade.setText(null);
				cb_estado.setSelectedItem(null);
				tf_cep.setText(null);
				tf_telres.setText(null);
				tf_celular.setText(null);
				tf_email.setText(null);
				ta_descricao.setText(null);

				new DelegaciaView().show();  
				dispose();
			}
		
		});
		

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(22, 454, 46, 14);
		contentPane.add(lblEmail);

		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(140, 528, 91, 23);
		contentPane.add(btnLimpar);
		btnLimpar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				tf_nomeUsuario.setText(null);
				tf_dataNasc.setText(null);
				tf_cpf.setText(null);
				tf_rg.setText(null);
				cb_sexo.setSelectedItem(null);
				tf_nomeMae.setText(null);
				tf_NomePai.setText(null);
				tf_endereco.setText(null);
				tf_numero.setText(null);
				tf_complemento.setText(null);
				tf_bairro.setText(null);
				tf_cidade.setText(null);
				cb_estado1.setSelectedItem(null);
				cb_estado.setSelectedItem(null);
				tf_cep.setText(null);

				tf_telres.setText(null);
				tf_celular.setText(null);
				tf_email.setText(null);

			}
		});
		

		btnCancelar = new JButton("Fechar");
		btnCancelar.setBounds(261, 528, 91, 23);
		contentPane.add(btnCancelar);
		
		JLabel label_1 = new JLabel("*");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_1.setForeground(Color.RED);
		label_1.setBounds(512, 86, 18, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("*");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_2.setForeground(Color.RED);
		label_2.setBounds(266, 137, 18, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("*");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_3.setForeground(Color.RED);
		label_3.setBounds(448, 137, 13, 20);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("*");
		label_4.setForeground(Color.RED);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_4.setBounds(758, 86, 13, 14);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("*");
		label_5.setForeground(Color.RED);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_5.setBounds(422, 310, 13, 14);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("*");
		label_6.setForeground(Color.RED);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_6.setBounds(522, 313, 18, 8);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("*");
		label_7.setForeground(Color.RED);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_7.setBounds(618, 537, 13, 14);
		contentPane.add(label_7);
		
		JLabel lblCamposObrigatrios = new JLabel("Campos Obrigat\u00F3rios");
		lblCamposObrigatrios.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCamposObrigatrios.setForeground(Color.RED);
		lblCamposObrigatrios.setBounds(629, 537, 142, 14);
		contentPane.add(lblCamposObrigatrios);
		
		label_8 = new JLabel("*");
		label_8.setForeground(Color.RED);
		label_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_8.setBounds(179, 432, 13, 14);
		contentPane.add(label_8);
		
		label_9 = new JLabel("*");
		label_9.setForeground(Color.RED);
		label_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		label_9.setBounds(346, 432, 18, 14);
		contentPane.add(label_9);

		btnCancelar.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {

				new DelegaciaView().show(); // retorna para a classe principal
				dispose(); // fecha a atual

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
