package construtores_this_sobrecarga_encapsulamento;

//Udemy seção 9.77 - Encapsulamento, private protege suas variáveis
public class Main17 {
	private String name;
	private double price;
	private int quantity;

	// Construtor com argumentos
	public Main17(String name, double price, int quantity) { // Por convenção usa o mesmo nome de variável dentro do
																// parâmetro.
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

// Exemplo de sobrecarga. Também é um construtor
/*	public Main17(String name, double price) { // Sobrecarga
		this.name = name;
		this.price = price; */ // desabilitar p /* */ da sobrecarga
//		quantity = 0; // Opcional, porque o Java por padrão inicializa 0 e a necessidade do this também é opcinal
//		porque não tem parâmetro
//	}
// Construtor de Sobrecarga padrão. Se eu quiser criar um construtor padrão é só criar a classe abaixo.
	public Main17 () {
	}
// Por convenção get e set são colocados depois dos construtores	
	public String getName () {
		return name;
	}
// Por convenção get e set são colocados depois dos construtores
	public void setName (String name) {
		this.name = name;
	}
	
	public double getPrice () {
		return price;
	}
	
	public void setPrice (double price) {
		this.price = price;
	}

//  Para proteger meu negócio, criarei apenas o get porque não quero ninguém alterando a quantidade sem dizer que removeu... 
//  ...ou adicionou, ou seja, usando os métodos addProducts e removeProducts.
	public int getQuantity () {
		return quantity;
	}
	
// Não criarei o setQuantity para proteger o meu objeto produto de alterações inconsistentes na quantidade dele
	
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
