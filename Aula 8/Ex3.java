package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Ex3 {
	public static void main (String args[]) {
		Scanner leia = new Scanner (System.in);
		int opcao;
		/*	Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
		trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
		programa deverá atender as seguintes funcionalidades:
		Armazenar dados da List
		Remover dados da list;
		Atualizar dados da list.
		Apresentar todos os dados da list.
	*/
		
		Collection<String> produtos = new ArrayList();
		produtos.add("Camiseta");
		produtos.add("Vestido");
		produtos.add("Saia");
		produtos.add("Shorts");
		produtos.add("Tênis");
		produtos.add("Bolsa");
		
		
	do {
	System.out.println("\nEscolha a opção desejada: \n1- Adicionar produtos\n2- Remover produtos\n3- Atualizar dados\n4- Ler lista");
	opcao = leia.nextInt();
	
	switch (opcao) {
	case 1:
		System.out.printf("\nDigite o produto que deseja adicionar: ");
		String produto = leia.next();
		produtos.add(produto);
		break;
		
	case 2:
		System.out.println("\nDigite o produto que deseja remover do estoque: ");
		String produtorem = leia.next();
		produtos.remove(produtorem);
		break;
		
	case 3:
		System.out.println("\nDigite o produto que deseja atualizar: "); 
		String verifica = leia.next();
		
		System.out.println("\nDigite o nome do produto que entrará no lugar de "+verifica+": ");
		String novo = leia.next();
		
		if (produtos.contains(verifica)){
		produtos.remove(verifica);
		
		produtos.add(novo);
		} 
		System.out.println("A nova lista é: \n "+produtos); 
		
		break;
	case 4:
		System.out.println("\nLista de produtos do estoque: \n"+produtos);
		break;
	default:
	System.out.println("\nVocê inseriu um valor incorreto");
	}
	
	}while (opcao != 0);
}
}
