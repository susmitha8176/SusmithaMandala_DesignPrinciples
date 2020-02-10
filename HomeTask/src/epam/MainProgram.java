package epam;

import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) throws Exception {
		float num1 = 0;
		float num2 = 0;
		Calculator calci = new Calculator();
		System.out.println("SIMPLE CALCULATOR");
		System.out.println("--------------------");
		System.out.println(" OPERATIONS\n");
	        System.out.println("1.ADDITION(+)");
	        System.out.println("2.SUBTRACTION(-)");
	        System.out.println("3.MULTIPLICATION(*)");
	        System.out.println("4.DIVISION(/)");
	        System.out.println("5.EXIT");
	        
	        while(true){
		    	     System.out.println("SELECT AN OPTION(1-5)");
		    	     Scanner sc= new Scanner(System.in);
		    	     int options = sc.nextInt();
		    	     if(options == 5){
		    	    	 System.out.println("Thank you");
		    	    	 break;
		    	     }
		    	     if ((options < 1) || (options > 5)) throw new Exception("please enter only 1-5");
		    	     System.out.println("enter 1st number");
		    	     num1 = sc.nextFloat();
		    	     System.out.println("enter 2nd number");
		    	     num2 = sc.nextFloat(); 
		    	     float[] operations = {calci.Add(num1,num2),calci.Sub(num1,num2),calci.Mul(num1,num2),calci.Div(num1,num2)};  
		    	     System.out.println(operations[options-1]);
	        }
	        
	}

	

}
