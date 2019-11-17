package construtores_this_sobrecarga_encapsulamento;

// Udemy seção 9.77 - Encapsulamento. Explicação antes da função nova abaixo e no main17
import java.util.Locale;
import java.util.Scanner;

public class Main16 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.print("Quantity: ");
		int quantity = sc.nextInt();
		// Construtor protege a criação de um produto que não tenha nome, preço, nada! Já iniciar com valores
		Main17 product = new Main17(name, price, quantity);
		
//		Se eu quiser atribuir um valor a alguma variável terá erro, dizendo que o atributo name não é acessível
//		Porque eu deixei private minhas variáveis
//		product.name = "Computer"; // Esta forma não funcionará mais.
		
//		Abaixo dará um erro também dizendo que product.name não é acessível, para conseguir pegar o nome preciso do get
//		System.out.println("Update name: " + product.name);
		
//		Depois de criar setName é possível conseguir as variáveis privates
		product.setName("Computador");
		// Depois de criar getName é possível retornar o método
		System.out.println("Update name: " + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice() );
		
		product.toString(); 

		System.out.println();
		System.out.println("Product data: " + product); 

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		quantity = sc.nextInt();
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