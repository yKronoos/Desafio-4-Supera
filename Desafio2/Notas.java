package Desafio2;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {
		// variaveis notas
		int auxValor;

		float number = Float.parseFloat(JOptionPane.showInputDialog("Nota: "));
		float aux;

		if (number < 0) {
			System.exit(0);
		}
		// Quantidade de notas
		System.out.println("Notas:");
		// nota 100
		auxValor = (int) (number / 100);
		System.out.println(auxValor + " nota(s) de R$100.00");
		aux = number % 100;
		// nota 50
		auxValor = (int) (aux / 50);
		System.out.println(auxValor + " nota(s) de R$50.00");
		aux = aux % 50;
		// nota 20
		auxValor = (int) (aux / 20);
		System.out.println(auxValor + " nota(s) de R$20.00");
		aux = aux % 20;
		// nota 10
		auxValor = (int) (aux / 10);
		System.out.println(auxValor + " nota(s) de R$10.00");
		aux = aux % 10;
		// nota 5
		auxValor = (int) (aux / 5);
		System.out.println(auxValor + " nota(s) de R$5.00");
		aux = aux % 5;
		// nota 2
		auxValor = (int) (aux / 2);
		System.out.println(auxValor + " nota(s) de R$2.00");
		//aux = aux % 2;

		// Quantidade de moedas
		System.out.println("\nMoeda:");
		// nota 1
		auxValor = (int) (aux / 1);
		System.out.println(auxValor + " nota(s) de R$1.00");
		aux = aux % 1;

		// nota 0.50
		auxValor = (int) (aux / 0.5);
		System.out.println(auxValor + " nota(s) de R$0.50");
		aux = (float) (aux % 0.5);
		// nota 0.25
		auxValor = (int) (aux / 0.25);
		System.out.println(auxValor + " nota(s) de R$0.25");
		aux = (float) (aux % 0.25);
		// nota 0.10
		auxValor = (int) (aux / 0.1);
		System.out.println(auxValor + " nota(s) de R$0.10");
		aux = (float) (aux % 0.1);
		// nota 0.05
		auxValor = (int) (aux / 0.05);
		System.out.println(auxValor + " nota(s) de R$0.05");
		aux = (float) (aux % 0.05);
		// nota 0.01
		auxValor = (int) (aux / 0.01);
		System.out.println(auxValor + " nota(s) de R$0.01");

	}

}
