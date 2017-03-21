import java.util.Scanner; 
import java.util.Arrays;

class Alphabet{
	public static void main (String[] args){
	    String[] arr = new String[3];
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter first name: ");
	    String s1 =scanner.nextLine();
	    System.out.println("Enter second name: ");
	    String s2 =scanner.nextLine();
	    System.out.println("Enter third name: ");
	    String s3 =scanner.nextLine();
	    if(s1.compareTo(s2)>0 & s1.compareTo(s3)>0){
	        arr[0]=s1;
	        if(s2.compareTo(s3)>0){
	            arr[1]=s2;
	            arr[2]=s3;
	        }
	        else{
	            arr[1]=s3;
	            arr[2]=s2;
	        }
	    }
	    else if(s2.compareTo(s1)>0 & s2.compareTo(s3)>0){
	        arr[0]=s2;
	        if(s1.compareTo(s3)>0){
	            arr[1]=s1;
	            arr[2]=s3;
	        }
	        else{
	            arr[1]=s3;
	            arr[2]=s1;
	        }
	    }
	    else{
	        arr[0]=s3;
	        if(s1.compareTo(s2)>0){
	            arr[1]=s1;
	            arr[2]=s2;
	        }
	        else{
	            arr[1]=s2;
	            arr[2]=s1;
	        }
	    }
	    
	}
}

     
