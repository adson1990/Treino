package introducao;

public class ClassesWrapper {

	public static void main(String[] args) {
		
		Integer idade = new Integer (31);
		Double preco = new Double ("2.75");//pode criar tanto numerico como String
		int i = preco.intValue();//conversão de Wrapper para outra classe
		byte b = preco.byteValue();
		float f = preco.floatValue();
		
		Boolean casado = new Boolean ("yes");//podendo ser TRUE também
		
		//CONVERSÃO ESTÁTICA
		double d1 = Double.parseDouble("123.456");
		int i1 = Integer.parseInt("123");
		float f1 = Float.parseFloat("3.14F");
		
		int i2 = Integer.valueOf("101011", 2);//valor e depois da virgula a base do valor para conversão (binário, decimal...)
		
		System.out.println(i2);		

	}

}
