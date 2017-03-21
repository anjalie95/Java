import java.util.Random;
class Divide{
	public static void main (String[] args){
	    Random random = new Random();
	    int randomInt = random.nextInt();
	    if(randomInt%2==0){
	        System.out.println("Integer is divisible by 2");
	    }
	    if(randomInt%3==0){
	        System.out.println("Integer is divisible by 3");
	    }
	    if(randomInt%5==0){
	        System.out.println("Integer is divisible by 5");
	    }
	}
}
