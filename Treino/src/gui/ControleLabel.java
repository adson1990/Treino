package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleLabel extends JFrame {
	
	public ControleLabel(){
		super("Label");
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel simples = new JLabel("Label Simples");
		simples.setToolTipText("Meu ToolTip");
		c.add(simples);
		
		Font fonte = new Font("serif", Font.BOLD | Font.ITALIC, 22);
		JLabel label = new JLabel("Novo Label");
		label.setFont(fonte);
		label.setForeground(Color.BLUE);
		c.add(label);
		
		ImageIcon icon =
				new ImageIcon(getClass().getResource("Fotos/Desert.jpg"));
		JLabel imagem = new JLabel(icon);
		imagem.setToolTipText("Imagem texte deserto");
		c.add(imagem);
		
		setSize(350, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleLabel();

	}

}
