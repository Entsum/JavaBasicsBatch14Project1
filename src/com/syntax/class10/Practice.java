package com.syntax.class10;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] week= {"Monday", "Sunday","Tuesday", "Thursday", "Friday"};

        // if day is Sunday -> it is fun day 
        // otherwise - it is a boring day

        for(String day:week) {

            if(day.equals("Sunday")) {
                System.out.println(day+" is a fun day");

            }else if(day.equals("Friday")) {
                System.out.println(day+" is a relax day");

            }else {
                System.out.println(day+" is a boring day");
            }
        }
	}

}
