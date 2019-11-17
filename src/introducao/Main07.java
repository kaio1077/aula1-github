package introducao;

import java.util.Locale;
import java.util.Scanner;

// Versão 1: métodos na própria classe do programa
public class Main07 {

	public static final double PI = 3.14159; //para definir como uma constante (nunca ser mudada), em vez de uma variável, deve-se acrescentar final
// Padrão de nomes para constantes é tudo maiúsculo. Mais de uma palavra separa por underline "_" Ex: NET_SALARY	
	public static void main(String[] args) { // Método principal static
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		sc.close();
		
		double c = circumference (radius);
		double v = volume(radius);
		
		System.out.printf("Cimcurference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", PI);
		
	}

/* Se por um acaso eu apagar os "statics" do métodos abaixo, o programa acusará erro. Porque o compilador não deixará chamar um método não estático dentro...
... de um método estático.
 */
	public static double circumference (double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume (double raio) { // Para mostrar que no método não precisa ser o mesmo nome de variável
		return 4 * PI* raio * raio * raio / 3;
	}
}
