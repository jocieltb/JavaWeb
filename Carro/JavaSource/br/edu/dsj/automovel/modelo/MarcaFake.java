/**
 * 
 */
package br.edu.dsj.automovel.modelo;

import java.util.ArrayList;

import br.edu.dsj.automovel.entidade.Marca;

/**
 * Classe para teste de persistência
 * @author 1829799
 *
 */
public class MarcaFake {
	
	private static ArrayList<Marca> marcasCadastradas = new ArrayList<Marca>();
	
	public static void cadastrarMarca(Marca marca) {
		
		marcasCadastradas.add(marca);
		
	}

}
