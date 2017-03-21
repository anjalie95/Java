import java.util.Scanner; 

class fahrenheit{
	
	public static void main (String[] args){
	    
		double f,c;
	    
		Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Enter temperature in celsius : ");
	    
		c = scanner.nextDouble();
	    
		f = 1.8*c+32;
	    
		System.out.println("Equivalent fahrenheit value is: "+f);
	
	}

}
