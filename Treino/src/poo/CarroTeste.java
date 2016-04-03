package poo;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro();
		
		ferrari.modelo = "Ferrari Enzo";
		ferrari.velocidadeMaxima = 349;
		ferrari.segundos = 3.2;
		Motor v12 = new Motor();
		v12.tipo = "V12";
		v12.potencia = 660;
		
		ferrari.motor = v12;//adicionando o motor criado ao carro
		
		System.out.println(ferrari.modelo);
		System.out.println(ferrari.velocidadeMaxima + " Km/h");
		System.out.println("de 0/100 em " + ferrari.segundos + " segundos");
		System.out.println("Motor " + ferrari.motor.tipo);
		System.out.println("Potencia " + ferrari.motor.potencia + "cv\n");
		
		Carro koenigsegg = new Carro("Koenigsegg CCXR", 430, 3.1);
		Motor v8 = new Motor("V8", 1018, 2032);
		koenigsegg.motor = v8;
		
		System.out.println(koenigsegg.modelo);
		System.out.println(koenigsegg.velocidadeMaxima + " Km/h");
		System.out.println("de 0/100 em " + koenigsegg.segundos + " segundos");
		System.out.println("Motor " + koenigsegg.motor.tipo);
		System.out.println("Potencia " + koenigsegg.motor.potencia + "cv");
		System.out.println("RPM " + koenigsegg.motor.rpm + "\n");
		
		Carro bugatti = new Carro("Bugatti Veyron", 430, 2.2, new Motor("W16", 1200, 2480, 68));
		
		System.out.println(bugatti.modelo);
		System.out.println(bugatti.velocidadeMaxima + " Km/s");
		System.out.println("de 0/100 em " + bugatti.segundos + " segundos");
		System.out.println("Motor " + bugatti.motor.tipo);
		System.out.println("Potencia " + bugatti.motor.potencia + "cv");
		System.out.println("RPM " + bugatti.motor.rpm);
		System.out.println("Capacidade do tanque " + bugatti.motor.tanque + "L\n");
		
		Motor v10 = new Motor("V10", 520, 4800, 60);//criando objeto motor
		Carro lamborghini = new Carro("Lamborghini Gallardo", 318, 4.2);//criando o objeto Carro
		lamborghini.motor = v10;//atribuindo o motor após criar o objeto carro e motor separadamente
		
		System.out.println(lamborghini.modelo);
		System.out.println(lamborghini.velocidadeMaxima + " Km/s");
		System.out.println("de 0/100 em " + lamborghini.segundos + " segundos");
		System.out.println("Motor " + lamborghini.motor.tipo);
		System.out.println("Potencia " + lamborghini.motor.potencia + "cv");
		System.out.println("RPM " + lamborghini.motor.rpm);
		System.out.println("Capacidade do tanque " + lamborghini.motor.tanque + "L\n");
		
		Carro slk = new Carro("Mercedes SLK", 285, 4.0, new Motor("V9", 204, 2560, 48));//atribuindo o motor diretamente na criação do objeto carro
		
		System.out.println(slk.modelo);
		System.out.println(slk.velocidadeMaxima + " Km/s");
		System.out.println("de 0/100 em " + slk.segundos + " segundos");
		System.out.println("Motor " + slk.motor.tipo);
		System.out.println("Potencia " + slk.motor.potencia + "cv");
		System.out.println("RPM " + slk.motor.rpm);
		System.out.println("Capacidade do tanque " + slk.motor.tanque + "L\n");
		

	}

}