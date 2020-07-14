package POOExercícios;

public class main1 
{
	public static void main (String args[])
	{
		pessoa Hellen = new pessoa ("Hellen", " Rua Bom Pastor, 999", " 3333 8888" );
		fornecedor João = new fornecedor("João", "Rua Clarita", "77788", 4600, 200);
		
		System.out.println(" Saldo de João: "+João.obterSaldo());
		
		System.out.println(Hellen.getEndereço());
		System.out.println(João);
	}

}
