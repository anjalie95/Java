import java.util.Scanner; 
class Tele{
	public static void main (String[] args){
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter 10-digit telephone number: ");
	    String s =scanner.nextLine();
	    System.out.println("you entered "+s);
	    String a = s.substring(0,2);
	    System.out.println("The area code is "+a);
	    String b = s.substring(3,5);
	    System.out.println("The exchange is "+b);
	    String c = s.substring(6,9);
	    System.out.println("The area code is "+c);
	    System.out.println("The complete telephone number is ("+a+") "+b+"-"+c);
	}
}

