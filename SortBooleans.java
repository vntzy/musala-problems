
package booleansort;

import java.util.Arrays;

import java.util.Collections;

public class SortBooleans {
	  public static void main(String[] args) {
		  
	    Boolean[] data = { new Boolean(true), new Boolean(false),
	        new Boolean(false), new Boolean(true),new Boolean(true) };
	    
	    Arrays.sort(data, Collections.reverseOrder()); // EXPECT RUNTIME ERROR
	    
	    for (int i = 0; i < data.length; i++)
	      System.out.println(data[i]);
	  }
	}