package EX2Avião;

public class avião {
	 
	 private String companhiaAerea;
	    private int codigoEmbarque;
	  

	    public avião (String compA, int codE)
	    {
	        companhiaAerea = compA;
	        codigoEmbarque = codE;
	        
	    }

	    public String getmostrar () {
	        String informacoes = " Companhia Áerea: "+companhiaAerea+" | Código de Embarque: "+codigoEmbarque;
	        return informacoes;
	    } 

	    
	 
	    
	}


