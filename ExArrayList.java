package pxt.api.gestaoestoque;

import java.util.ArrayList;
import java.util.Scanner;

public class ExArrayList {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<String> cpfs = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = sc.next();

		System.out.println("Digite seu CPF: ");
		String cpf = sc.next();

		cpfs.add("785.125.741-45");
		cpfs.add("632.777.414-85");
		cpfs.add("632.858.564-74");

		nomes.add("Matheus");
		nomes.add("Pedro");
		nomes.add("Brenda");
		nomes.add("Marianna");
		nomes.add("Rayssa");
		nomes.add("Julia");

		if (nomes.contains(nome)) {
			System.out.println("Olá " + nome);
		} else {
			System.out.println("Não te achei");
		}
		
		if(cpfs.contains(cpf)) {
			System.out.println("CPF cadastrado no sistema");
		}
		
	}
}
