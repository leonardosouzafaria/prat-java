package ex1;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TopicoTres {

	public static void main(String[] args) {
		
		String dia = JOptionPane.showInputDialog("Insira o dia");
		
		String mes = JOptionPane.showInputDialog("Insira o mês");
		
		String ano = JOptionPane.showInputDialog("Insira o ano");
		
		SimpleDateFormat formato =  new SimpleDateFormat("dd/MM/yyyy");
		
		Date data = new Date();
		
		try {
			data = formato.parse(dia+ "/" + mes + "/" + ano);
		} catch(Exception exception) {
			exception.printStackTrace();
		}
		
		System.out.println(formato.format(data));
		
	}
}
