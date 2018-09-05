
public class Aluno {
	
	private String nome;
	private int idade;
	private double peso;
	private boolean formando;
	private char sexo;
	
	//Metodo construtor
	public Aluno(String nome, int idade, double peso, char sexo) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.sexo = sexo;
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

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public boolean getFormando() {
		return formando;
	}

	public void setFormando(boolean formando) {
		this.formando = formando;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
	
}
