package TratamentoDeErros;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DividePorZero {
	public static void dividir(Scanner s)
			throws InputMismatchException {
		}

		public static void main(String[] args) {
			int i;
			Scanner s = new Scanner(System.in);
			boolean confirma = true;
			
			do{
			try{
			System.out.println("Número: ");
			int a = s.nextInt();
			System.out.println("Divisor: ");
			int b = s.nextInt();
			
			System.out.println(a/b);
			confirma = false;
			}
			catch(ArithmeticException | InputMismatchException e1){//o multi catch permitiria que usassemos mais de 1 erro em apenas 1 bloco de comando dividind-os por "|".
				//System.err.println("O divisor deve ser diferente de zero.");
				System.out.println("Número inválido.");
				e1.printStackTrace();//exibi todas as linhas onde foram eclodidos os erros até a linha final do bloco de comando
				e1.getStackTrace();//gravaria todas as linhas de erros em array para que posteriormente fossem tratadas
				e1.getMessage();//grava a lista de erro em formato de String
				s.nextLine();//descarta a entrada errada, limpa a variável... E libera para receber novo valor do usuário
				
			}
			/*catch(InputMismatchException e2){
				System.err.println("Deve-se digitar apenas números.");
				s.nextLine();
			}*/
			finally{}
			
			}while (confirma);
			
			}

}
