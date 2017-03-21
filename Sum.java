import java.util.Random;
class Sum{
	public static void main (String[] args){
	    Random random = new Random();
	    int n = random.nextInt(100) + 1;
	    System.out.println("n="+n);
	    int sum = 0;
	    for(int i=1;i<n+1;i++){
	        sum += i;
	    }
	    System.out.println("Sum="+sum);
	    int s = n*(n+1)/2;
	    System.out.println("n*(n+1)/2="+s);
	}
}
