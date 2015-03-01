import java.util.Scanner;
public class ForLoop { 
public static void main(String[]args)
       {
        int count;
        String U = "admin";
	String P = "code";
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please enter your Username");
        U = keyboard.next();
	System.out.println("Enter the Password");
        P=keyboard.next();
									  	        if (U.equals("admin")&& P.equals("code"))
	System.out.println("Welcome "+ U);
										        else
         { for (count = 1; count < 3; count++)   
	 {if (!U.equals("admin")&& !P.equals("code"))
	     System.out.println("Wrong, Enter your Username again? ");
	     U = keyboard.next();
	     System.out.println("Enter the Password");
	     P=keyboard.next();
	}
																				         System.out.println("Please contact your adminstrator to unlock your account!");
       }
     }
   }  	 
