package org.example.duke;

public class AddNumbersClient {
    public static void main (String[] args) {
        try {
           
        	//AddNumbersPortType  port = new AddNumbersService().getAddNumbersPort ();
        	
        	AddNumbersPortType  port = new AddNumbersServiceLocator().getAddNumbersPort();
        	
            int number1 = 10;
            int number2 = 20;
            
            
            System.out.printf ("Invoking addNumbers(%d, %d)\n", number1, number2);
            int result = port.addNumbers (number1, number2);
            System.out.printf ("The result of adding %d and %d is %d.\n\n", number1, number2, result);
            
           /* number1 = -10;
            System.out.printf ("Invoking addNumbers(%d, %d)\n", number1, number2);
            result = port.addNumbers (number1, number2);
            System.out.printf ("The result of adding %d and %d is %d.\n", number1, number2, result);*/
            
            
        } catch (Exception  ex) {
            System.out.printf ("Caught AddNumbersFault_Exception: %s\n", ex.getMessage());
        }
    }
}
