package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ControleTeste extends JFrame implements ActionListener {
	
	JTextField login;
	JPasswordField senha;
	JButton ok, cancel;
	
	public ControleTeste(){//método construtor padrão
		super("Textos e Senhas");//chamando a superclasse
		
		login = new JTextField();
		senha = new JPasswordField();
		
		ok = new JButton("Ok");
		ok.addActionListener(this);
		
		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		
		Container c = getContentPane();//criando container
		c.setLayout(new GridLayout(3,2));//adicionando o layout "gridlayout" ao container com 3 linhas e 2 colunas
		c.add(new JLabel ("Login"));//adicionando um label com nome login na primeira coluna
		c.add(login);//adicionando um campo "jtextfield" na segunda coluna primeira linha
		c.add(new JLabel("Senha"));//outro label na segunda coluna segunda linha um label com nome senha
		c.add(senha);//campo de senha na mesma linha que a cima
		c.add(ok);//botao de ok
		c.add(cancel);//botao de cancel
		
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new ControleTeste();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ok) {
			
			String s = "Login: " + login.getText() + "\nSenha: " + new String (senha.getPassword());
			JOptionPane.showMessageDialog(null, s);
			
		}else if(e.getSource() == cancel) {
			login.setText("");
			senha.setText("");
		}
		
	}

}
