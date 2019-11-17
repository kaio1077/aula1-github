package comportamentoDeMemoria_arrays_listas;

import java.util.Locale;
import java.util.Scanner;

// Seção 10.87 Udemy
public class Main18 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i = 0; i < n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		sc.close();
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) 
			soma +=  vect[i];
		
		double average = soma / 3;
		System.out.printf("AVERAGE HEIGHT: %.2f\n", average);
		
	}

}
