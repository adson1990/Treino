package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame implements ActionListener {

	JButton botao;
	
	public Eventos(){
		super("Eventos");
		
		botao = new JButton("Clique Aqui");
		botao.addActionListener(this);
		getContentPane().add(botao);
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Eventos();

	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Clicou");
		botao.setText("Foi clicado");
	}

}
