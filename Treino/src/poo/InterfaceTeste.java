package poo;

public class InterfaceTeste {

	public static void area(AreaCalculavel a){
		System.out.println(a.calculaArea());
		}
	
	public static void volume(VolumeCalculavel v){
		System.out.println(v.calculaVolume());
	}
	
	public static void calculaDobroArea(AreaCalculavel a2){
		System.out.println(a2.calculaDobroArea());
	}
	
	public static void calculaVolumeDobrado(VolumeCalculavel v2){
		System.out.println(v2.calculaVolumeDobrado());
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Quadrado q = new Quadrado(2);
		Cubo c = new Cubo(4);
		
		//System.out.println(q.calcularArea(q.lado));
		
		area(new Quadrado(3));//area criando um cubo novo
		volume(new Cubo(2));//volume criando um cubo novo
		area(new Cubo(2));//area criando  um cubo novo
		area (q);//area do quadrado criado
		volume(c);//volume do cubo criado
		area(c);//area do cubo criado
		calculaDobroArea(c);
		calculaDobroArea(q);
		calculaVolumeDobrado(c);

	}

}