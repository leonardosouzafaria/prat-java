package ex1;

import javax.swing.JOptionPane;

public class TopicoUm {
	 
	
	public static void main (String[] args) {
		
		String input = "Digite a primeira palavra";
		
		String primeiraPalavra = JOptionPane.showInputDialog(input);
		
		String segundaPalavra = JOptionPane.showInputDialog(input);
		
		String terceiraPalavra = JOptionPane.showInputDialog(input);
		
		System.out.println(terceiraPalavra + " " + segundaPalavra + " " + primeiraPalavra);
		
	}
}
