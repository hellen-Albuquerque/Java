package cliente;

public class main {
	public static void main (String[] args) 
	{

		cliente cliente1 = new cliente ("Daniela", "SP", 40);
		System.out.println(cliente1.getDados());
		
		cliente cliente2 = new cliente ("Patricia", "SP", 33);
		System.out.println(cliente2.getDados());
	}

}


