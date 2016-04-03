package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts2 extends JFrame {

	public Layouts2(){
		super("Minha Janela");
		
		Container c = getContentPane();
		Container c2 = new JPanel();
		/*
		c.setLayout(new BorderLayout(5, 5));//passando um numero no parametro de borderlayout é o espaçamento entre os botoes do container
		c.add(BorderLayout.NORTH, new JButton("N"));
		c.add(BorderLayout.SOUTH, new JButton("S"));
		c.add(BorderLayout.CENTER, new JButton("C"));
		c.add(BorderLayout.EAST, new JButton("E"));
		c.add(BorderLayout.WEST, new JButton("W"));
		*/
		/*
		c.setLayout(new GridLayout(2,3));//gridlayout distribui os botos como se fosse matrix
		c.add(new Button("1"));
		c.add(new Button("2"));
		c.add(new Button("3"));
		c.add(new Button("4"));
		c.add(new Button("5"));
		c.add(new Button("6"));
		*/
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("OK"));
		c2.add(new JButton("Cancel"));
		c2.add(new JButton("Setup"));
		c2.add(new JButton("Exit"));
		
		c.setLayout(new BorderLayout(10,10));
		c.add(BorderLayout.CENTER, new JButton("Centro"));
		c.add(BorderLayout.EAST, c2);
		
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 setVisible(true);
		 setSize(350, 350);
	}
	
	public static void main(String[] args) {
		
		new Layouts2();

	}

}
