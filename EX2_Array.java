package ArrayMatriz_Java;

import java.util.Scanner;
public class EX2_Array {
	 public static void main(String[] args) {


	        Scanner ler = new Scanner(System.in);
	        int [] vetor = new int[6];
	        int Par = 0, Impar = 0;


	        for(int i = 0; i < 6; i++) {
	            System.out.println("Insira o valor do vetor [" + (i+1) + "] : \n");
	            vetor[i] = ler.nextInt();

	            if (vetor[i] % 2 == 0) {
	                Par = Par + vetor[i];
	            } else {
	                Impar = Impar + vetor[i];

	            }
	        }

	        System.out.println("O resultado da soma dos valores pares foi de: " + Par);
	        System.out.println("O resultado da soma dos valores impares foi de: " + Impar);


	        System.out.printf("Os valores pares são: ");
	        for (int i= 0 ; i < 6 ; i++) {

	            if (vetor[i] % 2 == 0) {
	                System.out.print("\n" + vetor[i]);
	            }
	        }
	        System.out.printf("\nOs valores impares são: ");
	        for (int i= 0 ; i < 6 ; i++) {

	            if (vetor[i] % 2 != 0) {
	                System.out.print("\n" + vetor[i]);
	            }
	        }

	    }

}

