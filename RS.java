import java.util.Scanner;


public class RS {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String real,etin="";
		   System.out.println("ENTER A STRING :");
		   Scanner s=new Scanner(System.in);
		   real=s.nextLine();
		   String[] Arr=real.split(" ");
		   for(int i=Arr.length-1;i>=0;i--)
		     {
		       etin=etin+" "+Arr[i];
		     }
		     System.out.println("REVERSED ORDER OF WORDS IN STRING IS:\n"+etin);
		  }
	
	}


