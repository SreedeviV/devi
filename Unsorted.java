import java.util.Scanner;

public class Unsorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n;
         int count=0;
         Scanner ss=new Scanner(System.in);
         n=ss.nextInt();
         int a[]=new int[n];
         for(int i=0;i<n;i++){
        	 a[i]=ss.nextInt();
         }
         for(int j=0;j<n;j++){ count=0;
        	 for(int k=0;k<n;k++){
        		 if(a[j]==a[k]){
        		 count++;
        	 }
         }if(count<2){
        	 System.out.println(a[j]);
         }
	}      
         }

}
