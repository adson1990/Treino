package refinado;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflexao {

	public static void main(String[] args) throws Exception {
		
		//ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException
		//SecurityException, IllegalArgumentException, InvocationTargetException
		String nome = "poo.Conta";
		Class classe = Class.forName(nome);
		System.out.println(classe.getSimpleName());
		
		Field[] campo = classe.getFields();//recupera os atributos de uma classe
		
		for (Field field : campo) {
			System.out.println(field);
		}
		
		Method[] method = classe.getDeclaredMethods();//recupera os métodos de uma classe
		for (Method method2 : method) {
			System.out.println(method2.getName());
		}
		
		Constructor[] c = classe.getConstructors();//recupera os construtores da sua classe
		for (Constructor constructor : c) {
			System.out.println(constructor);
		}
		
		Object o = classe.newInstance();//criando objeto do tipo da conta
		@SuppressWarnings("unchecked")
		Method mt = classe.getMethod("depositarValor", double.class);//criando objeto do tipo do método que se encontra na classe conta
		mt.invoke(o, 120);//chamando o método
		
		Constructor c1 = classe.getConstructor(String.class, double.class);//criando um tipo construtor do contrutor da classe
		Object o2 = c1.newInstance("Adson", 10_000.00);//criando objeto de do construtor da classe
		Method me = classe.getMethod("visualizarSaldo");//criando objeto do método da classe
		me.invoke(o2);//invocando o método
	}

}