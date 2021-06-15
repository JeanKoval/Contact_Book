package JeanKoval.com.github.classes;

import java.util.ArrayList;

public class Agenda {
	protected Pessoa pessoa;
	protected String descricao;
	protected ArrayList<Contato> contato;
	protected ArrayList<Endereco> endereco;
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public ArrayList<Contato> getContato() {
		return contato;
	}
	public void setContato(ArrayList<Contato> contato) {
		this.contato = contato;
	}
	public ArrayList<Endereco> getEndereco() {
		return endereco;
	}
	public void setEndereco(ArrayList<Endereco> endereco) {
		this.endereco = endereco;
	}	
}
