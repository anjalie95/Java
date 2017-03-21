import java.util.Scanner;

class Month{
	public static void main (String[] args){
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the month: ");
	    String month = scanner.nextLine();
	    System.out.println("You entered "+month);
	    String abbr = month.substring(0,3).toUpperCase();
	    System.out.println("Its abbreviation is "+abbr);
	    int n=0;
	    char c0 = abbr.charAt(0);
	    char c1 = abbr.charAt(1);
	    char c2 = abbr.charAt(2);
	    if(c0=='A'){
	        if(c1=='B'){
	            n = 4;
	        }
	        else if(c1=='U'){
	            n = 8;
	        }
	    }
	    if(c0=='D'){
	        n=12;
	    }
	    if(c0=='F'){
	        n=2;
	    }
	    if(c0=='J'){
	        if(c1=='A'){
	            n = 1;
	        }
	        else if(c1=='U'){
	            if(c2=='L'){
	                n = 7;
	            }
	            else if(c2=='N'){
	                n = 6;
	            }
	        }
	    }
	    if(c0=='M'){
	        if(c2=='R'){
	            n = 3;
	        }
	        else if(c2=='Y'){
	            n = 5;
	        }
	    }
	    if(c0=='S'){
	        n = 9;
	    }
	    if(c0=='O'){
	        n = 10;
	    }
	    if(c0=='N'){
	        n = 11;
	    }
	    System.out.println("This is month number "+n);
	}
}

     
