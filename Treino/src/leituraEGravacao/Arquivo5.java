package leituraEGravacao;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo5 {

	public static void main(String[] args) throws IOException {
		Iterable <Path> dirs = FileSystems.getDefault().getRootDirectories();//busca todos os diretorios raiz do pc
		for (Path path : dirs){
			System.out.println(path);//for eatch para percorrer os diretorios e exibir eles
		}
		
		//LISTAR O CONTEÚDO
		Path dir = Paths.get("C:/Users/Adson/workspace");
		try(DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
			
			for (Path path : stream) {
				System.out.println(path.getFileName());
			}
			
		}catch(IOException | DirectoryIteratorException e){
			e.printStackTrace();
		}
		
		//PARTIÇÕES
		FileSystem fs = FileSystems.getDefault();
		for (FileStore store : fs.getFileStores()) {
			System.out.println("Unidade: " + store.toString());
			System.out.println("Total de espaço: " + store.getTotalSpace());
			System.out.println("Espaço disponível: " + store.getUsableSpace());
			System.out.println("Espaço usado: " + (store.getTotalSpace() - store.getUsableSpace()));
		}
		
	}

}
