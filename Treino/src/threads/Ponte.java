package threads;

/**
 * Uma <code>Ponte</code> representa o elo
 * entre objetos Produtores e consumidores de informações.
 * Os <i>Produtores</i> utilizam as Pontes para gravar
 * informações e c ompartilhar elas com os <i>Consumidores</i>
 * que lêem esses dados da Ponte para fazer o processamento.
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
	 * será chamado pelas classes Produtoras de dados.
	 * @param valor
	 * @throws InterruptedException
	 */
	
	public void set(int valor) throws InterruptedException;
	
	
	/**
	 * Recupera a informação armazenada na Ponte.
	 * Esse método será chamado pela consumidora de dados
	 * @return
	 * @throws InterruptedException
	 */
	
	public int get() throws InterruptedException;
}
