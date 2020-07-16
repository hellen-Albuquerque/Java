package ExHerançaPolimorfismo;


import java.util.Arrays;
import java.util.Collection;


public class Ex3_Estoque {
	    public static void main(String args[])
	    {
	        
	        Collection<String> estoque = Arrays.asList("Banana, maça, ovos, leite");
	        System.out.println("Produtos inseridos: " +estoque);
	  
	        estoque.remove("banana");
	        System.out.println(" Estoque sem produto banana: "+ estoque);
            
	        
	        Collection<String> estoque1 = Arrays.asList("ovos");
	        estoque.addAll(estoque1);
	        System.out.println("Estoque atualizado: "+ estoque);
	        
	        for (String estoqueCompleto: estoque)
	        {
	        	
	        	System.out.println("Lista de produtos totais em estoque são: "+ estoqueCompleto);
	        }
	        
	    }
	    
	    
}	    
	    
	       
	          