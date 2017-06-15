package hunter;

import java.util.Scanner;

public class guvis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read=new Scanner(System.in);
		int i,temp=0;
		System.out.println("Enter the number of array elements");
		int number=read.nextInt();
		int arr[]=new int[number];
		System.out.println("Enter the values");
		for(i=0;i<number;i++){
			arr[i]=read.nextInt();
		}
		for(i=0;i<number;i++){
			for(int j=i+1;j<number;j++){
				if(arr[i]==arr[j]){
					System.out.println("The first element repeating in the array is "+arr[i]);
					temp=1;
					break;
				}
				if(temp==1)
					break;
				
			}
		}
		read.close();
		}
	
}
