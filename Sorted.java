import java.util.Scanner;

public class Sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           int n;
           Scanner ss=new Scanner(System.in);
           n=ss.nextInt();
          // int b[]=new int[1];
           
           int a[]=new int[n];
           for(int i=0;i<n;i++){
        	   a[i]=ss.nextInt();
           }
           for(int j=0;j<n;j++){
               if(a[j]==j){
            	   System.out.println(a[j]);
               }
           }
	}

}
