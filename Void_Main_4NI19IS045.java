package project_main;          // package containing void main program

import project_import.*;       //importing superclass and subclass files from the package project_import 
import java.io.IOException;    //importing IOException utility


public class project {

	public static void main(String[] args) {
		
		int i;
		    
	       //main program in try block
		try {
			
		     Totalitems ti = new Totalitems();     //creation of class object and calling the default constructor
		     while(true) {
		           ti.welcome();
		           i = ti.items();
		
		               if(i==1) { 
			           ti.close();
			           break;
		              }
		          }
		
		   }
		
		  //catch block statements
		catch(IOException e){
			
			 System.out.println("Checked Exception --> IOException occured: " + e);
			 i=2;
		}
		  if(i==2) {
          int total_amount = 100;
		  System.out.println("\n\nAs you didn't order any thing, your total amount is total_amount/0 gives Unchecked Exception --> ");
		  System.out.println((total_amount/0));
		}
		
	}

}
