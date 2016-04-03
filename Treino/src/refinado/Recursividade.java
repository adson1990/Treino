package refinado;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursividade {

	public static int soma(int x){
		if(x == 0){
			return x;
		}else {
			return x + soma(x-1);
		}
	}
	
	//POTENCIA (3, 4)
	public static int potencia (int x, int e){
		if(e == 1){
			return x;
		}else {
			return x * potencia(x, e-1);
		}
	}
	
	public static void listar(Path path) throws IOException{
		if (Files.isRegularFile(path)){
			System.out.println(path.toAbsolutePath());
		}else{
			String s = "\n" + path.toAbsolutePath();
			System.err.println(s.toUpperCase());
			try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
				for (Path path2 : stream) {
					listar(path2);
				}
			}catch (Exception e){
				
			}
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		
		System.out.println(soma(10));
		System.out.println(potencia(3,4));
		listar(Paths.get("C:/Users/Adson/workspace"));
		
	}

}
