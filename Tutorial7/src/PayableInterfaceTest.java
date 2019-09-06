/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 */

// Tests interface Payable.

public class PayableInterfaceTest
{
	public static void main(String[] args)
	{
		// create six-element Payable array
		Payable[] payableObjects = new Payable[3];
		
		// populate array with objects that implement Payable
		payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
		payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
		payableObjects[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
		
		System.out.println("Invoices and Employees processed polymorphically:\n");
		
		// generically process each element in array payableObjects
		for (Payable currentPayable : payableObjects)
		{
			// output currentPayable and its appropriate payment amount
			System.out.printf("%s \n", currentPayable.toString());
			
			System.out.printf("%s: $%,.2f\n\n", "payment due", currentPayable.getPaymentAmount());
		} // end for
	} // end main
} // end class PayableInterfaceTest

/*
output:
Invoices and Employees processed polymorphically:

invoice: 
part number: 01234 (seat) 
quantity: 2 
price per item: $375.00 
payment due: $750.00

invoice: 
part number: 56789 (tire) 
quantity: 4 
price per item: $79.95 
payment due: $319.80

salaried employee: John Smith
social security number: 111-11-1111
weekly salary: $800.00 
payment due: $800.00
*/
