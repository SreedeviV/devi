package logic;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              int a;
              int sum=0,sum1=0;
              int e=0,q=0;
              Scanner ss = new Scanner(System.in);
              a=ss.nextInt();
              while(a!=0){
            	  int n=a%10;
            	  a=a/10;
            	  sum=sum+n;
            	   e=sum;
              }   
              while(sum!=0){
            	  int m=sum%10;
            	  sum=sum/10;
            	  sum1=sum1*10+m;}
              if(e==q){
            	  System.out.println("palindrome");
              }else{
            	  System.out.println("not");
            	  }
              
	}

}
