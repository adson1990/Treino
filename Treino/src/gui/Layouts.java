package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layouts extends JFrame {

	public Layouts(){
		super("Layouts");
		
		Container c = getContentPane();
		BorderLayout border = new BorderLayout();//existe também um mais simples o flowlayout que distribue os botões de acordo com a ordem de chagada
		c.setLayout(border);
		
		c.add(BorderLayout.NORTH, new JButton("1"));
		c.add(BorderLayout.SOUTH, new JButton("2"));
		c.add(BorderLayout.CENTER, new JButton("3"));
		c.add(BorderLayout.WEST, new JButton("4"));
		c.add(BorderLayout.EAST, new JButton("5"));		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(350,350);
		setVisible(true);
	}
	
	public static void main(String[] args) {
			
		new Layouts();

	}

}
