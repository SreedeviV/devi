package logic;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String a,b;
           Scanner ss=new Scanner(System.in);
           a=ss.next();
           b=ss.next();
           int a1=Integer.parseInt(a);
           int b1=Integer.parseInt(b);
           int c=a1*b1;
           String c1=Integer.toString(c);
           System.out.println(c1);
	}

}
