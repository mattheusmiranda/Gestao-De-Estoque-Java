package pxt.api.gestaoestoque;

import java.util.ArrayList;
import java.util.Scanner;

public class desafio {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas? ");
		int qtdeNotas = entrada.nextInt();

		ArrayList<Integer> quantidadeNotas = new ArrayList<>();
		quantidadeNotas.add(qtdeNotas);

		ArrayList<Integer> valNotas = new ArrayList<>();

		for (int i = 0; i < qtdeNotas; i++) {
			System.out.println("Informe a nota: " + (i + 1) + ": ");
			int recebeNotas = entrada.nextInt();
			valNotas.add(recebeNotas);
		}

		int total = 0;
		for (int nota : valNotas) {
			total += nota;
		}

		int media = total / qtdeNotas;
		System.out.println("A media é: " + media);
	}
}
