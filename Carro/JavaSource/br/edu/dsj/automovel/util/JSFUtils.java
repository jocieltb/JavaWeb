/**
 * 
 */
package br.edu.dsj.automovel.util;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 * @author 1829799
 *
 */
public class JSFUtils {
	/**
	 * Envia uma mensagem de sucesso para tela usando o JSF
	 * @param mensagem
	 */
	public static void enviarMensagemSucesso(String mensagem) {
		
		FacesMessage msg = new FacesMessage();
		
		msg.setSummary(mensagem);
		msg.setSeverity(FacesMessage.SEVERITY_INFO);
		
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

}
