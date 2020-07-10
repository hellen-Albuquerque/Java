package RevisãoJava;

import java.util.Scanner;
public class RevisãoEX5 {
	 public static void main(String[] args) {

	        Scanner entrada= new Scanner(System.in);

	        float [] vetor = new float[5];
	        int menu;

	        for(int i = 0; i < 5; i++) {
	            System.out.println("Informe o valor do vetor[" + (i+1)+ "]: ");
	            vetor[i] = entrada.nextFloat();
	        }

	        System.out.println("(1)- Ordem direta (2)- Ordem inversa");
	        menu = entrada.nextInt();

	        if (menu == 1) {
	            System.out.printf("Vetor: ");
	            for(int i = 0; i < 5; i++) {
	                System.out.printf(vetor[i] + "\t");
	            }
	        }else if(menu == 2){
	            System.out.printf("Vetor na ordem inversa: ");
	            for (int i = 4; i >= 0 ; i--) {
	                System.out.printf(vetor[i]+ "\t");
	            }
	        } else {
	            System.out.println("Inválido");
	        }
	    }



}
