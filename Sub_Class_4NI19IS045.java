package project_import;       //package containing Sub class program file

import java.io.IOException;      //importing IOException utility
import java.util.Scanner;        //importing Scanner utility

   //SubClass with singlelevle inheritance
public class Totalitems extends FoodMenu{
	
	 Scanner sn;      //declaring Scanner object
	 
	          //declaring and defining method which throws IOException
	public int items() throws IOException {
		
		System.out.println("**************** TOTAL ITEMS IN THE CART ***************\n");
		 sn = new Scanner(System.in);    //defining sn Scanner object
		
		
		int d[] = new int[30], e[]= new int[30], f[] = new int[30] ;
		int q=g+h+j, sum=0;
		System.out.println("Total items in the cart = "+q);
		
		System.out.println("\nStarters: "+g+"\n");
		if(g!=0) {
		for(int i=0;i<g;i++) {
			if(a[i]==6) { System.out.println("6.Aloo Tikka ------------------------------- Rs.205/-\n"); d[i] = 205; }
			if(a[i]==7) { System.out.println("7.Mushroom Tikka --------------------------- Rs.240/-\n"); d[i] = 240; }
			if(a[i]==8) { System.out.println("8.Chicken 65 ------------------------------- Rs.265/-\n"); d[i] = 265; }
			if(a[i]==9) { System.out.println("9.Chicken Pepper Fry ----------------------- Rs.265/-\n"); d[i] = 265; }
			if(a[i]==10) { System.out.println("10.Chicken Kabab --------------------------- Rs.275/-\n");d[i] = 275; }
			
		  }
		}
		
		System.out.println("\nMain Course: "+h+"\n");
		if(h!=0) {
			for(int i=0;i<h;i++) {
				if(b[i]==11) { System.out.println("11.Paneer Pepper Bhurji-------------------------- Rs.220/-\n"); e[i] = 220; }
				if(b[i]==12) { System.out.println("12.Chicken Masala --------------------------------Rs.275/-\n"); e[i] = 275; }
				if(b[i]==13) { System.out.println("13.Roti ------------------------------------------Rs.50/-\n"); e[i] = 50; }
				if(b[i]==14) { System.out.println("14.Veg Biryani -----------------------------------Rs.215/-\n"); e[i] = 215; }
				if(b[i]==15) { System.out.println("15.Chicken Biryani -------------------------------Rs.275/-\n"); e[i] = 275; }
			}
		}
		
		System.out.println("\nDesserts and Beverages: "+j+"\n");
		if(j!=0) {
			for(int i=0;i<j;i++) {
				if(c[i]==16) { System.out.println("16.Gulab Jamun -------------------------------------------- Rs.70/-\n"); f[i] = 70; }
				if(c[i]==17) { System.out.println("17.Vanilla Ice Cream -------------------------------------- Rs.110/-\n"); f[i] = 110; }
				if(c[i]==18) { System.out.println("18.Strawberry Ice Cream ------------------------------------Rs.110/-\n"); f[i] = 110 ;}
				if(c[i]==19) { System.out.println("19.Butterscotch Milkshake ----------------------------------Rs.155/-\n"); f[i] = 155; }
				if(c[i]==20) { System.out.println("20.Mango Milkshake ---------------------------------------- Rs.155/-\n"); f[i] = 155; }
			}
		}
		for(int i=0; i<=q; i++) {
			sum = sum + d[i] + e[i] + f[i];
		}
		System.out.println("\nTotal Amount = Rs."+sum+"/-\n");
		System.out.println("\nEnter the option from below\n");
		System.out.println("1.Place Order\n\n0.Back to Menu\n");
		
		int z = sn.nextInt();

		if(z==1) {
			System.out.println("************************** THANK YOU FOR ORDERING!!! ***************************\n");
			System.out.println("**************** PLEASE WAIT PATIENTLY TILL THE FOOD ARRIVES *******************\n");
			
			return 1;
			
		}
		else if(z==0) {
			
			return 0;
		    }
		else
		{
			throw new IOException("Sorry Invalid Order :(");           //throwing IOException
			 
			 
		}
		
	 
	}
	  
	  //method for closing Scanner objects
	public void close(){
		sc.close();
		sn.close();
	}
	
}
