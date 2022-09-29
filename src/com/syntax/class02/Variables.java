package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="Tom";
String lastname="Cruise";
String grade="A";
String city="Denver";
String state="Colorado";
int phonenumber=1234567890;

System.out.println("My name is " + name + " and my last name is " + lastname + " I am " + grade + " student. I live in " + city + " and " + state + " and my phone number is " + phonenumber);

//changes

city="Clevaland";
state="Ohio";
grade="B";
phonenumber=1023456789;

System.out.println("My name is "+name+" and my last name is "+lastname+" I am " + grade + " student. I live in " + city + " and " + state + " and my phone number is " + phonenumber);

name = "Tom";
lastname = "Cruise";
grade ="C";
city = "Washington";
state = "DC";
phonenumber =1234567899;

System.out.println("My name is "+name);
System.out.println("I am "+grade+" grade student");
System.out.println("I live in city "+city);
System.out.println("And my phone number is "+phonenumber);

//Changes
city="Fairfax";
state="VA";
phonenumber=1234567876;
grade ="A";

System.out.println("My name is "+name);
System.out.println("I am "+grade+" grade student");
System.out.println("I live in city "+city);
System.out.println("And my phone number is "+phonenumber);
System.out.println("My name is "+name+" and I moved to a new city "+city+" and new state "+state);
System.out.println("My new phone number is "+phonenumber);

//Rules for identifiers=names (variables, methods, classes)
//1. cannot use keywords as identifiers
//String new ="Hello"; -> error

//2. cannot have spaces in identifiers
//string last name="smith"

//3. Identifiers cannot start with numbers
//int 1number=123;
int number1=123; //number can be anywhere after identifier

/* 4. Identifiers cannot contain any special characters
 * except $ or _
 */

boolean hello!=true;







	}

}
