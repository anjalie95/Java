import java.util.Scanner; 
import java.util.Arrays; 

class Date{
	public static void main (String[] args){
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the date: ");
	    String s =scanner.nextLine();
	    String[] arr = s.split("/");
	    String y = 19+arr[2];
	    System.out.println(arr[0]+"/"+arr[1]+"/"+y);
	    
	}
}


        
