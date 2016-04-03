package colecao;

import java.util.ArrayList;

public class Generico <E> {

	E elemento;
	
	public void setElemento(E elemento){
		this.elemento = elemento;
		}
	public E getElemento(){
		return elemento;
	}
	
	public double some(ArrayList<? extends Number> list){//extendendo de number trabalha com todas as classes filhas de number
		double total=0;
		for (Number number : list) {
			total += number.doubleValue();
		}
		return total;
	}
	
	public double subtrai(ArrayList<? super Number> list){//extende da classe pai de number
		double total=0;
		return total;
	}
	/*DECLARA��O COMO ERA FEITA ANTIGAMENTE A DECLARA��O DOS M�TODOS DE TIPOS GEN�RICOS
	Object elemento;
	
	public void setElemento(Object elemento){
		this.elemento = elemento;
		}
	public Object getElemento(){
		return elemento;
	}*/
	
	public static void main(String[] args) {
		
		/*FORMA MAIS ANTIGA DE TRABALHAR COM TIPO GEN�RICO.
		Generico g = new Generico();
		g.setElemento("Lago Parano�");
		g.setElemento(1000);*/
		
		Generico <String> g = new Generico<>();//com a declara��o do tipo os m�todos so podem ser acessados pelo tipo definido
		g.setElemento("Lago Parano�");
		
		Generico <Integer> g2 = new Generico<>();//declarando a nova instancia do tipo INTEGER
		g2.setElemento(123456);	
	}
}