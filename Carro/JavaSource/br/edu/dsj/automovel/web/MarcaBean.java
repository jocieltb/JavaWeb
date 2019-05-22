/**
 * 
 */
package br.edu.dsj.automovel.web;

import java.util.ArrayList;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.edu.dsj.automovel.entidade.Marca;
import br.edu.dsj.automovel.modelo.MarcaFake;
import br.edu.dsj.automovel.util.JSFUtils;

/**
 * @author 1829799
 *
 */
@Named
@RequestScoped
public class MarcaBean {
	
	private Marca marca;
	
	public MarcaBean() {
		this.marca = new Marca();
	}
	
	public void salvarMarca() {
		MarcaFake.cadastrarMarca(marca);
		JSFUtils.enviarMensagemSucesso("Marca cadastrado com sucesso...");
	}
	
	public ArrayList<Marca> listarMarcas() {
		return MarcaFake.listar();
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

}
