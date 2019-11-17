package comportamentoDeMemoria_arrays_listas;

import java.util.Scanner;

// Exercício de Matriz seção 10.96 Udemy
public class Main23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) { // usou [i] por ser uma matriz a coluna é a mesma que a quantidade de linhas, então usei a linha como base
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for (int i = 0; i < mat.length; i++) 	
			System.out.print(mat[i][i] + " ");
		
		sc.close();
		System.out.println();
		
		int count = 0;
		for (int i = 0; i < mat.length; i++)
			for (int j = 0; j < mat[i].length; j++)
				if (mat[i][j] < 0)
					count++;
		
		System.out.println("Negative numbers: " + count);
	}

}
