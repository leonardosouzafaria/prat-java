
public class Funcionario {

	private String codigo;
	private String nome;
	private double salario;
	
	public Funcionario(String codigo, String nome, double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.salario = salario;
	}
	
	
	
	public String getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}

}
