package pxt.api.gestaoestoque;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 1) Crie uma classe chamada Produto com os seguintes atributos: codigo, nome,
 * quantidadeEstoque, dataCriacao // feito
 * 
 * 2) Na classe do método main, crie duas variáveis globais: - um array do tipo
 * Produto com o tamanho de 3 // feito - uma variável inteira chamada
 * posicaoAtualProduto (que será usada para controlar em qual posição foi salvo
 * o último produto) // feito
 * 
 * 3) No método main, inicie o programa exibindo um menu com as seguintes
 * escolhas (não se preocupe com todas as opções por agora, vamos implementar
 * uma de cada vez): #----- MENU -----# 0) Sair do programa 1) Cadastrar produto
 * 2) Exibir detalhes de um produto 3) Listar todos os produtos
 * #-----------------# // feito
 * 
 * 4) SAIR DO PROGRAMA: No while de iteração do menu, crie um IF para entrar
 * quando o usuário escolhar a opção 0, e dentro desse IF saia do programa (use:
 * System.exit(0)). // feito
 * 
 * 5) CADASTRAR PRODUTO: Crie outro IF para entrar quando o usuário escolhar a
 * opção 1. Dentro desse IF, instancie um novo Produto e pergunte para o usuário
 * todos os atributos necessários para preencher o objeto de produto. O atributo
 * dataCriacao deve ser setado automaticamente com a data atual do sistema. Após
 * o usuário informar os dados do produto, coloque esse novo objeto dentro do
 * nosso array de produtos que foi criado globalmente (ATENÇÃO: nessa hora use a
 * variavel posicaoAtualProduto para saber em qual posição vc deve inserir do
 * array)
 */

public class Inicio {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Produto listaDeProdutos[] = new Produto[4];
		Produto posicaoAtualProduto = new Produto();
		
		ArrayList<Integer> listaDeProdutos2 = new ArrayList<>();

		int posicaoAtual = 0;
		Scanner sc = new Scanner(System.in);

		int respostaMenu = 99;
		while (respostaMenu != 0) {
			System.out.println("----- MENU -----\n 0) SaiSr do programa\n 1) Cadastrar produto\n 2) "
					+ "Exibir detalhes de um produto\n 3) Listar todos os produtos\n -----------------");
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

				listaDeProdutos[posicaoAtual] = novoProduto;
				posicaoAtual = posicaoAtual + 1;

				System.out.println("Produto " + novoProduto.getCodigo() + ": " + novoProduto.getNome()
						+ " foi cadastrado com sucesso");
			}
			if (respostaMenu == 2) {
				System.out.println("qual codigo do produto voce deseja exibir? ");
				int detalheCodigoProduto = sc.nextInt();

				for (int i = 0; i < listaDeProdutos.length; i++) {
					if (detalheCodigoProduto == listaDeProdutos[i].getCodigo()) {
						detalhesProdutos(listaDeProdutos[i]);
						break;
					}
				}
			}
			if (respostaMenu == 3) {
				System.out.println("-----Todos os produtos-----");

				for (int m = 0; m < listaDeProdutos.length; m++) {

					if (listaDeProdutos[m] != null) {
						// System.out.println(listaDeProdutos[m].getNome());
						detalhesProdutos(listaDeProdutos[m]);

					}
				}
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