package EX2Avi�o;

public class avi�o {
	 
	 private String companhiaAerea;
	    private int codigoEmbarque;
	  

	    public avi�o (String compA, int codE)
	    {
	        companhiaAerea = compA;
	        codigoEmbarque = codE;
	        
	    }

	    public String getmostrar () {
	        String informacoes = " Companhia �erea: "+companhiaAerea+" | C�digo de Embarque: "+codigoEmbarque;
	        return informacoes;
	    } 

	    
	 
	    
	}


