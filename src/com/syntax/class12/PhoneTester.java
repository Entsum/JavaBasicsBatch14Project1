package com.syntax.class12;

public class PhoneTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     /*
         * if class whose object we are creating
         * is present inside the same package
         * we don't need to import it.
         */
        PhoneTester iphone=new PhoneTester();
        iphone.make="Apple";
        iphone.model="Iphone 14 Pro Max";
        iphone.year=2022;
        iphone.storage=128;
        iphone.makeCall();

        //new Phone() => To Create the object
        PhoneTester samsungPhone=new PhoneTester();
        samsungPhone.model="S22 Ultra";
        samsungPhone.make="Samsng";
        samsungPhone.year=2022;
        samsungPhone.makeCall();
	}

}
