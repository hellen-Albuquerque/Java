package ArrayMatriz_Java;

import java.util.Scanner;

public class Ex4_Matriz {
	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		float [][] m1 = new float[2][2], m2 = new float[2][2];
		float [][] somar = new float[2][2], subtrair = new float[2][2];
		int consti, op;
		
		for(int l=0;l<2;l++) {
			for(int c=0;c<2;c++) {
				System.out.println("Entre com um número");
				m1[l][c] = leitura.nextFloat();
			}
		}
		
		for(int l=0;l<2;l++) {
			for(int c=0;c<2;c++) {
				System.out.println("Entre com um número");
				m2[l][c] = leitura.nextFloat();
			}
		}
		System.out.println("\n (1) Somar as duas matrizes");
		System.out.println("\n (2) Subtrair a primeira matriz da segunda");
		System.out.println("\n (3) Adicionar uma constante as duas matrizes");
		System.out.println("\n (4) Imprimir as matrizes");
		System.out.println("\n Digite a sua opção: ");
		op = leitura.nextInt();
		switch(op) {
		
		case 1:
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					somar[l][c] = m1[l][c] + m2[l][c];
					System.out.println("Valor: " + somar[l][c]);
				}
			}
			break;
		case 2:
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					subtrair[l][c] = m1[l][c] - m2[l][c];
					System.out.println("Valor: " + subtrair[l][c]);
				}
			}
			break;
		 case 3:
			System.out.println("Entre com um valor constante: ");
			consti = leitura.nextInt();
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					 m1[l][c] = m1[l][c]+consti;
					 m2[l][c] = m2[l][c]+consti;
					System.out.println("\nM1: " + m1[l][c]);
					System.out.println("\nM2: " + m2[l][c]);
				}
			}
			break;
		
		 case 4:
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					System.out.println("\nMatriz 1: " + m1[l][c]);
				}
			}
			for(int l=0;l<2;l++) {
				for(int c=0;c<2;c++) {
					System.out.println("\nMatriz 2: " + m1[l][c]);
				}
			}
			break;
		 
		  default:
			   System.out.println("Opção inválida...");
			
		}
		
	}

}