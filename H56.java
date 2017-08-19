package logic;

import java.util.Arrays;
import java.util.Scanner;

public class H56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int s;int b=0;int max=0;int y=0;int y1=0;
          Scanner ss=new Scanner(System.in);
          s=ss.nextInt();
          int a[]=new int[s];
          int b1[]=new int[s];
          int c[]=new int[s];
          for(int i=0;i<s;i++){
        	  a[i]=ss.nextInt();
          }
          for(int i=0;i<s;i++){
        	  for(int j=i+1;j<s-1;j++){
        	  if((a[i]+a[j]>0&&a[i]+a[j]<=5)||(a[i]+a[j]<0&&a[i]+a[j]<=-5)){
        	    b1[y]=a[i];
        	    c[y1]=a[j];
        	    y++;
        	    y1++;
        	    }}
          }
          for(int i=0;i<s;i++){
        	  System.out.println(b1[0]+" "+c[0]);break;
        	 // System.out.println(c[i]);
          }
	}

}
