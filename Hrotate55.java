package logic;

import java.util.Scanner;

public class Hrotate55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int a,b;
         Scanner ss=new Scanner(System.in);
         a=ss.nextInt();
         b=ss.nextInt();
         int s[]=new int[b];
         for(int i=0;i<b;i++){
        	 s[i]=ss.nextInt();
         }
         int d=b-a;
         for(int i=d;i<b;i++){
        	 System.out.print(s[i]);
        	
         }for(int i=0;i<d;i++){
        	 System.out.print(s[i]);
         }
	}

}
