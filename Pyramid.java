import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n;
        Scanner ss=new Scanner(System.in);
        n=ss.nextInt();
       
        for(int i=0;i<n;i++) {
        	for(int k=0;k<2;k++){
        		for(int j=i;j<n;j++){
        	System.out.print("*");
        }System.out.print("  ");
        }System.out.println();
        }
       
        }

}
