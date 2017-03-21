import java.util.Scanner; 

class Temperature{
	
	public static void main (String[] args){
	    
		double c,t;
	    
		Scanner scanner = new Scanner(System.in);
	    
		System.out.println("Enter the number of chirps per minute : ");
	    
		c = scanner.nextDouble();
	    
		t =40 +c/4;
	    
		int T =(int) t;
	    
		System.out.println("The temperature is: "+t);
	
	}

}
