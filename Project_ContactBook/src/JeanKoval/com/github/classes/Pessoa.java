package JeanKoval.com.github.classes;

public class Pessoa extends Agenda {
	private String nome;
	private String sobrenome;
	private String empresa;
	
	public Pessoa(String nome, String sobrenome, String empresa) {
		super();
		this.nome = nome;

	}

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
}
