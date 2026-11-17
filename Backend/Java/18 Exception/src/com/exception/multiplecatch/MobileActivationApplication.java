/*Q4 – Mobile Activation Application
Create a Mobile class using the following methods:
- doActivateNum(String mobileNum)
- validateNumDetails(String mobileNum)
- checkNetwork()
- showMobileDetails(String mobileNum)
Requirements:
1. Check whether mobile number starts with "620".
2. Find mobile number length.
3. Extract the first five digits using substring().
4. Access a character using charAt().
5. Handle these exceptions using multiple catch blocks:
   - NullPointerException
   - StringIndexOutOfBoundsException
6. Print "Mobile activation process completed".
Important: Exception naturally generate hone dena. throw use mat karna.*/


package com.exception.multiplecatch;


// Driver Class
public class MobileActivationApplication {

    public static void main(String[] args) {

        Mobile mobile = new Mobile();

        String mobileNum = "610865678";

        try {
            mobile.doActivateNum(mobileNum);
            mobile.checkNetwork();
            mobile.showMobileDetails(mobileNum);
        }
        catch (NullPointerException e) {
            System.out.println("Mobile number cannot be null");
            e.printStackTrace();
        }
        catch (StringIndexOutOfBoundsException e) {
        	System.out.println("Invalid mobile number length");
            e.printStackTrace();
        }
        catch (Exception e) {
			System.out.println("Unknown Exception");
            e.printStackTrace();
		}
        
        System.out.println("Mobile activation process completed");

    }

}

class Mobile {

    public void doActivateNum(String mobileNum) {

        System.out.println("Mobile.doActivateNum() Start");

        validateNumDetails(mobileNum);

        System.out.println("Number is Activated");

        System.out.println("Mobile.doActivateNum() End");

    }

    private void validateNumDetails(String mobileNum) {

        System.out.println("Mobile.validateNumDetails() Start");

        boolean startWith = mobileNum.startsWith("620");
        
        if(mobileNum.startsWith("620")) {
        	System.out.println("It is Valid Number");
        }else {
        	System.err.println("It is not valid Number");
        }

        String firstFive = mobileNum.substring(0, 5);
        System.out.println("First five digits: " + firstFive);

        char access = mobileNum.charAt(6);
        System.out.println("Character at index 6: " + access);

        System.out.println("Mobile.validateNumDetails() End");

    }

    public void checkNetwork() {

        System.out.println("Network is good");

    }

    public void showMobileDetails(String mobileNum) {

        System.out.println("Mobile Number: " + mobileNum);

    }

}
