package logic;

import java.util.Scanner;

public class Stairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int c=0;
       Scanner ss=new Scanner(System.in);
       c=ss.nextInt();
       for(int i=1;i<c;i++){
    	   System.out.println(i);
       }
       for(int j=2;j<c;j=j+2){
    	   System.out.println(j);
       }
       
	}

}
