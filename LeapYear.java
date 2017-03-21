import java.util.Random;
class LeapYear{
	public static void main (String[] args){
	    Random random = new Random();
	    float x = random.nextFloat();
	    int year = Math.round( 200*x +1800);
	    if((year%400==0 | year%4==0) & year%100!=0){
	        System.out.println("This is a leap year");
	    }
	    else{
	        System.out.println("This is not a leap year");
	    }
	}
}
