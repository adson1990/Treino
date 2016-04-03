package poo;

public class EnumTest {
	
	public static final double PI = 3.14;
	
	public static void andar(Medida medida, int total){
		switch (medida) {
		case M:
			System.out.println("Escolhido Metro!");
			break;
		case CM:
			System.out.println("Escolhido Cent�metro!");
			break;
			
		case MM:
			System.out.println("Escolhido Mil�metro!");
			break;

		default:
			System.out.println("Op��o inv�lida!");
			break;
		}
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(PecasXadrez.BISPO);
		System.out.println(PecasXadrez.RAINHA);
		
		System.out.println(Medida.CM.titulo);
		System.out.println(Medida.M);
		
		for (Medida m : Medida.values()) {//esse array percorrer� cada objeto da ENUM medida
			System.out.println(m + " : " + m.titulo);
		}
		
		andar(Medida.M, 10);

	}

}
