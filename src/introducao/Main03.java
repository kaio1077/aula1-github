package introducao;

/* Aqui estou fazendo apenas uma outra classe para utilizar as variáveis a Main02.java do exercício de área dos triângulos
 */
public class Main03 {
	public double a; // public serve para outras classes acessar estas variáveis
	public double b;
	public double c; 
// Até esta parte foi usado para melhor o programa das variáveis no Main02.java
	
	public double area () { // area (ficam os parâmetros), como não utilizarei nenhum parâmetro acima fica em branco. Double é por causa do "tipo" que ela retorna
		double p = (a + b + c) / 2.0; // Deixando tudo sempre mais genérico para depois fazer as chamadas no programa principal
		double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return result; // Ou para economizar linha e variável: return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
