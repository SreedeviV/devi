import java.util.Scanner;

public class Posnegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n;int sum=0;
          Scanner ss=new Scanner(System.in);
          n=ss.nextInt();
          int a[]=new int[n];
          for(int i=0;i<n;i++){
        	  a[i]=ss.nextInt();
          }for(int j=0;j<n;j++){
        	 
        	   if((a[j]>=-2)&&(a[j]<=1)){
        		   System.out.println(a[j]);
        	   }
          }
          
          }
          
	}

