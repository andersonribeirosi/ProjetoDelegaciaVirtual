package model;

import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Teste extends JFrame {  
	   private static final long serialVersionUID = 1L;  
	   private JButton btnVerificar;  
	  
	   public Teste() {  
	      super("Limpa Campos de Texto");  
	      setDefaultCloseOperation(EXIT_ON_CLOSE);  
	      setSize(300, 300);  
	      setLayout(new GridLayout(6,2));  
	  
	      for (int i = 0; i < 5; i++) {  
	         add(new JLabel("Campo " + i));  
	         add(new JTextField());  
	      }  
	      btnVerificar = new JButton("Verificar Campos");  
	      add(new JLabel());  
	      add(btnVerificar);  
	  
	      btnVerificar.addActionListener(new ActionListener() {  
	  
	         @Override  
	         public void actionPerformed(ActionEvent e) {  
	            //Todos os componentes do Painel do Frame  
	            Component components[] = getContentPane().getComponents();  
	            //Para cada componente  
	            for (int i = 0; i < components.length; i++) {  
	               //É campo de texto?  
	               if (components[i] instanceof JTextField) {  
	                  //Está preenchido?  
	                  if (((JTextField) components[i]).getText().isEmpty()) {  
	                     //Não, então exibo mensagem de erro  
	                     JOptionPane.showMessageDialog(null,  
	                           "Preencher todos os campos");  
	                     break;  
	                  }  
	               }  
	            }  
	         }  
	  
	      });  
	  
	   }  
	  
	   public static void main(String[] args) {  
	      new Teste().setVisible(true);  
	   }  
	}  
