package TratamentoDeErros;

public class SenhaTeste {
	//classe de teste para verificar se senha digitada foi correta

	static void autenticar(String senha) 
			throws SenhaInvalida {
		if ("123".equals(senha)){//verifica se a senha armazenada ex:123 é igual a senha passada por parâmetro
			System.out.println("Autenticado");//autentica entrada no sistema
		} else {
			throw new SenhaInvalida("Senha Incorreta.");
		}
	}
	public static void main(String[] args) {
		
		try{//método try/catch
			autenticar("12");//chamando método global criado
		}catch (SenhaInvalida s){//capturando erro
			s.printStackTrace();
			System.out.println(s.getMessage());
		}
		finally{}
	}
}
