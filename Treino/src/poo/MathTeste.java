package poo;

public class MathTeste {

	public static void main(String[] args) {
		
		/*Classe Math
		 * SIN(a) -> seno				COS(a) -> cosseno					TAN(a) -> tangente
		 * ASIN(v) -> arco sen de v		COS(v) ->  arco cos de v			ATAN(v) -> arco tg de v
		 * EXP(x) -> Euler elevado a x	SINH(x) -> seno hiperbolico de x	COSH(x) -> cos hiper de x
		 * TANH(x) -> tg hiper de x		POW(x,y) -> x elevado a y			LOG(x) -> logaritmo de x
		 * SQRT(X) -> square root raíz quadrada		CBRT(x)-> raíz cubica de x
		 * SIGNUM(x) -> retorna 1 se x for >0, -1 se x < o e e 0 de x=0
		 * CEIL(x) -> maior inteiro mais próximo a x	FLOOR(x) -> menor inteiro mais prox a x
		 * ROUND(x) -> arredonda o valor de x se for fração		MAX(x,y) -> retorna o maior num entre x e y
		 * MIN(x,y) -> retorna o menor num entre x e y		HYPOT(x,y) -> raiz de x² + y²*/
		
		
		System.out.println(Math.sin(10));//seno
		System.out.println(Math.cos(10));//cosseno
		System.out.println(Math.tan(45));//tangente
		System.out.println(Math.pow(4, 2));//potencia
		System.out.println(Math.sqrt(16));//raíz quadrada
		System.out.println(Math.cbrt(16));//raíz cúbica
		System.out.println(Math.hypot(6, 8));//hipotenusa
		

	}

}
