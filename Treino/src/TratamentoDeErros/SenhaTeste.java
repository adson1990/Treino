package TratamentoDeErros;

public class SenhaTeste {
	//classe de teste para verificar se senha digitada foi correta

	static void autenticar(String senha) 
			throws SenhaInvalida {
		if ("123".equals(senha)){//verifica se a senha armazenada ex:123 � igual a senha passada por par�metro
			System.out.println("Autenticado");//autentica entrada no sistema
		} else {
			throw new SenhaInvalida("Senha Incorreta.");
		}
	}
	public static void main(String[] args) {
		
		try{//m�todo try/catch
			autenticar("12");//chamando m�todo global criado
		}catch (SenhaInvalida s){//capturando erro
			s.printStackTrace();
			System.out.println(s.getMessage());
		}
		finally{}
	}
}
