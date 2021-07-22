package project_import;     //package containing Super class program file

import java.io.IOException;       //importing IOException utility
import java.util.Scanner;         //importing Scanner utility

    //SuperClass
public class FoodMenu{    
	
	  //InstanceVariables with respective access specifiers
	public int m,n;
	public int g=0, h=0, j=0,u=0,v=0,y=0;
	protected int a[]= new int[30],b[]= new int[30],c[] = new int[30],r[],s[],t[];
	protected Scanner sc;
	  
	   //Default Constructor
	FoodMenu(){
		
		System.out.println("============================================================================================");
		System.out.println("********************************* Welcome to Hotel Ruchi ************************************");
		System.out.println("============================================================================================\n");
		
	}
	 
	            //declaring and defining methods which throws IOException
	    public void welcome() throws IOException {       
	    	  sc = new Scanner(System.in);          //defining sc Scanner object
	    	 
	    	 System.out.println("Please enter the option from below\n");
	 		System.out.println("1. Food Menu\n"
	 				+ "\r\n"
	 				+ "2. Total items in the cart\n");
	 		     m = sc.nextInt();
		 		if(m==1) { 
		 			MainMenu();
		 		}
		 		if(m==2) {
		 			return;
		 		}
		 		else
				{
					throw new IOException("Sorry Invalid Order :(");     //throwing IOException
				}
		 		
		 		
	    }
	  
	     void MainMenu() throws IOException{
		
		   System.out.println("Please enter the food course from below\n");
           System.out.println("3.Starters (5)\r\n"
					+ "\n"
					+ "4.Main Course (5)\r\n"
					+ "\n"
					+ "5.Desserts and Beverages (5)\n"
					+ "\n"
					+ "0.Back to Main Menu\n");
			          
		              n = sc.nextInt();      //taking integer type input
		              
		                //calling methods
		             if(n==3) starters();
		             else if(n==4) MainCourse();
		             else if(n==5) DandB();
		             else if(n==0) welcome();
		             
		             else
						{
							throw new IOException("Sorry Invalid Order :(");      //throwing IOException
						}
		             
	       }
	     
	   
	     void starters() throws IOException{
	    	          
	    	          System.out.println("STARTERS");
	            System.out.println("\nNO.   ITEMS                                  PRICE\n\n" 
	                   		     + "6.Aloo Tikka ------------------------------- Rs.205/-\n"
		 	                     + "\n7.Mushroom Tikka --------------------------- Rs.240/-\n"
			                     + "\n8.Chicken 65 ------------------------------- Rs.265/-\n"
			                     + "\n9.Chicken Pepper Fry ----------------------- Rs.265/-\n"
			                     + "\n10.Chicken Kabab --------------------------- Rs.275/-\n"
			                     + "\n0.Back\n");
	                  
	                             System.out.println("How many starters you want to add?\n");
                                 int l = sc.nextInt();     //taking integer type input
                                 g=g+l;
                                 
                                 if(l==0) 
                                	 MainMenu();
                                 
                                  
                                 System.out.println("Please enter the item numbers\n");
                                 for(int i=u;i<g;i++)
                                {
                     	         this.a[i]=sc.nextInt();        //using 'this' pointer to instance variable
                                 }
                                 u=l;
                                 
                                 System.out.println("Items added to cart!!\n");	                  
	                             
	                             System.out.println("Do you want to add more or go back to menu?\n");
	                             System.out.println("1.Add\n2.Back to Menu\n");
	                             int p = sc.nextInt();
	                             
	                                 //calling methods
	                             if(p==1) {
	                            	 starters();
	                             }
	                             else if(p==2) {
	                                 MainMenu();
	                             }
	                             else
	             				{
	             					throw new IOException("Sorry Invalid Order :(");    //throwing IOException
	             				}
	                             
	                             
	                 }       
	                             
	                             
	       void MainCourse() throws IOException {
	    	   
	    	                    
	    	                    System.out.println("MAIN COURSE");
	            System.out.println("\nNO.   ITEMS                                       PRICE\n\n"
	                             + "\n11.Paneer Pepper Bhurji-------------------------- Rs.220/-\n"
			                     + "\n12.Chicken Masala --------------------------------Rs.275/-\n"
			                     + "\n13.Roti ------------------------------------------Rs.50/-\n"
			                     + "\n14.Veg Biryani -----------------------------------Rs.215/-\n"
			                     + "\n15.Chicken Biryani -------------------------------Rs.275/-\n"
			                     + "\n0.Back\n");
	                            
	                            System.out.println("How many Main Course you want to add?\n");
                                int x = sc.nextInt();        //taking integer type input
                                h=h+x;
                                
                                if(x==0) 
                                	MainMenu();
                                
                                 
                                System.out.println("Please enter the item numbers\n");
                                for(int i=v;i<h;i++)
                               {
                    	         this.b[i]=sc.nextInt();            //using 'this' pointer to instance variable
                                }
                                v=x;
                                System.out.println("Items added to cart!!\n");	                  
	                             
	                             System.out.println("Do you want to add more or go back to menu?\n");
	                             System.out.println("1.Add\n2.Back to Menu\n");
	                             int z = sc.nextInt();
	                             
	                                   //calling methods
	                             if(z==1) {
	                            	 MainCourse();
	                             }
	                             else if(z==2) {
	                                 MainMenu();
	                             }
	                             else 
	                                 {
	             					throw new IOException("Sorry Invalid Order :(");       //throwing IOException
	             				}
	                            
	                            
	                     }
	       
	        void DandB() throws IOException {
	        	                
	                            System.out.println("DESSERTS AND BEVERAGES");
	            System.out.println("\nNO. ITEMS                                                   PRICE\n\n"
	                             + "\n16.Gulab Jamun -------------------------------------------- Rs.70/-\n"
			                     + "\n17.Vanilla Ice Cream -------------------------------------- Rs.110/-\n"
			                     + "\n18.Strawberry Ice Cream ------------------------------------Rs.110/-\n"
			                     + "\n19.Butterscotch Milkshake ----------------------------------Rs.155/-\n"
			                     + "\n20.Mango Milkshake ---------------------------------------- Rs.155/-\n"
			                     + "\n0.Back\n");
	                 
	                            System.out.println("How many Desserts and Beverages you want to add?\n");
                                 int k = sc.nextInt();       //taking integer type input
                                j=j+k;
                                 
                                if(k==0)
                                	MainMenu();
                                
                                
                                System.out.println("Please enter the item numbers\n");
                                for(int i=y;i<j;i++)
                               {
                    	         this.c[i]=sc.nextInt();        //using 'this' pointer to instance variable
                                }
                                y=j;
                                
                                System.out.println("Items added to cart!!\n");	                  
	                             
	                             System.out.println("Do you want to add more or go back to menu?\n");
	                             System.out.println("1.Add\n2.Back to Menu\n");
	                             int f = sc.nextInt();
	                             
	                                  //calling methods
	                             if(f==1) {
	                            	 DandB();
	                             }
	                             else if(f==2) {
	                                 MainMenu();
	                             }
	                             else
	             				{
	             					throw new IOException("Sorry Invalid Order :(");      //throwing IOException
	             				}
	                            	                            
	                            
	              }
	        
  }



	