package introducao;

public class Main06 {
	
	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock () {
		return price * quantity;
	}
	
	public void addProducts (int quantity) {
		this.quantity += quantity; //This referencia à variável fora deste método, ou seja, da classe principal, quando tem nomes iguais usa o this para discernir.
	}
	
	public String toString() { // Sobrepondo a operação String padrão do Object
		return name + 
		", $ " 
		+ String.format("%.2f", price) + // Quando quiser formatar a variável usar o comando String.format( , )
		", " 
		+ quantity + 
		" units, Total: $" 
		+ String.format("%.2f", totalValueInStock()); // Quando quiser formatar a variável usar o comando String.format( , )
	}
	public void removeProducts (int quantity) {
		this.quantity -= quantity;
	}

}
