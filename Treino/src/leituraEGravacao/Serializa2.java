package leituraEGravacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import poo.Conta;

public class Serializa2 {
	//Path path = Paths.get("C:/Users/Adson/workspace/texto.txt");
	//Charset utf8 = StandardCharsets.UTF_8;

	//MÉTODO PRINCIPAL PARA ARMAZENAR AS CONTAS
	public void armazenarConta(ArrayList<Conta> contas) throws IOException{
		try (FileOutputStream fos = new FileOutputStream("C:/Users/Adson/workspace/contas.ser")){
			try (ObjectOutputStream oos = new ObjectOutputStream(fos)){
				oos.writeObject(contas);
			}
		}
	}
	
		/*
		try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
			for (Conta conta : contas) {
				w.write(conta.getNome() + ";" + conta.getSaldo() + "\n");
				
			}
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}*/
		
		//MÉTODO PRINCIPAL PARA RETORNAR AS CONTAS ARMAZENADAS
		
		 public ArrayList<Conta> retornarContas() throws IOException, ClassNotFoundException{
			try (FileInputStream fis = new FileInputStream("C:/Users/Adson/workspace/contas.ser")){
				try (ObjectInputStream ois = new ObjectInputStream(fis)){
					return (ArrayList<Conta>) ois.readObject();
			}
		}
	}
			
			/*ArrayList<Conta> contaRecebe = new ArrayList<>();
			try (BufferedReader r = Files.newBufferedReader(path, utf8)){
				String line = null;
				while ((line = r.readLine()) != null){
					String[] token = line.split(";");
					Conta contas = new Conta(token[0], Double.parseDouble(token[1]));
					contaRecebe.add(contas);
				}
			}
			return contaRecebe;
		}*/

	public static void main(String[] args) throws IOException, ClassNotFoundException {
			//Criando array list com contas
				ArrayList<Conta> contas = new ArrayList<>();
				contas.add(new Conta("Adson", 12000.00));
				contas.add(new Conta("Lawrence", 11500.00));
				contas.add(new Conta("Vanessa", 12800.00));
				contas.add(new Conta("Beatriz", 10000.00));
				
			//chamando o método de armazenar contas
				Serializa2 operacao = new Serializa2();
				operacao.armazenarConta(contas);
			//chamando o método de retornar as contas armazenadas
				ArrayList<Conta> contaFinal = new ArrayList<>();
				contaFinal = operacao.retornarContas();
				for (Conta conta2 : contaFinal){
					conta2.visualizarSaldo();
				}
			}
	}
