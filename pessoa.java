package POOExerc�cios;

public class pessoa {
  private String nome;
  private String endere�o;
  private String telefone; 
  
    public pessoa (String nome, String endere�o, String telefone) {
    	
    	this.nome = nome;
    	this.endere�o = endere�o;
    	this.telefone = telefone;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}	
    
    
    	
    	
    
}
