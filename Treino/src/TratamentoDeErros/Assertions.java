package TratamentoDeErros;

import java.util.Scanner;

public class Assertions {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com um n�mero de 0 a 10");
		int i = s.nextInt();
		
		assert (i >= 0 && i <= 10) : "N�mero inv�lido" + i + " voc� deve entrar com um n�mero entre 0 e 10";
		
		System.out.println("Voc� digitou " + i);
	}

/*As assertions vem por padr�o em modo off
Para habilitar uma assertion no menu RUN v� em run configurations
Na aba arguments em no campo VM arguments digite "-ea" (ENABLE ASSERTIONS)
e para desabilitar as assertions digite "-da" (DISABLE ASSERTIONS)
podendo tamb�m desabilitar ou habilita-las por pacote usando:
-ea:(nome do pacote)... ou -da:(nome do pacote)...
as retic�ncias indicam que todos os subpacotes daquele pacote receber�o as mudan�as*/
	}