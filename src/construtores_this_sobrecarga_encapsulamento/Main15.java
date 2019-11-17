package construtores_this_sobrecarga_encapsulamento;

//Udemy seção 9.76 - Sobrecarga é disponibilizar mais de uma versão da mesma operação. A diferença é a lista de parâmetros
public class Main15 {
	public String name;
	public double price;
	public int quantity;

	// Construtor com argumentos
	public Main15(String name, double price, int quantity) { // Por convenção usa o mesmo nome de variável dentro do
																// parâmetro.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

// Exemplo de sobrecarga
	public Main15(String name, double price) { // Sobrecarga
		this.name = name;
		this.price = price;
//		quantity = 0; // Opcional, porque o Java por padrão inicializa 0 e a necessidade do this também é opcinal
//		porque não tem parâmetro
	}
// Sobrecarga padrão. Se eu quiser criar um construtor padrão é só criar a classe abaixo.
	public Main15 () {
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // This referencia à variável fora deste método, ou seja, da classe principal,
									// quando tem nomes iguais usa o this para discernir.
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $"
				+ String.format("%.2f", totalValueInStock());
	}

}
