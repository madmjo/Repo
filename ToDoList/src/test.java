import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner scan =  new Scanner (System.in); 
		
      
         String inputs = null ;
         boolean quit = false ; 
         while (quit = true ) {
          System.out.println("Enter a word");
          inputs = scan.nextLine();
          scan.next();
          quit=inputs.contentEquals("quit") ;
         System.out.println(inputs);
         if (inputs.contentEquals("repeat") )
         {
        	 System.out.println(inputs);
        	 System.out.println("repeating");
         }

         else if (inputs.contentEquals("hi"))
         {
        	 System.out.println("hi back");
        	
         }
         
         }
        	
         System.out.println("Exited");
    
		
		
		/*
		int l = -1 ; 
		 while (l != 0) {
	          System.out.println("Enter a word");
	       
	          l = scan.nextInt();
	         // System.out.println(inputs);
	         if (l == 1 )
	         {
	        	 System.out.println(l);
	        	 System.out.println("here1");
	         }

	         else if (l == 2)
	         {
	        	 System.out.println("hi back");
	        	 System.out.println("here2");
	         }
	         
	         }
	        	
	         System.out.println("Exited");
		*/
		
         
	}

}
