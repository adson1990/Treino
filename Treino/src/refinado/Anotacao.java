package refinado;

import java.io.Serializable;

@Cabecalho(//forma de incluir uma anota��o ja tendo criado-a antes
	intituicao = "Universidade XTI",
	projeto = "Sistema de avalia��o",
	dataDeCriacao = "22/06/2015",
	criador = "Adson lucas",
	revisao = 2
	)
@ErrosCorrigidos(erros = {"0001", "0002"})//array de anota��es
@SuppressWarnings("serial")//suprimir os erros que possam ser encontrados
public class Anotacao implements Serializable {
	
	@SuppressWarnings("unused")//suprimir o erro da vari�vel n�o usada
	private int x;
	
	@Deprecated//indica que futuramente o metodo ser� cortado
	public void anotar(){}
	
	@Override//indica que ir� sobrescrever o m�todo da classe pai
	public String toString(){return null;}
}
