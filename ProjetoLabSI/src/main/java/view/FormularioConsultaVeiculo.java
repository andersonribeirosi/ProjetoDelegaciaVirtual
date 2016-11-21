package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ConexaoBD;
import controller.ControleVeiculo;
import model.Veiculo;

public class FormularioConsultaVeiculo extends JFrame {

	Veiculo veiculo = new Veiculo();
	ControleVeiculo controle = new ControleVeiculo();
	ConexaoBD connex = new ConexaoBD();
	
	
	private static final long serialVersionUID = 1L;
	JLabel lb_placa, lb_renavan, lb_cor, lb_marca, lb_ano_fab, lb_ano_mod, lb_chassi, lb_preco, lb_modelo;
	JTextField tf_renavan, tf_ano_fab, tf_ano_mod, tf_chassi, tf_preco, tf_modelo, tf_placa;
	JComboBox<String> cb_cor, cb_marca;
	JButton bt_consulta, bt_limpar, bt_fechar;
	
		
	
	public FormularioConsultaVeiculo() {
		
		

//		JOptionPane.showMessageDialog(null, "Consultar Situação do Veículo");
		setTitle("Consulta de Veículos");
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		lb_placa = new JLabel("Placa");
		lb_marca = new JLabel("Marca");
		lb_ano_fab = new JLabel("Ano Fabricação");
		lb_ano_mod = new JLabel("Ano Modelo");
		lb_chassi = new JLabel("Chassi");
		lb_cor = new JLabel("Cor");
		lb_renavan = new JLabel("Renavan");
		lb_modelo = new JLabel("Modelo");
		tf_renavan = new JTextField("");
		tf_ano_fab = new JTextField("");
		tf_ano_mod = new JTextField("");
		tf_chassi = new JTextField("");
		tf_modelo = new JTextField("");
		tf_placa = new JTextField("");
		cb_cor = new JComboBox<String>();
		cb_marca = new JComboBox<String>();

		bt_consulta = new JButton("Consultar");
		bt_consulta.setToolTipText("Realizar Consulta");
		bt_consulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				veiculo.setPlaca(tf_placa.getText());
				veiculo.setChassi(tf_chassi.getText());
				veiculo.setRenavan(tf_renavan.getText());
				veiculo.setAno_fab(tf_ano_fab.getText());
				veiculo.setAno_mod(tf_ano_mod.getText());
				veiculo.setModelo(tf_modelo.getText());
				veiculo.setCor((String) cb_cor.getSelectedItem());
				veiculo.setMarca((String) cb_marca.getSelectedItem());
				
				controle.salvar(veiculo);
				
//				private void bt_consulta(java.awt.event.ActionEvent evt){
//					veiculo.setPlaca(tf_placa.getText());
//					veiculo.setChassi(tf_chassi.getText());
//					veiculo.setRenavan(tf_renavan.getText());
//					veiculo.setAno_fab(tf_ano_fab.getText());
//					veiculo.setAno_mod(tf_ano_mod.getText());
//					veiculo.setModelo(tf_modelo.getText());
//					veiculo.setCor((String) cb_cor.getSelectedItem());
//					veiculo.setMarca((String) cb_marca.getSelectedItem());
//					
//					controle.salvar(veiculo);
//					
				
				
				
//				String texto = "Dados do Véiculo \n " + " \n";
//				texto += "Placa: " + tf_placa.getText() + " \n ";
//				texto += "Renavan: " + tf_renavan.getText() + " \n ";
//				texto += "Chassi: " + tf_chassi.getText() + " \n ";
//				texto += "Marca: " + cb_marca.getSelectedItem() + " \n ";
//				texto += "Modelo: " + tf_modelo.getText() + " \n ";
//				texto += "Cor: " + cb_cor.getSelectedItem() + " \n ";
//				texto += "Ano de Fabricação: " + tf_ano_fab.getText() + " \n ";
//				texto += "Ano Modelo: " + tf_ano_mod.getText() + " \n ";
//
//				JOptionPane.showMessageDialog(null, texto);
			}
		});
		bt_limpar = new JButton("Limpar");
		bt_limpar.setToolTipText("Limpar Campos");
		bt_limpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf_placa.setText(null);
				tf_renavan.setText(null);
				tf_chassi.setText(null);
				tf_ano_fab.setText(null);
				tf_ano_mod.setText(null);
				tf_modelo.setText(null);
				cb_cor.setSelectedItem(null);
				cb_marca.setSelectedItem(null);

			}
		});

		bt_fechar = new JButton("Fechar");
		bt_fechar.setToolTipText("Fecha o formulário de consulta");

		bt_fechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);

			}
		});
		cb_cor.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Selecione a Cor", "Amarelo",
				"Azul", "Branco", "Cinza", "Grafite", "Prata", "Preto", "Verde", "Vermelho" }));
		cb_marca.setModel(new javax.swing.DefaultComboBoxModel<String>(
				new String[] { "Selecione a Marca", "Ford", "Chevrolet", "Toyota", "Wolkswagem", "Fiat", "Honda" }));
		getContentPane().setLayout(null);
		getContentPane().add(lb_placa);
		getContentPane().add(lb_ano_fab);
		getContentPane().add(lb_ano_mod);
		getContentPane().add(lb_chassi);
		getContentPane().add(lb_cor);
		getContentPane().add(lb_renavan);
		getContentPane().add(lb_modelo);
		getContentPane().add(lb_marca);
		getContentPane().add(cb_cor);
		getContentPane().add(cb_marca);
		getContentPane().add(tf_ano_fab);
		getContentPane().add(tf_ano_mod);
		getContentPane().add(tf_chassi);
		getContentPane().add(tf_placa);
		getContentPane().add(tf_renavan);
		getContentPane().add(tf_modelo);
		getContentPane().add(bt_consulta);
		getContentPane().add(bt_limpar);
		getContentPane().add(bt_fechar);
		lb_placa.setBounds(20, 20, 100, 15);
		tf_placa.setBounds(20, 40, 80, 25);
		lb_renavan.setBounds(115, 20, 100, 15);
		tf_renavan.setBounds(115, 40, 150, 25);
		lb_chassi.setBounds(20, 70, 100, 15);
		tf_chassi.setBounds(20, 90, 150, 25);

		lb_marca.setBounds(20, 120, 300, 15);
		cb_marca.setBounds(20, 140, 250, 25);

		lb_modelo.setBounds(280, 120, 150, 15);
		tf_modelo.setBounds(280, 140, 200, 25);
		lb_cor.setBounds(20, 170, 200, 15);
		cb_cor.setBounds(20, 190, 250, 25);
		lb_ano_fab.setBounds(20, 226, 100, 15);
		tf_ano_fab.setBounds(20, 248, 120, 25);
		lb_ano_mod.setBounds(150, 226, 80, 15);
		tf_ano_mod.setBounds(150, 248, 120, 25);
		bt_consulta.setBounds(20, 340, 100, 30);
		bt_limpar.setBounds(143, 340, 99, 30);
		bt_fechar.setBounds(266, 340, 100, 30);
		
		
			
			
		}
	

	public static void main(String args[]) {
		new FormularioConsultaVeiculo().setVisible(true);
	}
}