package ProjetoJAVA;

import  java.util.Scanner;

public class Ex4_La�osCondicionais {
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nu;

        double r, pot;

        System.out.println("Escolha um n�mero qualquer: ");
        nu = entrada.nextInt();


        if (nu % 2 == 0) {

            r = Math.sqrt(nu);

            System.out.println(" O n�mero " + nu + " � par e sua raiz quadrada � " + r);
         
         }
         else 
         {
            pot = Math.pow(nu, 2);
            System.out.println(" O n�mero " + nu + " � �mpar e elevado a dois � " + pot);
         }



    }

}
