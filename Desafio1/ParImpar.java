package Desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

public class ParImpar {

	public static void main(String[] args) {
		List<Integer> par = new ArrayList<Integer>();
		List<Integer> impar = new ArrayList<Integer>();
		
		int aux = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de entradas: "));
		
		if(aux<0) {
			System.exit(0);
		}
		
		for(int i=0; i<aux; i++) {
			int value = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
			
			if(value<0) {
				JOptionPane.showMessageDialog(null, "Menssagem não pode ser negativa");
				System.exit(0);
			}
			
			if(value%2==0) {
				par.add(value);
			}
			else {
				impar.add(value);
			}
		}
		
		//Ordenando
		Collections.sort(par);
		Collections.sort(impar, Collections.reverseOrder());

		for(int i=0; i<par.size();i++) {
			System.out.println(par.get(i));
		}
		for(int i=0; i<impar.size();i++) {
			System.out.println(impar.get(i));
		}
	}

}
