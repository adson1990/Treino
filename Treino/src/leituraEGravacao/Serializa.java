package leituraEGravacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

import poo.Conta;

public class Serializa {

	public static void main(String[] args) throws Exception {
		
		String[] contas = {"Adson", "Vanessa", "Bezerrinha"};
		
		Conta conta1 = new Conta("Teste", 111_222_333.444);
		Conta conta2 = new Conta("Teste dois", 100_000.50);
		 	
		//ESCRITA DE OBJETO
		
		FileOutputStream fos = new FileOutputStream("C:/Users/Adson/workspace/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		 
		oos.writeObject(contas);
		oos.writeObject(conta1);
		oos.writeObject(conta2);
		oos.close();
		
		
		//LEITURA DE OBJETO
		FileInputStream fis = new FileInputStream("C:/Users/Adson/workspace/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		String[] nomes = (String[]) ois.readObject();
		Conta c1 = (Conta) ois.readObject();
		Conta c2 = (Conta) ois.readObject();
		ois.close();
		
		System.out.println(Arrays.toString(nomes));
		c1.visualizarSaldo();
		c2.visualizarSaldo();
	}

}
