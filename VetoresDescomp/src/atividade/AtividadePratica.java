package atividade;

import java.util.Scanner;

public class AtividadePratica {

	public static void main(String[] args) {
		
		//Scanner para receber os dados do usuário
		Scanner sc = new Scanner(System.in);
		
		double [] matriz = new double[50];
		
		// Recebendo 50 números do usuário
		
		for(int i = 0; i <50; i++) {
			System.out.println("Digite um número:");
			double numero = sc.nextDouble();
			matriz[i] = numero;
		}
		
		// Media dos numeros
		double soma = 0;
		for(double numero : matriz) {
			soma += numero;
		}
		double media = soma / 5;
	
	
	// Imprimindo a matriz
	for(double numero : matriz) {
		System.out.println(numero);
	}
	System.out.println("Média dos números da matriz: " + media);	
	sc.close();
	}
}
