package Revis�oJava;

import java.util.Scanner;
public class Revis�oEX2 {
	

	    public static void main(String[] args) {

	        Scanner entrada= new Scanner(System.in);

	        int  imc;
	        float peso,altura;

	        System.out.println("Entre com seu peso: ");
	        peso = entrada.nextFloat();
	        System.out.println("Entra com a altura: ");
	        altura = entrada.nextFloat();

	        imc =  (int) (peso / (altura * altura));

	        if (imc < 18.5) {
	            System.out.println("Resultado: Voc� se encontra abaixo do peso");
	        }else if (imc < 25) {
	            System.out.println("Resultado: Seu peso est� normal");
	        }else if (imc < 30) {
	            System.out.println("Resultado: Voc� se encontra acima do peso");
	        }else {
	            System.out.println("Resultado: Voc�  se enquadra como Obeso");
	        }
	        
	        
	    }
	    
}	    