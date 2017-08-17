package player;

import java.util.Scanner;

public class Workingday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              String a;
              Scanner ss=new Scanner(System.in);
              a=ss.next();
              switch(a){
              case "monday":
            	  System.out.println("true");
            	  break;
              case "tuesday":
            	  System.out.println("true");
            	  break;
              case "wednesday":
            	  System.out.println("true");
            	  break;
              case "thursday":
            	  System.out.println("true");
            	  break;
              case "friday":
            	  System.out.println("true");
            	  break;
              case "saturday":
            	  System.out.println("true");
            	  break;
              case "sunday":
            	  System.out.println("false");
            	  break;
              }
	}

}
