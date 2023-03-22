/*****************************************************
 * Autor: Cristopher Alexis Zarate Valencia			 *
 * Fecha de creación: 21/03/2023					 *
 * Fecha de actualización: 22/03/2023				 *
 * Descripción: Programa para calcular la
 * 				transpuesta de una matriz			 
 *****************************************************/

package Matriz;

import java.util.Arrays;
import java.util.Scanner;

public class Transpuesta {
	static Scanner Leer = new Scanner(System.in);
	static int[][] MatzTran;
	
	public static void main(String[] args) {
		int[][] Matz = new int[3][2];
		
		System.out.println("-- Calcular la transpuesta de una matriz --");
		System.out.println("Tamaño de la matriz " + Matz.length +" x " + Matz[0].length);
		
		LlenarMat(Matz);
		
		System.out.println("-- Matriz normal --");
		PrintMat(Matz);
		
		Transpuesta(Matz);
		
		System.out.println("-- Matriz transpuesta --");
		PrintMat(MatzTran);
	}
	
	static void LlenarMat(int Matz[][]){ // Llenamos la matriz original.
		for (int i = 0; i < Matz.length; i++) {
			System.out.println("Escribe los valores de la fila " + i+1);
			for (int j = 0; j < Matz[0].length; j++) {
				Matz[i][j] = Leer.nextInt();
			}
		}
	}
	
	static void Transpuesta(int Mat[][]) {
		// Instanciamos una nueva matriz.
		int Fil = Mat.length,Col = Mat[0].length;
		MatzTran = new int[Col][Fil];
		
		//Transponemos la matriz
		for (int i = 0; i < Fil; i++) {
			for (int j = 0; j < Col; j++) {
				MatzTran[j][i] = Mat[i][j];
			}
		}		
	}
	
	static void PrintMat(int Matz[][] ){ // Funcion para imprimir matriz
		for (int i = 0; i < Matz.length; i++) {
			System.out.println(Arrays.toString(Matz[i]));
		}
	}
}
