import java.util.Random;
class Rand{
	public static void main (String[] args){
	    Random random = new Random();
	    int randomInt = random.nextInt();  
	    if(randomInt*-1==-randomInt){
	        System.out.println("Integer is positive");
	    }
	    else{
	        System.out.println("Integer is negative");
	    }
	}
}
