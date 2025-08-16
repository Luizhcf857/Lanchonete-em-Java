package menu;

import java.util.Scanner;

public class Cardapio {

	public static void main(String[] args) {
		
		/*Variavel que ira receber os dados do usuario*/
		Scanner entrada = new Scanner(System.in);
		
		/*Aqui estão as variáveis, os nomes e valor dos produtos, e soma, opção para selcionar o produto.
		 nome do cliente, e o nome do item*/
		double soma = 0;
		int opcao;
		String nomeLanche1 = "X - Salada";
		String nomeLanche2 = "X - tudo";
		String nomeLanche3 = "Coxinha";
		String nomeLanche4 = "Pão Pizza";
		String nomeLanche5 = "Coxinburguer";
		String nomeBebida1 = "Refigerante";
		String nomeBebida2 = "Suco";
		String nomeBebida3 = "Água";
		double valorLanche1 = 12.00;
		double valorLanche2 = 20.00;
		double valorLanche3 = 5.00;
		double valorLanche4 = 10.00;
		double valorLanche5 = 10.00;
		double valorBebida1 = 5.00;
		double valorBebida2 = 12.00;
		double valorBebida3 = 4.00;
		String nome;
		String nomePedido = "";
		
			
		/*Aqui será o cardápio com variáveis ja invocada dentro*/
			System.out.println("=== LANCHONETE SABOR E ALEGRIA ===");
			System.out.println("             CARDAPIO             ");
			System.out.println("==============COMIDAS=============");
			System.out.printf("1- "+ nomeLanche1+ " %.2f R$\n", valorLanche1);
			System.out.printf("2- "+ nomeLanche2+ " %.2f R$\n", valorLanche2);
			System.out.printf("3- "+ nomeLanche3+ " %.2f R$\n", valorLanche3);
			System.out.printf("4- "+ nomeLanche4 + " %.2f R$\n", valorLanche4);
			System.out.printf("5- "+ nomeLanche5 + " %.2f R$\n", valorLanche5);
			System.out.println("==============BEBIDAS=============");
			System.out.printf("6- "+ nomeBebida1 + " %.2f R$\n", valorBebida1);
			System.out.printf("7- "+ nomeBebida2 + " %.2f R$\n", valorBebida2);
			System.out.printf("8- "+ nomeBebida3 + " %.2f R$\n", valorBebida3);
			System.out.println("==================================");
			System.out.println("Digite um número para selecionar o item correspondente: ");
			opcao = entrada.nextInt();
			entrada.nextLine();
			
			
		
			
			/*Switch para cada opção para realizar os cálculos e armazenar o nome do produto*/
			switch(opcao) {
			
			case 1:
				nomePedido = nomeLanche1;
				soma += valorLanche1;
				break;
			
			case 2:
				nomePedido = nomeLanche2;
				soma += valorLanche2;
				break;
			
			case 3:
				nomePedido = nomeLanche3;
				soma += valorLanche3;
				break;
				
			case 4:
				nomePedido = nomeLanche4;
				soma += valorLanche4;
				break;
				
			case 5:
				nomePedido = nomeLanche5;
				soma += valorLanche5;
				break;
				
			case 6:
				nomePedido = nomeBebida1;
				soma += valorBebida1;
				break;
				
			case 7:
				nomePedido = nomeBebida2;
				soma += valorBebida2;
				break;
				
			case 8:
				nomePedido = nomeBebida3;
				soma += valorBebida3;
				break;
				
			default:
				System.out.println("\nOpção inválida!\n");
				entrada.close();
				return;
			
			}
			
		
		/*Essa parte ira solicitar o nome do cliente*/
		System.out.println("Digite o seu nome: ");
		nome = entrada.nextLine();
		
		/*Aqui será a saída dos itens selecionados, valores e o nome do cliente*/
		System.out.println("========================");
		System.out.println("    RESUMO DO PEDIDO    ");
		System.out.println("========================");
		System.out.println("Nome do cliente: "+ nome);
		System.out.println("Item: "+ nomePedido);
		System.out.printf("Valor do item: %.2f R$", soma);
		
		entrada.close();

	}

}