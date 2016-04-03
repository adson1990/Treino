package leituraEGravacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import poo.Conta;

public class Arquivo3{
	Path path = Paths.get("C:/Users/Adson/workspace/contas.txt");
	Charset utf8 = StandardCharsets.UTF_8;
	
	//MÉTODO PRINCIPAL PARA ARMAZENAR AS CONTAS
	public void armazenarContas(ArrayList<Conta> contas) throws IOException{
		
	try(BufferedWriter w = Files.newBufferedWriter(path, utf8)){
		for (Conta contaRecebe : contas){
			w.write(contaRecebe.getNome() + ";" + contaRecebe.getSaldo() + "\n");
		} 
	}
}
	//MÉTODO PRINCIPAL PARA RETORNAR AS CONTAS ARMAZENADAS
	public ArrayList<Conta> retornarContas() throws IOException{
		ArrayList<Conta> contaRecebe = new ArrayList<>();
		try(BufferedReader r = Files.newBufferedReader(path, utf8)){
			String line = null;
			while ((line = r.readLine()) != null){
				String[] token = line.split(";");
				Conta contas = new Conta(token[0], Double.parseDouble(token[1]));
				contaRecebe.add(contas);
			}
		}
		
		return contaRecebe;
	}
	
	public static void main(String[] args) throws IOException {
		//Criando array list com contas
		ArrayList<Conta> contas = new ArrayList<>();
		contas.add(new Conta("Adson", 12000.00));
		contas.add(new Conta("Lawrence", 11500.00));
		contas.add(new Conta("Vanessa", 12800.00));
		contas.add(new Conta("Beatriz", 10000.00));
		
		//chamando o método de armazenar contas
		Arquivo3 operacao = new Arquivo3();
		operacao.armazenarContas(contas);
		//chamando o método de retornar as contas armazenadas
		ArrayList<Conta> contaFinal = new ArrayList<>();
		contaFinal = operacao.retornarContas();
		for (Conta conta2 : contaFinal){
			conta2.visualizarSaldo();
		}
	}
}