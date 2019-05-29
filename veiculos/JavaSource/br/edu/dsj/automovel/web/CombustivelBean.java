/**
 * 
 */
package br.edu.dsj.automovel.web;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.edu.dsj.automovel.enumerado.Combustivel;

/**
 * @author 1829799
 *
 */
@Named
@ApplicationScoped
public class CombustivelBean {
	
	public Combustivel[] listarCombustivel() {
		return Combustivel.values();
	}
}
