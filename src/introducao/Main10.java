package introducao;

import java.util.Locale;
import java.util.Scanner;

// Versão 3: classe Calculator(Main11.java) com método estático
public class Main10 {

	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter radius: ");
	double radius = sc.nextDouble();
	sc.close();
	
	double c = Main11.circumference(radius);
	double v = Main11.volume(radius);
	
	System.out.printf("Circumference: %.2f\n", c);
	System.out.printf("Volume: %.2f\n", v);
	System.out.printf("PI value: %.2f\n", Main11.PI);

	}

}
