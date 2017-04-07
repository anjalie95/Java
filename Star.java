/*
Write a function to print following structure on the CLI using loops in java
         *
         *
         *
         *
*  *  *  *
*/

class Star{
	public static void printstar(){
		for(int i=0;i<4;i++){
			for(int j=0;j<3;j++){
				System.out.print(" ");
			}
			System.out.println('*');
		}
		for(int k=0;k<4;k++){
				System.out.print('*');
			}
	}
	public static void main(String args[]){
		printstar();
	}
}
