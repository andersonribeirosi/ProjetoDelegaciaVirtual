package view;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FormularioVeiculo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel lb_placa, lb_renavan, lb_cor, lb_marca, lb_ano_fab, lb_ano_mod, lb_chassi, lb_preco, lb_modelo;
	JTextField tf_renavan, tf_ano_fab, tf_ano_mod, tf_chassi, tf_preco, tf_modelo, tf_placa;
	JComboBox<String> cb_cor, cb_marca;
	JButton bt_salvar, bt_limpar, bt_fechar;

	public FormularioVeiculo(){

		JOptionPane.showMessageDialog(null, "Consultar Situa��o do Ve�culo");
		setTitle("Consulta de Ve�culos");
		setSize(550, 450);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		lb_placa = new JLabel("Placa");
		lb_marca = new JLabel("Marca");
		lb_ano_fab = new JLabel("Ano Fabrica��o");
		lb_ano_mod = new JLabel("Ano Modelo");
		lb_chassi = new JLabel("Chassi");
		// lb_preco = new JLabel("Pre�o de Loca��o");
		lb_cor = new JLabel("Cor");
		lb_renavan = new JLabel("Renavan");
		lb_modelo = new JLabel("Modelo");
		tf_renavan = new JTextField("");
		tf_ano_fab = new JTextField("");
		tf_ano_mod = new JTextField("");
		tf_chassi = new JTextField("");
		// tf_preco = new JTextField("");
		tf_modelo = new JTextField("");
		tf_placa = new JTextField("");
		cb_cor = new JComboBox<String>();
		cb_marca = new JComboBox<String>();
		bt_salvar = new JButton("Consultar");
		bt_limpar = new JButton("Limpar");
		bt_fechar = new JButton("Fechar");
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
		// getContentPane().add(lb_preco);
		getContentPane().add(lb_renavan);
		getContentPane().add(lb_modelo);
		getContentPane().add(lb_marca);
		getContentPane().add(cb_cor);
		getContentPane().add(cb_marca);
		getContentPane().add(tf_ano_fab);
		getContentPane().add(tf_ano_mod);
		getContentPane().add(tf_chassi);
		// getContentPane().add(tf_preco);
		getContentPane().add(tf_placa);
		getContentPane().add(tf_renavan);
		getContentPane().add(tf_modelo);
		getContentPane().add(bt_salvar);
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
		// lb_preco.setBounds(20, 270, 150, 15);
		// tf_preco.setBounds(20, 290, 120, 25);
		bt_salvar.setBounds(20, 340, 100, 30);
		bt_limpar.setBounds(143, 340, 99, 30);
		bt_fechar.setBounds(266, 340, 100, 30);
	}

	public static void main(String args[]) {
		new FormularioVeiculo().setVisible(true);
	}
}