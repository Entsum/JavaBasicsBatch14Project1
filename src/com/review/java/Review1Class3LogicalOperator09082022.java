package com.review.java;

public class Review1Class3LogicalOperator09082022 {
	public static void main(String[] args) {
		
		//Logical And &&
        boolean programmer=true;
        boolean manualTester=true;
        boolean knowFramework=true;

        if(programmer&&manualTester&&knowFramework) {
            System.out.print("You can be an automation engineer");
        }
        else
        {
            System.out.println("You must know a pgogramming language, manual testing and some framework"
                    + "to be an automation engineer");
        }

        
        
        System.out.println("=======================================================================");
      
        
        //Logical Or ||
        
        boolean iceCream=false;
        boolean fruit=true;
        boolean tacoTruck=false;

        if(iceCream||fruit||tacoTruck) {
            System.out.println("i am good for midnight snacks");
        }
        else 
        {
            System.out.println("i should buy something for midnight snack");
        }
    }
        
        
        
    }
	
	
             
		

		
