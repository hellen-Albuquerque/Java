package cliente;

public class cliente {

		private String nomeCliente;
		private String localCliente;
		private int idade;
		
		public cliente (String nome, String estado, int idade)
		{
			nomeCliente = nome;
			localCliente = estado;
			idade = idade;
		}
		
		public String getDados() 
		{
			String informacoes = nomeCliente + " " + idade+" "+ localCliente; 
			return informacoes;
		}
		
		
	}
	
	