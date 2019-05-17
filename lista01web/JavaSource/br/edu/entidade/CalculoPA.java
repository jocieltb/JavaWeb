/**
 * 
 */
package br.edu.entidade;

import javax.validation.constraints.NotNull;

/**
 * @author 1829799
 *
 */
public class CalculoPA {
	
	@NotNull
	private Double a1;
	@NotNull
	private Integer n;
	@NotNull
	private Double r;
	
	public CalculoPA() {
		
	}
	
	public void calcularNEsimoTermo() {
		this.an = this.a1 + (this.n - 1) * this.r;
		
	}
	
	public Double getR() {
		return r;
	}

	public void setR(Double r) {
		this.r = r;
	}

	private Double an;

	public Double getA1() {
		return a1;
	}

	public void setA1(Double a1) {
		this.a1 = a1;
	}

	public Integer getN() {
		return n;
	}

	public void setN(Integer n) {
		this.n = n;
	}

}
