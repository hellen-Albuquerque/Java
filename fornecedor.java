package POOExerc�cios;

public class fornecedor extends pessoa{
   
	private double valorCredito;
	private double valorDivida;
	
	public fornecedor (String nome, String endere�o, String telefone, double valorCredito, double valorDivida)
    {
	   super (nome, endere�o, telefone);
	   this.valorCredito = valorCredito;
	   this.valorDivida = valorDivida;
    }
	
	   public double obterSaldo()
	   {
		   double obterSaldo = valorCredito - valorDivida;
		   return obterSaldo;
	   }

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	
	   
	   
}

