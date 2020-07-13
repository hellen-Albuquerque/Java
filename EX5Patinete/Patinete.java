package EX5Patinete;

public class Patinete {
	

	    private String cor;
	    private String marca;
	    private String tamanho;
	    

	    public Patinete (String cor, String marca, String tamanho) {

	        cor = cor;
	        marca = marca;
	        tamanho = tamanho;
	       
	    }
	    public String getmostrarDados() {
	        
	        String informacao = "Cor: " + cor + "\nMarca: " + marca + "\nTamanhos: " + tamanho;
	        return informacao;


	    }

	
	    }
	


