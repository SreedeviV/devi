package guvi;

import java.util.Scanner;

public class pro17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int x,y;int n;int pro=1;
          Scanner ss=new Scanner(System.in);
          x=ss.nextInt();
          y=ss.nextInt();
          int d=x;
          while(x!=0){
        	   n=x%10;
        	   
        	  x=x/10;
        	  pro=pro*n;
        	
        	   
          }
          int s=pro*d;
      if(s==y){
    	  System.out.println("seed");
      }else{
    	  System.out.println("not seed");
      }
      		}

}
