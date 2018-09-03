package ex1;

import javax.swing.JOptionPane; 

public class TopicoDois {
	
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("Insira o número aqui");
		
		int numero = Integer.parseInt(input);
		
		System.out.println(numero);
		
	}
	
}
