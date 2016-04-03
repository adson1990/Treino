package refinado;

import java.io.Serializable;

@Cabecalho(//forma de incluir uma anotação ja tendo criado-a antes
	intituicao = "Universidade XTI",
	projeto = "Sistema de avaliação",
	dataDeCriacao = "22/06/2015",
	criador = "Adson lucas",
	revisao = 2
	)
@ErrosCorrigidos(erros = {"0001", "0002"})//array de anotações
@SuppressWarnings("serial")//suprimir os erros que possam ser encontrados
public class Anotacao implements Serializable {
	
	@SuppressWarnings("unused")//suprimir o erro da variável não usada
	private int x;
	
	@Deprecated//indica que futuramente o metodo será cortado
	public void anotar(){}
	
	@Override//indica que irá sobrescrever o método da classe pai
	public String toString(){return null;}
}
