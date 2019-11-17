package introducao;
// // Versão 3: Classe auxiliar do Main10.java
public class Main11 {
	
	public static final double PI = 3.14159;
	
	public static double circumference (double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume (double radius) {
		return 4 * PI * Math.pow(radius, 3); // ou radius * radius * radius
	}
}
