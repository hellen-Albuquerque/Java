package ProjetoJAVA;

import java.util.Scanner;

public class EX1_La�oCondicional {
	private static Scanner entrada;

	public static void main(String args[])
	{
		entrada = new Scanner(System.in);

        int nu1,nu2,nu3, maiorNum = 0;
        
        System.out.println("Escolha um n�mero: ");
        nu1 = entrada.nextInt();
        
        System.out.println("Escolha outro n�mero: ");
        nu2 = entrada.nextInt();
        
        System.out.println("Escolha mais um n�mero: ");
        nu3 = entrada.nextInt();
        
        
        if (nu1 > nu2) {
        
        maiorNum = nu1;
        }
	    else 
	    {
        maiorNum = nu2;
        }
        if(nu3 > maiorNum) 
        {
        maiorNum = nu3;
        }

        System.out.println("O maior n�mero escolhido foi: " + maiorNum);

        
        
        
	}

}
