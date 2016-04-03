package leituraEGravacao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Arquivo4 {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("C:/Users/Adson/workspace/texto.txt");
		Path path2 = Paths.get("C:/Users/Adson/workspace/texto2.txt");
		
		//ALGUMAS PROPRIEDADES
		System.out.println(Files.exists(path));//retorna uma lógica booleana se existe ou não
		System.out.println(Files.isDirectory(path));//retorna uma lógica booleana se é um diretório
		System.out.println(Files.isRegularFile(path));//se é um arquivo regular
		System.out.println(Files.isReadable(path));//se pode ser lido pelo usuário da aplicação
		System.out.println(Files.isExecutable(path));//se pode ser executado pelo usuário
		System.out.println(Files.size(path));//ver o tamanho do arquivo
		System.out.println(Files.getLastModifiedTime(path));//ultima vez que ele foi modificado
		System.out.println(Files.getOwner(path));//retorna o nome do dono do arquivo (quem o criou)
		System.out.println(Files.probeContentType(path));//retorna o tipo de arquivo(texto, video, imagem...)
		
		
		//DELETE
		//Files.delete(path);//deleta o arquivo e lança exceções se der errado
		Files.deleteIfExists(path2);//deleta se existir e não lança exceções
		
		//CRIANDO ARQUIVO
		Files.createFile(path2);//cria arquivo em branco
		Files.write(path2, "Meu Texto Teste".getBytes());
		
		//COPY
		Path copia = Paths.get("C:/Users/Adson/workspace/copia.txt");
		Files.copy(path, copia, StandardCopyOption.REPLACE_EXISTING);
		
		//MOVE
		Path mover = Paths.get("C:/Users/Adson/workspace/move/fonte.txt");
		Files.createDirectories(mover.getParent());
		Files.move(path, mover, StandardCopyOption.REPLACE_EXISTING);
	}
}
