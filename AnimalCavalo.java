package ExHerançaPolimorfismo;

public class AnimalCavalo extends Animal {
	public String correr;
	
	 
	
	 public AnimalCavalo ()
	 {
		 super ("PéDePano", 3);
	 }
	 public void correr()
	 {
		 System.out.println(" Cavalo correndo livre...");
	 }
	 
	 public void som()
	 {
		System.out.println("pocotó pocotó pocotó");
			
		
	 }
	
}