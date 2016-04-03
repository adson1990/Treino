package introducao;

public class SequenciaFibonacci {

	public static void main(String[] args) {
		
		long[] sequencia = new long[50];
		int numero1=0;
		int numero2=1;
		long resultado=0;
		
		sequencia[0] = 0;
		sequencia[1] = 1;
		
		for (int i=2; i<50; i++){
			
			resultado = sequencia[numero1] + sequencia[numero2];
			sequencia[i] =  resultado;
			numero1++;
			numero2++;
			System.out.println(sequencia[i]);
			if (resultado >=34) {
				break;
			}
			
		}
	}

}
