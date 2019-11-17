package introducao;
// Versão 2: Classe auxiliar do Main08.java
public class Main09 {
	public final double PI = 3.14159;
	
	public double circumference (double radius) { // Agora os membros não são mais estáticos, então eu preciso instanciar um objeto
		return 2 * PI * radius;
	}
	
	public double volume (double raio) { // Agora os membros não são mais estáticos, então eu preciso instanciar um objeto
		return 4 * PI* raio * raio * raio / 3;
	}
}
