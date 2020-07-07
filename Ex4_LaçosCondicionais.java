package ProjetoJAVA;

import  java.util.Scanner;

public class Ex4_LaçosCondicionais {
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int nu;

        double r, pot;

        System.out.println("Escolha um número qualquer: ");
        nu = entrada.nextInt();


        if (nu % 2 == 0) {

            r = Math.sqrt(nu);

            System.out.println(" O número " + nu + " é par e sua raiz quadrada é " + r);
         
         }
         else 
         {
            pot = Math.pow(nu, 2);
            System.out.println(" O número " + nu + " é ímpar e elevado a dois é " + pot);
         }



    }

}
