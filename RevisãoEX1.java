package RevisãoJava;

import java.util.Scanner;

public class RevisãoEX1 {
	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        
        int operação;
        double conta, valor;
        

        System.out.println("Digite o valor do produto: ");
        valor = entrada.nextDouble();

        System.out.println("Digite a forma de pagamento (1)A vista em dinheiro/cheque (2)A vista no"
                + " cartão de credito (3)- Em duas vezes sem juros (4)- Em tres vezes");
        operação = entrada.nextInt();

        switch(operação) {

        case 1:

            conta = valor * 0.20;
            conta = valor - conta;
            System.out.println("Valor a ser pago com 20% de desconto: "+ conta);
            break;
        case 2:
            conta = valor * 0.15;
            conta = valor - conta;
            System.out.println("Valor a ser pago com 15% de desconto: " + conta);
            break;
        case 3:
            System.out.println("Valor a ser pago: " + (valor/2) + " reais Duas vezes.");
            break;
        case 4:
            conta = valor * 0.10;
            conta = valor + conta;
            System.out.println("Valor a ser pago: "+ (Math.round(conta/3))+" reais Tres vezes. ");
           break;
        
        default:
            System.out.println("Opção não aceita");
            break;

        }
    }

}

