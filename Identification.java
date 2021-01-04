//Programmer: Marissa Gonçalves
//Date: September 6, 2017
//Purpose: This program verifies if the UPC code contains numerical digits, from its input.

//import java in order to create an input
import java.util.Scanner;

//compile the program with class
public class Identification

{
	//method to the make the program run
	public static void main (String[]args)

	{
		//define a scanner
		Scanner keyboard = new Scanner (System.in);


        //enter a code of the UPC
        System.out.print ("Enter a UPC: ");


        //non-numeric numbers are not permitted in this program
        if (!keyboard.hasNextLine())
        {
			System.out.println();
			System.out.println ("Error: input contains non-numeric characters.");
			System.out.println();
			System.exit (1);
	    }

        String upc = keyboard.nextLine();



        //the code cannot have more than 12 digits
	    if (upc.length() > 12)
	    {
			System.out.println();
			System.out.println ("Error: input has more than 12 digits.");
			System.out.println();
			System.exit (1);
       	}

        //proceed with a space
        System.out.println();



        //extract one of the characters of the input
        char digit0 = upc.charAt(0);
        System.out.println ("The first digit is " + digit0 + ".");

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit0))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
	    int value0 = Character.getNumericValue (digit0);
	    System.out.println ("The numeric value for the first digit is " + value0 + ".");
        System.out.println();




        //extract one of the characters of the input
        char digit1 = upc.charAt(1);
        System.out.println ("The second digit is " + digit1 + ".");

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit1))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

	    //revert the chosen character into its numerical value
	    int value1 = Character.getNumericValue (digit1);
	    System.out.println ("The numeric value for the second digit is " + value1 + ".");
        System.out.println();





        //extract one of the characters of the input
	    char digit2 = upc.charAt(2);
        System.out.println ("The third digit is " + digit2 + ".");

        //re-examine the chosen character to see if it is a digit
	    if (Character.isDigit (digit2))
		{
		    System.out.println ("The character is a digit.");
	    }
	    else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value2 = Character.getNumericValue (digit2);
	    System.out.println ("The numeric value for the third digit is " + value2 + ".");
        System.out.println();





        //extract one of the characters of the input
        char digit3 = upc.charAt(3);
        System.out.println ("The fourth digit is " + digit3 + ".");

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit3))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value3 = Character.getNumericValue (digit3);
	    System.out.println ("The numeric value for the fourth digit is " + value3 + ".");
        System.out.println();





        //extract one of the characters of the input
        char digit4 = upc.charAt(4);
        System.out.println ("The fifth digit is " + digit4 + ".");

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit4))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value4 = Character.getNumericValue (digit4);
        System.out.println ("The numeric value for the fifth digit is " + value4 + ".");
        System.out.println();





        //extract one of the characters of the input
        char digit5 = upc.charAt(5);
        System.out.println ("The sixth digit is " + digit5 + ".");

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit5))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value5 = Character.getNumericValue (digit5);
	    System.out.println ("The numeric value for the sixth digit is " + value5 + ".");
        System.out.println();





        //extract one of the characters of the input
        char digit6 = upc.charAt(6);
        System.out.println ("The seventh digit is " + digit6 + ".");

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit6))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value6 = Character.getNumericValue (digit6);
	    System.out.println ("The numeric value for the seventh digit is " + value6 + ".");
        System.out.println();






        //extract the one of the characters of the input
        char digit7 = upc.charAt(7);
        System.out.println ("The eighth digit is " + digit7 + ".");

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit7))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value7 = Character.getNumericValue (digit7);
	    System.out.println ("The numeric value for the eighth digit is " + value7 + ".");
        System.out.println();





       //extract one of the characters of the input
        char digit8 = upc.charAt(8);
        System.out.println ("The ninth digit is " + digit8 + ".");

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit8))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value8 = Character.getNumericValue (digit8);
	    System.out.println ("The numeric value for the ninth digit is " + value8 + ".");
        System.out.println();






        //extract one of the characters of the input
        char digit9 = upc.charAt(9);
        System.out.println ("The tenth digit is " + digit9);

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit9))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value9 = Character.getNumericValue (digit9);
	    System.out.println ("The numeric value for the tenth digit is " + value9 + ".");
        System.out.println();





        //extract one of the characters of the input
        char digit10 = upc.charAt(10);
        System.out.println ("The eleventh digit is " + digit10 + ".");

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit10))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value10 = Character.getNumericValue (digit10);
	    System.out.println ("The numeric value for the eleventh digit is " + value10 + ".");
        System.out.println();





        //extract one of the characters of the input
        char digit11 = upc.charAt(11);
        System.out.println ("The twelfth digit is " + digit11);

        //re-examine the chosen character to see if it is a digit
        if (Character.isDigit (digit11))
        {
			System.out.println ("The character is a digit.");
		}
		else
		{
			System.out.println ("The character is not a digit.");
	    }

        //revert the chosen character into its numerical value
        int value11 = Character.getNumericValue (digit11);
	    System.out.println ("The numeric value for the twelfth digit is " + value11 + ".");
        System.out.println();
   }

}



