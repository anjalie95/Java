import java.util.Random;
class Cube{
	public static void main (String[] args){
	    Random random = new Random();
	    int n = random.nextInt(99) + 0;
	    System.out.println("n="+n);
	    int sum = 0;
	    for(int i=1;i<n+1;i++){
	        sum += i*i*i;
	    }
	    System.out.println("Sum="+sum);
	    int s = n*n*(n+1)*(n+1)/4;
	    System.out.println("n*n*(n+1)*(n+1)/4="+s);
	}
}
