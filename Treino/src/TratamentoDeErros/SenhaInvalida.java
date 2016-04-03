package TratamentoDeErros;

public class SenhaInvalida extends Exception {
	//criando classe com construtor para testar senha
		public SenhaInvalida(String mensagem){
			super(mensagem);
		}

}
