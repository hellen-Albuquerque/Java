package ex2;

	import java.util.Scanner;

	public class javaEx2 {

	    public static void main (String args [])
	    {
	        Scanner leia=new Scanner (System.in);
	        int ano,mes,dia,totalDias;

	        System.out.printf("Escreva quantos dias de vida você tem ");
	        totalDias = leia.nextInt();

	        ano=totalDias/365;
	        mes=(totalDias%365)/30;
	        dia=(totalDias%365)%30;


	        System.out.printf("\nSua idade em anos é: "+ano);
	        System.out.printf("\nSua idade em meses é: "+mes);
	        System.out.printf("\nSua idade em dias é: "+dia);
	    }

	}