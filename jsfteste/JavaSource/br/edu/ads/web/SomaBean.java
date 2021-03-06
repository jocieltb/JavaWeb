package br.edu.ads.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Classe para realizar a soma de 2 n�meros pela web.
 * @author 1829799
 *
 */
@ManagedBean
@RequestScoped
public class SomaBean {
	
	private Integer valor1;
	
	private Integer valor2;
	
	private Integer soma;

	public Integer getValor1() {
		return valor1;
	}

	public void setValor1(Integer valor1) {
		this.valor1 = valor1;
	}

	public Integer getValor2() {
		return valor2;
	}

	public void setValor2(Integer valor2) {
		this.valor2 = valor2;
	}
	
	public void somar() {
		this.setSoma(this.valor1 + this.valor2); 
		
	}

	public Integer getSoma() {
		return soma;
	}

	public void setSoma(Integer soma) {
		this.soma = soma;
	}
	

}
