package threads;

/**
 * Uma <code>Ponte</code> representa o elo
 * entre objetos Produtores e consumidores de informa��es.
 * Os <i>Produtores</i> utilizam as Pontes para gravar
 * informa��es e c ompartilhar elas com os <i>Consumidores</i>
 * que l�em esses dados da Ponte para fazer o processamento.
 * 
 *@author Adson
 *@version 1.3
 *@since 1.0
 *
 *@see PonteNaoSinc
 *@see PonteSinc
 */

public interface Ponte {

	/**
	 * Armazena o valor informado na <i>Ponte</i>. Geralmente
	 * ser� chamado pelas classes Produtoras de dados.
	 * @param valor
	 * @throws InterruptedException
	 */
	
	public void set(int valor) throws InterruptedException;
	
	
	/**
	 * Recupera a informa��o armazenada na Ponte.
	 * Esse m�todo ser� chamado pela consumidora de dados
	 * @return
	 * @throws InterruptedException
	 */
	
	public int get() throws InterruptedException;
}
