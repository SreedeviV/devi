package guvi;

import java.util.Arrays;

public class Repeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] num={ 3,4,5,6,3,2,3};
      Arrays.sort(num);
      for(int i=0;i<num.length;i++){
    	 
    	    for(int j = i+1; j < num.length; j++){
    	      if(num[i] == num[j]){
    	       System.out.println( num[i]);break;}}
      }}
    	 
      
	}


