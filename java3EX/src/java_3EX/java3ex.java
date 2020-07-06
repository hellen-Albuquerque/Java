package java_3EX;

import java.util.Scanner;

public class java3ex {


	     public static void main(String[] args) {

	         int horas,minutos,segundos,x;

	         Scanner leitura = new Scanner(System.in);

	         System.out.println("Insira o tempo do evento da fábrica em segundos:");
	         x = leitura.nextInt();

	         horas = x / 3600;
	         minutos = (x%3600) / 60;
	         segundos = (x%3600) % 60;

	         System.out.println("Horas:" + horas);
	         System.out.println("Minutos:" + minutos);
	         System.out.println("Segundos:" + segundos);

	     }

   
}