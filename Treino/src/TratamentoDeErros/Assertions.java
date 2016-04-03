package TratamentoDeErros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um número de 0 a 10");
		int i = s.nextInt();
		
		assert (i >= 0 && i <= 10) : "Número inválido" + i + " você deve entrar com um número entre 0 e 10";
		
		System.out.println("Você digitou " + i);
	}

/*As assertions vem por padrão em modo off
Para habilitar uma assertion no menu RUN vá em run configurations
Na aba arguments em no campo VM arguments digite "-ea" (ENABLE ASSERTIONS)
e para desabilitar as assertions digite "-da" (DISABLE ASSERTIONS)
podendo também desabilitar ou habilita-las por pacote usando:
-ea:(nome do pacote)... ou -da:(nome do pacote)...
as reticências indicam que todos os subpacotes daquele pacote receberão as mudanças*/
	}