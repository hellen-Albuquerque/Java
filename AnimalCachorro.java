package ExHerançaPolimorfismo;

public class AnimalCachorro  extends Animal{
	public String correr;
	 
	
	 public AnimalCachorro ()
	 {
		 super ("Totó", 3);
	 }
	 public void correr()
	 {
		 System.out.println(" Cachorro correndo feliz..");
	 }
	 public void som()
	 {
		System.out.println("Au Au Au");
			
	 }
	
}