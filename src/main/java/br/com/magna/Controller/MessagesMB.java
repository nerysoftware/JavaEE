package br.com.magna.Controller;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

@Named("msg")
@ViewScoped
public class MessagesMB implements Serializable{

	private static final long serialVersionUID = 1L;
	
	public void salvar() {
		
		FacesMessage message = new FacesMessage("Mensagem de Sucesso");
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	public void erro() {
		
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,"Mensagem de erro", null);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}

}
