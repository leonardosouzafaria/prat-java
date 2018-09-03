import java.util.ArrayList;

public class Empresa {
	
	private String nome;
	private String endereco;
	private ArrayList<Funcionario> funcionarios;
	private ArrayList<Funcionario> gerente;
	
	public Empresa(String nome, String endereco, ArrayList funcionario, ArrayList gerentes ) {
		this.nome = nome;
		this.endereco = endereco;
		this.funcionarios = funcionario;
		this.gerente = gerentes;
		
	}
	
	
	
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	private void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public ArrayList getFuncionarios() {
		return funcionarios;
	}
	
	public void setFuncionarios(ArrayList funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	public ArrayList<Funcionario> getGerente() {
		return gerente;
	}
	
	public void setGerente(ArrayList<Funcionario> gerente) {
		this.gerente = gerente;
	}
	
	

}
