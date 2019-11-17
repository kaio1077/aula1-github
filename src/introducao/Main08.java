package introducao;

import java.util.Locale;
import java.util.Scanner;

//Versão 2: classe Calculator(Main09.java) com membros de instância, quando eu crio uma classe auxiliar para delegar as funções.
public class Main08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Main09 calculator = new Main09 (); // Instanciando meu objeto, pois não são mais static
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		sc.close();
		
		double c = calculator.circumference (radius); // chamei as operação a partir do objeto
		double v = calculator.volume(radius); // // chamei as operação a partir do objeto
		
		System.out.printf("Cimcurference: %.2f\n", c);
		System.out.printf("Volume: %.2f\n", v);
		System.out.printf("PI value: %.2f\n", calculator.PI);
		
		}

}
