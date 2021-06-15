package JeanKoval.com.github.classes;

import java.util.ArrayList;

public class Contato extends Agenda {
	private String celular;
	private String telefone;
	private String email;
	
	public Contato() {
		super();
	}
	
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
