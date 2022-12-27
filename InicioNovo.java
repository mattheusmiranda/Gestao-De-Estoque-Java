package pxt.api.gestaoestoque;

import java.util.ArrayList;
import java.util.Scanner;

public class InicioNovo {
	public static void main(String[] args) {

		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		Produto posicaoAtualProduto = new Produto();
		// Produto listaDeProdutos = new Produto();

		int posicaoAtual = 0;
		Scanner sc = new Scanner(System.in);

		int respostaMenu = 99;
		while (respostaMenu != 0) {
			System.out.println("----- MENU -----\n 0) SaiSr do programa\n 1) Cadastrar produto\n 2) "
					+ "Exibir detalhes de um produto\n 3) Listar todos os produtos\n 4) Remover algum produto\n -----------------");
			System.out.println("Escolha uma opção: ");
			respostaMenu = sc.nextInt();

			if (respostaMenu == 1) {
				Produto novoProduto = new Produto();

				System.out.println("Qual o nome do produto? ");
				String respNomeProduto = sc.next();
				novoProduto.setNome(respNomeProduto);

				System.out.println("Qual o codigo do produto? ");
				int respCodigoProduto = sc.nextInt();
				novoProduto.setCodigo(respCodigoProduto);

				System.out.println("Qual a data de criação deste produto? " + novoProduto.getDataCriacao());

				System.out.println("Qual é a quantide desse produto?");
				int respQuantidadeProduto = sc.nextInt();
				novoProduto.setQuantidadeEstoque(respQuantidadeProduto);

				listaDeProdutos.add(novoProduto);
				// posicaoAtual = posicaoAtual + 1;

				System.out.println("Produto " + novoProduto.getCodigo() + ": " + novoProduto.getNome()
						+ " foi cadastrado com sucesso");
			}
			if (respostaMenu == 2) {
				System.out.println("qual codigo do produto voce deseja exibir? ");
				int detalheCodigoProduto = sc.nextInt();

				detalhesProdutos(listaDeProdutos.get(listaDeProdutos.indexOf(new Produto(detalheCodigoProduto))));



			}
			if (respostaMenu == 3) {
				for (int m = 0; m < listaDeProdutos.size(); m++) {
					System.out.println("-----Todos os produtos-----");
					if (listaDeProdutos.get(m) != null) {
						detalhesProdutos(listaDeProdutos.get(m));
					}
				}
			}

			if (respostaMenu == 4) {
				System.out.println("Qual o codigo do produto que você quer remover? ");
				int codigoProdutoParaRemover = sc.nextInt();
				System.out.println("Você romoveu esse produto: \n");
				detalhesProdutos(
						listaDeProdutos.remove(listaDeProdutos.indexOf(new Produto(codigoProdutoParaRemover))));
			}
		}
	}

	public static void detalhesProdutos(Produto produto) {
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Quantidade em estoque: " + produto.getQuantidadeEstoque());
		System.out.println("Data de criação: " + produto.getDataCriacao());
		System.out.println("Codigo: " + produto.getCodigo());

	}
}