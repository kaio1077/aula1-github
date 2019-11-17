package introducao;

import java.util.Locale;
import java.util.Scanner;

/* Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto
No slide tem o UML para criar as classes, mas para continuar seguindo como Mains = aulas, substituirei aqui Products por Main06 e program como Main05
 */

// Refazendo usando toString
public class Main05 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Main06 product = new Main06();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.nextLine();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.print("Quantity in Stock: ");
		product.quantity = sc.nextInt();
		
		product.toString(); // Converte objeto para String para em vez de fazer o comando grande abaixo, colocar apenas product
	//	System.out.println(product.name + ", " + product.price + ", " + product.quantity);
		
		System.out.println();
		System.out.println("Product data: " + product); // product.toString() não é necessário porque o Java subentende que o println virá uma toString
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity); // Isso faz a atualização da quantidade dentro do objeto addProducts 
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();

	}

}

//Fiz do jeito que aprendi da aula anterior 8.64, porém na aula 8.66 foi ensinado o toString, tudo que repete pode ser melhorado em uma outra classe
/*
 * Locale.setDefault(Locale.US); Scanner sc = new Scanner(System.in);
 * 
 * Main06 product = new Main06();
 * 
 * 
 * System.out.println("Enter product data: "); System.out.print("Name: ");
 * product.name = sc.nextLine(); System.out.print("Price: "); product.price =
 * sc.nextDouble(); System.out.print("Quantity in Stock: "); product.quantity =
 * sc.nextInt();
 * 
 * 
 * double total = product.totalValueInStock();
 * 
 * System.out.printf("\nProduct data: %s, $ %.2f, %d units, Total: $%.2f \n\n",
 * product.name, product.price, product.quantity, total);
 * 
 * 
 * System.out.print("Enter the numbers of products to be added in your stock: "
 * ); int add = sc.nextInt(); product.addProducts(add); total =
 * product.totalValueInStock();
 * 
 * System.out.printf("\nUpdated data: %s, $%.2f, %d units, Total: $%.2f\n\n",
 * product.name, product.price, product.quantity, total);
 * 
 * System.out.
 * print("Enter the numbers of products to be removed from your stock: "); int
 * remove = sc.nextInt(); product.removeProducts(remove); total =
 * product.totalValueInStock();
 * 
 * System.out.printf("\nUpdated data: %s, $%.2f, %d units, Total: $%.2f",
 * product.name, product.price, product.quantity, total);
 * 
 * sc.close();
 */