import javax.swing.JOptionPane;

public class TesteAluno {
	
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome");
		int idade  = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		char sexo = JOptionPane.showInputDialog("Sexo").charAt(0);
			
		
		Aluno aluno = new Aluno(nome, idade, peso, sexo);
		
		String msg = "Nome:" + aluno.getNome() + "\nIdade: "
				+ aluno.getIdade() + " anos" + "\nPeso: " + aluno.getPeso()
				+ "kg";
		
		if(aluno.getFormando()) {
			msg += "\nFormando: sim ";
		} else {
			msg += "\nFormando: não";
		}
		
		if(aluno.getSexo() == 'M') {
			msg+= "\nsexo: masculino";
		} else {
			msg+= "\nsexo: feminino";
		}
		
		JOptionPane.showMessageDialog(null, msg);
		
		idade  = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
		
		boolean formando = Boolean.parseBoolean(JOptionPane.showInputDialog("E' formando?true/false"));
		
		aluno.setIdade(idade);
		aluno.setPeso(peso);
		aluno.setFormando(formando);
		
		
		
		
		
	}

}
