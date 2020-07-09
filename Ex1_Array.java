package ArrayMatriz_Java;

import java.util.Scanner;

public class Ex1_Array {
	public static void main(String[] args) {

        Scanner ler = new Scanner (System.in); {
        int [] num = new int[6],par = new int[6], impar = new int[6];
        int somaPar = 0, contImpar = 0,x;
         
        
        for(x=0;x<6;x++)
		{
			System.out.println("Entre com um número: ");
			
			num[x] = ler.nextInt();
			
		}
		for(x=0;x<6;x++)
		{
			if(num[x]%2==0)
			{
				par[x]=num[x];
				somaPar = somaPar+num[x];
			}
			else
			{
				impar[x]=num[x];
				contImpar++;
			}
		
		for(x=0;x<6;x++)
		{
			System.out.printf("%d, ",par[x]);
		}
		     
		for(x=0;x<6;x++)
		{
			System.out.printf("%d, ",impar[x]);
		}
		
           System.out.println("Somatório dos números pares: "+somaPar);
           System.out.println("Somatório dos números ímpares: "+contImpar);
       }

	
        }
        
	}
	
}
           
        	
        
        	
        	