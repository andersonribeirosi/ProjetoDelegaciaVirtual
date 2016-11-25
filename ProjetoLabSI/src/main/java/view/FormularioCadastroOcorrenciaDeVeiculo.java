package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.ConexaoController;
import controller.VeiculoController;
import model.Veiculo;

public class FormularioCadastroOcorrenciaDeVeiculo extends JFrame
{	
	Veiculo veiculo = new Veiculo();
	VeiculoController controleVeiculo = new VeiculoController();
	
	ConexaoController connex = new ConexaoController();

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tf_anoFabricacao;
	private JTextField tf_anoModelo;
	private JTextField tf_chassi;
	private JComboBox<String> cb_cor;
	private JTextField tf_marca;
	private JTextField tf_renavam;
	private JTextField tf_modelo;
	private JTextField tf_endereco;
	private JTextField tf_placa;
	private JLabel lblNewLabel;
	private JTextField tf_bairro;
	private JTextField tf_cidade;
	private JComboBox<String> comboBox_2;
	private JComboBox<String> cb_estado;
	private JLabel lblAnoDeFabricacao;
	private JLabel lblCor;
	private JLabel lblBairro;
	private JLabel lblCidade;
	
	private JButton btnLimpar;
	private JButton btnCancelar;
	private JLabel lblcidade;

	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{	FormularioCadastroOcorrenciaDeVeiculo frame = new FormularioCadastroOcorrenciaDeVeiculo();
					frame.setVisible(true);
				} catch (Exception e) 
				{	e.printStackTrace();
				}
			}
		});
	}

	public FormularioCadastroOcorrenciaDeVeiculo() 
	{	
		setTitle("  B.O Ocorrência de Veiculo  ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 655, 580);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		tf_anoFabricacao = new JTextField();
		tf_anoFabricacao.setBounds(22, 277, 134, 20);
		contentPane.add(tf_anoFabricacao);
		tf_anoFabricacao.setColumns(10);

		tf_anoModelo = new JTextField();
		tf_anoModelo.setText("");
		tf_anoModelo.setColumns(10);
		tf_anoModelo.setBounds(22, 90, 96, 20);
		contentPane.add(tf_anoModelo);

		tf_chassi = new JTextField();
		tf_chassi.setColumns(10);
		tf_chassi.setBounds(144, 90, 96, 20);
		contentPane.add(tf_chassi);

	

		cb_cor = new JComboBox<String>();
		cb_cor.addItem("Azul");
		cb_cor.addItem("Preto");
		cb_cor.addItem("Branca");
		cb_cor.addItem("Vermelho");
		cb_cor.addItem("Amarelo");
		cb_cor.addItem("Bege");
		cb_cor.addItem("vinho");
		cb_cor.addItem("Chumbo");
		cb_cor.addItem("Prata");
		cb_cor.addItem("Verde");
		cb_cor.addItem("Rosa");
		cb_cor.setBounds(300, 89, 130, 22);
		contentPane.add(cb_cor);

		JLabel lblBoDeRouboDeVeiculo = new JLabel(" B.O. de Roubo ou Furto de Veiculo");
		//lblBoDeRouboDeVeiculo.setIcon(new ImageIcon("ProjetoDelegaciaVirtual\\Imagens\\icon_extrravio_perda.jpg"));
		lblBoDeRouboDeVeiculo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBoDeRouboDeVeiculo.setBounds(22, 11, 340, 43);
		contentPane.add(lblBoDeRouboDeVeiculo);

		JLabel lblanoDeFabricacao = new JLabel("Ano de Fabricacao");
		lblanoDeFabricacao.setBounds(22, 65, 98, 14);
		contentPane.add(lblanoDeFabricacao);

		JLabel lb_anoModelo = new JLabel("Ano Modelo");
		lb_anoModelo.setBounds(144, 65, 102, 20);
		contentPane.add(lb_anoModelo);

		JLabel lblChassi = new JLabel("Chassi");
		lblChassi.setBounds(22, 137, 53, 14);
		contentPane.add(lblChassi);

		tf_marca = new JTextField();
		tf_marca.setText("");
		tf_marca.setColumns(10);
		tf_marca.setBounds(22, 162, 176, 20);
		contentPane.add(tf_marca);

		JLabel lblMarcaDoVeiculo = new JLabel("Marca do Veiculo");
		lblMarcaDoVeiculo.setBounds(231, 137, 115, 14);
		contentPane.add(lblMarcaDoVeiculo);
		
		tf_renavam = new JTextField();
		tf_renavam.setText("");
		tf_renavam.setColumns(10);
		tf_renavam.setBounds(389, 162, 193, 20);
		contentPane.add(tf_renavam);

		JLabel lblRenavam = new JLabel("Renavam");
		lblRenavam.setBounds(389, 134, 64, 20);
		contentPane.add(lblRenavam);

		tf_modelo = new JTextField();
		tf_modelo.setText("");
		tf_modelo.setColumns(10);
		tf_modelo.setBounds(228, 162, 134, 20);
		contentPane.add(tf_modelo);

		tf_endereco = new JTextField();
		tf_endereco.setBounds(22, 218, 330, 20);
		contentPane.add(tf_endereco);
		tf_endereco.setColumns(10);

		tf_placa = new JTextField();
		tf_placa.setColumns(10);
		tf_placa.setBounds(389, 218, 86, 20);
		contentPane.add(tf_placa);

		lblNewLabel = new JLabel("Endereço");
		lblNewLabel.setBounds(22, 193, 70, 14);
		contentPane.add(lblNewLabel);

		lblBairro = new JLabel("Bairro");
		lblBairro.setBounds(389, 193, 64, 14);
		contentPane.add(lblBairro);
		

		lblcidade = new JLabel("Cidade");
		lblcidade.setBounds(22, 249, 130, 17);
		contentPane.add(lblcidade);

		lblCor = new JLabel("Cor");
		lblCor.setBounds(300, 64, 46, 14);
		contentPane.add(lblCor);

	
		final JTextArea ta_descricao = new JTextArea();
		ta_descricao.setToolTipText("");
		ta_descricao.setWrapStyleWord(true);
		ta_descricao.setLineWrap(true);
		ta_descricao.setBounds(229, 356, 380, 74);
		contentPane.add(ta_descricao);

		JLabel lblFaaUmaBreve = new JLabel("Fa\u00E7a uma breve descri\u00E7\u00E3o do fato ocorrido");
		lblFaaUmaBreve.setBounds(233, 316, 277, 14);
		contentPane.add(lblFaaUmaBreve);

		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(27, 490, 91, 23);
		contentPane.add(btnRegistrar);
		btnRegistrar.addActionListener(new ActionListener() 
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{			
				veiculo.setAno_fab(tf_anoFabricacao.getText());
				veiculo.setAno_mod(tf_anoModelo.getText());
				veiculo.setChassi(tf_chassi.getText());
				veiculo.setCor((String) cb_cor.getSelectedItem());
				veiculo.setMarca(tf_marca.getText());
				veiculo.setModelo(tf_modelo.getText());
				veiculo.setPlaca(tf_placa.getText());
				veiculo.setRenavan(tf_renavam.getText());
					
							
				controleVeiculo.salvar(veiculo);
				
				
				tf_anoFabricacao.setText(null);
				tf_anoModelo.setText(null);
				tf_chassi.setText(null);
				
				cb_cor.setSelectedItem(null);
				tf_marca.setText(null);
				tf_modelo.setText(null);
				tf_endereco.setText(null);
				tf_placa.setText(null);
				tf_renavam.setText(null);
				tf_bairro.setText(null);
				tf_cidade.setText(null);
				
				ta_descricao.setText(null);

			}
		});

		btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(144, 490, 91, 23);
		contentPane.add(btnLimpar);

		btnCancelar = new JButton("Fechar");
		btnCancelar.setBounds(262, 490, 91, 23);
		contentPane.add(btnCancelar);

		btnCancelar.addActionListener(new ActionListener() 
		{	@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) 
		{
			new DelegaciaView().show(); // retorna para a classe principal
				dispose(); // fecha a atual

			}
		});

	}

	public JComboBox<String> getComboBox_2() 
	{	return comboBox_2;
	}

	public void setComboBox_2(JComboBox<String> comboBox_2) 
	{	this.comboBox_2 = comboBox_2;
	}
}
