package objetos;

public class Pessoa {

	private int ID;
	private String nome;
	private int idade;
	private String endere�o;
	
	
	
	public Pessoa(int iD, String nome, int idade, String endere�o) {
		super();
		ID = iD;
		this.nome = nome;
		this.idade = idade;
		this.endere�o = endere�o;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getEndere�o() {
		return endere�o;
	}


	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}
	
	
	
}
