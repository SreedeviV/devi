package logic;

import java.util.Scanner;

public class Middlestar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String a;
            Scanner ss=new Scanner(System.in);
            a=ss.next();
            for(int i=0;i<a.length()-1;i++){
            	if(a.charAt(i)==a.charAt(i+1)){
            		System.out.print(a.charAt(i)+"*");
            	}else{
            		System.out.print(a.charAt(i));
            	}
            }
         System.out.print(a.substring(a.length()-1));   
	}

}
