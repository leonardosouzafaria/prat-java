
public class Gerente extends Funcionario {
	
	private String regiao;
	private int quantidadeFuncionarios;
	
	//Construtor do gerente
	public Gerente(String codigo, String nome, double salario, String regiao, int quantidadeFuncionarios) {
			super(codigo, nome, salario);
			this.regiao = regiao;
			this.quantidadeFuncionarios = quantidadeFuncionarios;
		}
	
	public String getRegiao() {
		return regiao;
	}
	
	public int getQuantidadeFuncionarios() {
		return quantidadeFuncionarios;
	}
	
}
