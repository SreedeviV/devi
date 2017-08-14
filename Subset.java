import java.util.Scanner;

public class Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String a,b;
          int flag=0;
           Scanner ss=new Scanner(System.in);
           a=ss.next();
           b=ss.next();
           for(int i=0;i<a.length();i++){
        	   for(int j=0;j<b.length();j++){
        		   if(a.charAt(i)==b.charAt(j)){
        			flag=1;
        		   }
        		   }
        	   } if(flag==1){
        		   System.out.println("subset");
        	   }else{
        		   System.out.println(" not subset");
        	   }
           }
	}


