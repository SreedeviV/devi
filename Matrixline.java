package logic;

import java.util.Scanner;

public class Matrixline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int n,m;
          Scanner ss=new Scanner(System.in);
          n=ss.nextInt();
          m=ss.nextInt();
          int a[][]=new int[n][m];
          for(int i=0;i<n;i++){
        	  for(int j=0;j<m;j++){
        		  a[i][j]=ss.nextInt();
        		  System.out.print(a[i][j]);
        	  }
          }
	}

}
