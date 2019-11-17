package construtores_this_sobrecarga_encapsulamento;
//Udemy seção 9.74
public class Main13 {
	public String name;
	public double price;
	public int quantity;

	// Construtor com argumentos
	public Main13 (String name, double price, int quantity) { // Por convenção usa o mesmo nome de variável dentro do parâmetro.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // This referencia à variável fora deste método, ou seja, da classe principal,
									// quando tem nomes iguais usa o this para discernir.
	}
	
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}

	public String toString() { 
		return name + ", $ " + String.format("%.2f", price) + 
				", " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock()); 
	}

}
