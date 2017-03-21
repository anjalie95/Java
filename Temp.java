import java.util.Scanner; 

class Temp{
	
	public static void main (String[] args){
	    
		double f,c;
	    
		Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Enter temperature in fahrenheit : ");
	    
		f = scanner.nextDouble();
	    
		c = 5*(f-32)/9;
	    
		System.out.println("Equivalent celsius value is: "+c);
	
	}

}
