package ExHeran�aPolimorfismo;

public class AnimalTeste {
	public static void main (String args [])
	{
		
		AnimalCachorro cachorro = new AnimalCachorro();
		cachorro.getNome();
		cachorro.getIdade();
		cachorro.som();
		cachorro.correr();
		System.out.println();
		
		
		AnimalCavalo cavalo = new AnimalCavalo();
		cavalo.getNome();
		cavalo.getIdade();
		cavalo.som();
		cavalo.correr();
		System.out.println();
		
		AnimalPregui�a pregui�a = new AnimalPregui�a();
		pregui�a.getNome();
		pregui�a.getIdade();
		pregui�a.som();
		pregui�a.subirArvores();
		System.out.println();
		
		
		
		
	}
}