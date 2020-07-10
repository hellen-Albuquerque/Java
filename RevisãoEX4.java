package RevisãoJava;

public class RevisãoEX4 {
	
	public static void main(String args[]) {
    
        double soma=0;
        int x=1, y=1, a=1;
        {
        for (a=1;a<99;a++)
        {
        	soma = soma+(x/y);
        	x+=2;
        	y++;
        }
        System.out.println("Somatório: "+soma); 
        }
        
    
	}     
}