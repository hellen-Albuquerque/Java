package ExHerançaPolimorfismo;

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
		
		AnimalPreguiça preguiça = new AnimalPreguiça();
		preguiça.getNome();
		preguiça.getIdade();
		preguiça.som();
		preguiça.subirArvores();
		System.out.println();
		
		
		
		
	}
}