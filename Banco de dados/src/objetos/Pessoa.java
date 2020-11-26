package objetos;

public class Pessoa {

	private int ID;
	private String nome;
	private int idade;
	private String endereco;
	
	
	
	public Pessoa(int iD, String nome, int idade, String enderešo) {
		super();
		ID = iD;
		this.nome = nome;
		this.idade = idade;
		this.endereco = enderešo;
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


	public String getEnderešo() {
		return endereco;
	}


	public void setEnderešo(String enderešo) {
		this.endereco = enderešo;
	}
	
	
	
}
