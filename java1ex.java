package java1;

import java.util.Scanner;

public class java1ex {


    public static void main (String args [])
    {
    	 Scanner leia=new Scanner (System.in);
         int ano,mes,dia;
         double totalDias;


        System.out.printf("\nDigite sua idade em anos:");
        ano = leia.nextInt();
        System.out.printf("\nDigite quantos meses de vida você tem:");
        mes = leia.nextInt();
        System.out.printf("\nDigite quantos dias de vida você tem:");
        dia = leia.nextInt();
     
        

        totalDias=(ano*365+ mes*30+dia);

        System.out.printf("\nSua idade em dias é: "+totalDias);

 
    }

}