import java.util.*;

import java.util.List;

import java.util.Arrays;


class Digits{
    
	public static void main(String args[]){
        
		int n = 5814;
        
		int x = 1000;
        
		int a;
        
		List myList = new ArrayList();
        
		for(int i=0;i<4;x/=10){
            
			a = n/x;
            
			i++;
            
			myList.add(a);
            
			n %=x;
        
		}
        
System.out.println("The digits of n are "+myList.get(0)+","+myList.get(1)+","+myList.get(2)+" and "+myList.get(3));
    
	}

}
