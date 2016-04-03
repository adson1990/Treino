package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Janela extends JFrame {

	public Janela(){
	
		super("Minha Janela");
	
	JButton botao2 = new JButton("Clique aqui.");
	getContentPane().add(botao2);
	
	setSize(350, 350);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	}
	
	/*este construtor é um exemplo de como pode ser feito mas como essa classe é herança da classe JFrame poder chamar o construtor da superclasse direto
	 * 
	public Janela(){//construtor
		JFrame frame = new JFrame();
		
		//criando conteiner com controle
		JButton botao = new JButton("Clique aqui");
		frame.getContentPane().add(botao);
		
		//criando janela ou frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//define o que acontece quando clicam no "x" da aplicação
		frame.setSize(300, 300);//setando largura e altura
		frame.setVisible(true);//setando visibilidade positiva da janela pois ela pode estar invisível
	}
	*/
	public static void main(String[] args) {
		
		new Janela();
	}

}
