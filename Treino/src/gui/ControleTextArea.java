package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ControleTextArea extends JFrame implements ActionListener {

	JTextArea texto;
	
	public ControleTextArea (){
		super("Editor de Textos.");
		
		texto = new JTextArea();
		JScrollPane scroll = new JScrollPane(texto);
		texto.setFont(new Font("serif", Font.PLAIN, 26));
		
		JButton botao = new JButton("Abrir Arquivo");
		botao.setFont(new Font("serif", Font.PLAIN, 26));
		botao.addActionListener(this);
		
		Container c = getContentPane();
		c.add(BorderLayout.CENTER, scroll);
		c.add(BorderLayout.SOUTH, botao);
		
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ControleTextArea();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JFileChooser c = new JFileChooser();
		c.showOpenDialog(this);
		File file = c.getSelectedFile();
		
		try{
			Path path = Paths.get(file.getAbsolutePath());
			String retorno = new String (Files.readAllBytes(path));
			texto.setText(retorno);
		}catch(Exception error){
			JOptionPane.showMessageDialog(this, "Não conseguimos carregar seu arquivo.");
		}
	}
}