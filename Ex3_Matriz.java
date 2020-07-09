package ArrayMatriz_Java;

import java.util.Scanner;
public class Ex3_Matriz {
	public static void main(String[] args) {

        Scanner leia = new Scanner (System.in);

        int [][] matriz = new int [3][3];
        int quantidade = 0;

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.println("Informe o valor da matriz na posição [" + (i+1)+ "] [" + (j+1) + "] : ");
                matriz[i][j] = leia.nextInt();

                if (matriz[i][j] > 10 ) {
                    quantidade++;
                }

            }
        }

        System.out.println("Os valores maiores que 10 são: " + quantidade);


    }

}


