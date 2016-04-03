package leituraEGravacao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo2 {

	public static void main(String[] args) throws IOException {
		
		Path path = Paths.get("C:/Users/Adson/workspace/texto.txt");//criando o caminho do arquivo
		Charset utf8 = StandardCharsets.UTF_8;//tipo de edição
		
		BufferedWriter w = Files.newBufferedWriter(path, utf8);//cirando uma variavel de escrita de string
		
		String s = "Venha trabalhar com JAVA";
		String[] tokens  = s.split(" ");//quebrando uma frase em tokens
		System.out.println(tokens.length);//quantidade de tokens
		
		//ESCRITA
		try{
		for(String token : tokens){//for eache para escrever os tokens na variavel buffered
			w.write(token + " ");
			}
		w.flush();//grava os dados
		}catch(IOException e){
			e.printStackTrace();
		}
		finally {
			if (w != null){
		w.close();//fecha o registro
			}
		}
		
		//LEITURA
		try(BufferedReader r = Files.newBufferedReader(path, utf8)){//outra forma de trabalhar inicializando a valiavel nos parametros do try
			String line = null;
			while ((line = r.readLine()) != null){
				System.out.println(line + " ");
				} 
			}catch (IOException e){
				e.printStackTrace();
		}
	}

}
