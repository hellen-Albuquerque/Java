package RevisãoJava;

import java.util.Scanner;
public class RevisãoEX3 {
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num, contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;

        System.out.println("Digite um numero: ");
        num = entrada.nextInt();

        while(num >= 0) {

            if(num >=0 && num <= 15) {
                contador1++;
            }else if(num >= 26 && num <=50) {
                contador2++;
            }else if(num >=51 && num <=75) {
                contador3++;
            }else if(num >=76 && num <=100){
                contador4++;
            }
            System.out.println("Informe um numero");
            num = entrada.nextInt();
        }
        System.out.println("\nNumeros entre [0-25]: "+contador1);
        System.out.println("\nNumeros entre [26-50]: "+contador2);
        System.out.println("\nNumeros entre [51-75]: "+contador3);
        System.out.println("\nNumeros entre [76-100]: "+contador4);


    }

}

