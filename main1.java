package POOExerc�cios;

public class main1 
{
	public static void main (String args[])
	{
		pessoa Hellen = new pessoa ("Hellen", " Rua Bom Pastor, 999", " 3333 8888" );
		fornecedor Jo�o = new fornecedor("Jo�o", "Rua Clarita", "77788", 4600, 200);
		
		System.out.println(" Saldo de Jo�o: "+Jo�o.obterSaldo());
		
		System.out.println(Hellen.getEndere�o());
		System.out.println(Jo�o);
	}

}
