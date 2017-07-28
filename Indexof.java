package logic;

import java.util.Scanner;

public class Indexof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              String a;
       int count=0;
             
              String b;
             
              Scanner ss=new Scanner(System.in);
              a=ss.next();
              b=ss.next();
             String b1=b;
             for(int i=0;i<=a.length()-b.length();i++){
            	 if((a.substring(i,b.length()+i)).equals(b)){
            		 System.out.println(i);break;
            	 }else{
            		 count++;
            	 }
             

             }if(count==a.length()-b.length()){
            	 System.out.println("-1");
             }
	

}}