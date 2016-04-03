package introducao;

public class AutoBoxing {

	public static void main(String[] args) {
		
		Integer x = new Integer(555);//empacotado
		int i = x.intValue();//desempacotado
		i++;//incremento da variável
		x = new Integer(i);//reempacotar
		System.out.println(x.intValue());
		
		Integer x2 = 556;
		x2++;//desempacota, incremente, reempacota
		System.out.println(x2);
		
		Boolean b = new Boolean("TRUE");
		if (b.booleanValue()){
			System.out.println("TRUE");
		}
		if (b){
			System.out.println("TRUE");//ambas as formas são aceitas
		}
	}

}
