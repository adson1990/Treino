package leituraEGravacao;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo {

	public static void main(String[] args) throws IOException {
		//criando arquivo indicando o caminho "PATH"
		Path path = Paths.get("C:/Users/Adson/workspace/texto.txt");
		path.toAbsolutePath();//retorna o caminho completo do arquivo
		path.getFileName();//retorna o nome do arquivo
		path.getParent(); //retorna o caminha pai do arquivo
		path.getRoot();//retorna a raiz onde esta o arquivo
		path.compareTo(path);//compara os 2 arquivos
		path.equals(path);//compara retornando uma logica booleana
		path.startsWith("t");//verifica se começa com a string indicada
		path.endsWith("x");//verifica se termina com a string indicada
		
		//criação de diretórios
		Files.createDirectories(path.getParent());
		
		//Escrever e ler arquivos
		byte[] bytes = "Meu Texto".getBytes();
		Files.write(path, bytes);//cria, escreve e fecha
		
		byte[] retorno = Files.readAllBytes(path);
		System.out.println(new String (retorno));
	}

}