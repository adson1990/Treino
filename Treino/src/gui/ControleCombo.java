package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener {
	
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("Fotos/controles de janelas java.jpg")),
			new ImageIcon(getClass().getResource("Fotos/Desert.jpg")),
			new ImageIcon(getClass().getResource("Fotos/Lighthouse.jpg")),
			new ImageIcon(getClass().getResource("Fotos/Tulips.jpg")),
	};
	
	public ControleCombo(){
		super("Album de fotos");
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("serif", Font.PLAIN, 26));
		combo.addItem("JAVA Frames");
		combo.addItem("Deserto");
		combo.addItem("Casa na montanha");
		combo.addItem("Tulipas");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		setSize(300, 530);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ControleCombo();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED){
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}

}
