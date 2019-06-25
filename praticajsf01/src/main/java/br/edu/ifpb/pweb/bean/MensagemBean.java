package br.edu.ifpb.pweb.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="msgBean")
@RequestScoped
public class MensagemBean {
	
	private String mensagem = "Bem vindo ao JSF";

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
