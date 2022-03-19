package Desafio3;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Diferenca {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		int qtd=0;
		int k = Integer.parseInt(JOptionPane.showInputDialog("K: "));
		int aux = Integer.parseInt(JOptionPane.showInputDialog("Tamanho do vetor: "));
		
		for( int i=0; i<aux; i++) {
			int val = Integer.parseInt(JOptionPane.showInputDialog("Valor: "));
			arr.add(val);
		}
		
		//Operação
		for(int i=0; i<arr.size(); i++) {
			for( int j=0;j<arr.size(); j++) {
				if(i-j==k) {
					qtd++;
					
				}
			}
		}
		
		System.out.println("Quantidade de valores cuja diferça é iqual a K é: "+qtd);
	}

}
