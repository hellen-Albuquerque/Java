package RevisãoJava;

import java.util.Scanner;
public class RevisãoEX2 {
	

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
	            System.out.println("Resultado: Você se encontra abaixo do peso");
	        }else if (imc < 25) {
	            System.out.println("Resultado: Seu peso está normal");
	        }else if (imc < 30) {
	            System.out.println("Resultado: Você se encontra acima do peso");
	        }else {
	            System.out.println("Resultado: Você  se enquadra como Obeso");
	        }
	        
	        
	    }
	    
}	    