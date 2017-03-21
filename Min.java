import java.util.Random;
class Min{
	public static void main (String[] args){
	    Random random = new Random();
	    int randomInt1 = random.nextInt();
	    int randomInt2 = random.nextInt();
	    if(randomInt1>randomInt2){
	        System.out.println("Min is randomInt2:"+randomInt2);
	    }
	    else{
	        System.out.println("Min is randomInt1:"+randomInt1);
	    }
	}
}
