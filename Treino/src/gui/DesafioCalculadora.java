package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class DesafioCalculadora extends JFrame {
	
	public DesafioCalculadora(){//construtor
		super("Calculadora");//titulo da Janela
		
		Container c = new JPanel();//container
		c.setLayout(new GridLayout(4,4, 5,5));//setando o layout do container tipo matrix de 4x4
		c.add(new JButton("7"));//botao [1,1]
		c.add(new JButton("8"));//botao [1,2]
		c.add(new JButton("9"));//botao [1,3]
		c.add(new JButton("/"));//botao [1,4]
		c.add(new JButton("4"));//botao [2,1]
		c.add(new JButton("5"));//botao [2,2]
		c.add(new JButton("6"));//botao [2,3]
		c.add(new JButton("*"));//botao [2,4]
		c.add(new JButton("1"));//botao [3,1]
		c.add(new JButton("2"));//botao [3,2]
		c.add(new JButton("3"));//botao [3,3]
		c.add(new JButton("-"));//botao [3,4]
		c.add(new JButton("0"));//botao [4,1]
		c.add(new JButton("."));//botao [4,2]
		c.add(new JButton("="));//botao [4,3]
		c.add(new JButton("+"));//botao [4,4]
		
		Container c2 = getContentPane();//container 2
		c2.setLayout(new BorderLayout(5, 5));//setando layout container 2
		
		JTextField campo = new JTextField();//campo texto
		campo.setFont(new Font ("serif", Font.PLAIN, 26));
		c2.add(BorderLayout.NORTH, campo);
		c2.add(BorderLayout.CENTER, c);
		
		setSize(350,350);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
	
		new DesafioCalculadora();

	}

}
