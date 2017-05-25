
import java.util.Scanner;
import java.util.Random;

public class SecretNumber
{
	
	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
        int num = 0;
        Random r = new Random();
        int x = 1 + r.nextInt(100);
        
        		
        
        
	    
        while (num != x){
        	 
     	     System.out.print("Enter your number between 1-100:");
     	     num = sc.nextInt();
     	    
	         
	         if (x == num){
	             System.out.println("You are right.Random number is " + x);
	                  
	         }else if (num > x){
	        	 System.out.println("You guessed a high number");
	             }else if (num < x){
	            	 System.out.println("You guessed a low number");
	            
	        	 
	         
	         }
	    
	    
        }
		
	   
	
	}
}
