package br.edu.web;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

import br.edu.entidade.CalculoPA;
import br.edu.lista01.Exercicios;

@Named
@ApplicationScoped
public class ProgressaoBean {

	private CalculoPA calculoPa;
	
	
	public void calcularMensagem() {
		
		
		
		//Mensagem Padr�o
		
		FacesMessage message = new FacesMessage();
		
		message.setSummary("O an � : " + this.an);
		message.setSeverity(FacesMessage.SEVERITY_INFO);
		FacesContext.getCurrentInstance().addMessage(null, message);
		
	}
	
}
