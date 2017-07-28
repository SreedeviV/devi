package logic;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int a,b;
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		for(int i=2;i<=a;i++){
			for(int j=2;j<=b;j++){
				if((a%i!=0)&&(b%j!=0)){
					System.out.println(" co prime");break;
				}else{
					System.out.println("not coprime");break;
				}
			
				
		}break;}
	}

}
