package construtores_this_sobrecarga_encapsulamento;

// Udemy seção 9.76 - Sobrecarga. Explicação no main15
import java.util.Locale;
import java.util.Scanner;

public class Main14 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		Por causa do construtor terei que criar variáveis temporárias abaixo

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		// Construtor protege a criação de um produto que não tenha nome, preço, nada! Já iniciar com valores
		Main15 product = new Main15(name, price);
		
		product.toString(); 

		System.out.println();
		System.out.println("Product data: " + product); 

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