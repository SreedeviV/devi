import java.util.*;
	import java.lang.*;
	import java.io.*;
public class Ideone {
	   

	        public static void main (String[] args) throws java.lang.Exception
	        {
	        	Scanner input=new Scanner(System.in);
	        	String num;
	        	System.out.println("enter the number :  ");
	        	num=input.nextLine();
	        	
	        	int k;
	        	
	        	System.out.println("enter the number of digits to delete : ");
	        	k=input.nextInt();
	        	
	        	char frst[]=num.toCharArray();
	        	while(k!=0)
	        	{
	        	for(int r=0;r<frst.length;r++)
	        	{
	        		if(frst[r]<frst[r])
	        		{
	        			frst[r+1]='1';
	        			k--;
	        		}
	        		else 
	        		{
	        			frst[r]='1';
	        			k--;
	        		}
	        	
	        	}
	        	
	        	}
	        	
	        	
	        	for(int y=0;y<num.length();y++)
	        	{
	        		if(frst[y]!='1')
	        		{
	        		System.out.print(frst[y]);	
	        		}
	        	}
	        	}

	        }