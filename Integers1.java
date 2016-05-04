package Integers;

import java.util.Arrays;
import java.util.Collections;

public class Integers1 {
	public static void main (String[] args){
	
		Double []  a= {1.6,-1.5,0.5,2.2,1.9,-0.5,0.0,4.1,-1.0,1.0,-0.3};
	
	Arrays.sort(a, Collections.reverseOrder());
	
		    for (int i = 0; i <= a.length; i++){
		    	if ((a[i] >= -1) && (a[i] <= 1))
			       System.out.println(a[i]);

		    	}
		}
	}
