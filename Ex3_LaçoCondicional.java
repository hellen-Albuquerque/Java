package ProjetoJAVA;

import java.util.Scanner;
public class Ex3_LaçoCondicional {
public static void main(String[] args)

{
     Scanner entrada = new Scanner (System.in);
     int id;

     System.out.printf("Quantos anos você tem?: ");
        id = entrada.nextInt();

     if(id >= 10 && id <=14)
     {
         System.out.printf("Voce faz parte da categoria Infantil");
     }

     else if(id >= 15 && id <=17)
     {
         System.out.printf("Voce faz parte da categoria Juvenil");
     }
     else if (id >= 18 && id <=25)
     {
         System.out.printf("Voce faz parte da categoria Adulto");
     }
     else
     {
         System.out.printf("Voce não faz parte das outras categorias");
        
     }
        
 }

}
