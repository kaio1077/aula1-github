package introducao;

import java.util.Locale;
import java.util.Scanner;

/* Este programa será feito da forma que foi aprendida apenas na lógica de programação, o programa seguinte será usando as funções de Java


Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
possui a maior área.
A fórmula para calcular a área de um triângulo a partir das medidas de seus lados a, b e c é a
seguinte (fórmula de Heron):
area = raiz (p( p - a)( p - b)( p - c) / 2)
p = (a + b + c) / 2
 */
public class Main01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre three measures of triangule X: ");
		double xA = sc.nextDouble();
		double xB = sc.nextDouble();
		double xC = sc.nextDouble();
		System.out.println("Entre three measures of triangule Y: ");
		double yA = sc.nextDouble();
		double yB = sc.nextDouble();
		double yC = sc.nextDouble();
		sc.close();
		
		double p = (xA + xB + xC) / 2.0;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		System.out.printf("Triangule X area: %.4f\n", areaX);
		
		p = (yA + yB + yC) / 2.0;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		System.out.printf("Triangule Y area: %.4f\n", areaY );
		
		if (areaX > areaY)
			System.out.println("Larger area: X");
		else
			System.out.println("Larger area: Y");

	}

}
