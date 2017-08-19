package logic;

import java.util.Scanner;

public class H57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n;int count=0;int i=0;int j=0;
         Scanner ss=new Scanner(System.in);
         n=ss.nextInt();
         int a[]=new int[n];
         for(i=0;i<n;i++){
        	 a[i]=ss.nextInt();
         }
         for( i=0;i<n;i++){count=0;
        	 for( j=0;j<n;j++){
        		 if(a[i]==a[j]){
        			 count++;
        			 
        		 }	 }if(count==1)
        		 {
        			 System.out.println(a[i]);}
        		 } 
            	 
        	  
         
         
         
	}

}
