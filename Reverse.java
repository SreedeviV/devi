package skill;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		Scanner ss=new Scanner(System.in);
		a=ss.nextLine();
		String b[]=a.split(" ");
		for(int i=b.length-1;i>=0;i--){
			System.out.println(b[i]);
		}

	}

}
