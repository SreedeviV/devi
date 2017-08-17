package logic;

import java.util.Scanner;

public class Matrixcolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n,m;int[] count=new int[10];
         Scanner ss=new Scanner(System.in);
         n=ss.nextInt();
         m=ss.nextInt();int t=0;
         int r[]=new int[100];
         int c[]=new int[100];
         int a[][]=new int[n][m];
         for(int i=0;i<n;i++){
        	 for(int j=0;j<m;j++){
        		 a[i][j]=ss.nextInt();
        	 }
         }
         for(int i=0;i<n;i++){
        	 for(int j=0;j<m;j++){
        		 if(a[j][i]==0){
        			r[t]=i;
        			c[t]=j;
        			t++;}}}
         for(int k=0;k<t-1;k++){
        	for(int i=0;i<n;i++){
        		 if(i==r[k]){
        			 for(int j=0;j<n;j++){
        				 a[i][j]=0;
        			 }
        	 }}
         } for(int k=0;k<t-1;k++){
         	for(int j=0;j<m;j++){
    		 if(j==c[k]){
    			 for(int i=0;i<n;i++){
    				 a[i][j]=0;
    			 }
    	 }}
     }for(int k=0;k<n;k++){
    	 for(int l=0;l<m;l++){
    		 System.out.print(a[l][k]+" ");
    	 }System.out.println(" ");
     }System.out.println();
        		
}}
