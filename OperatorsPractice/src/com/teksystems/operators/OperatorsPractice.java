package com.teksystems.operators;

public class OperatorsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		shiftBinaryStringLeft();
		shiftBinaryStringLeft2();
		shiftBinaryStringLeft3();
		shiftBinaryStringLeft4();


		shiftBinaryStringRight();
		shiftBinaryStringRight2();
		shiftBinaryStringRight3();
		shiftBinaryStringRight4();

		calculateBitwiseOperation();
		calculatePostFixOperation();

		incrementVariable();
		calculateIncrementedSum();

	}


	/*
	 * Write the following integers in binary notation. Do not use any Java
	 * functions or online conversion applications to calculate the answer, as this
	 * will hinder the learning process and your understanding of the concept.
	 * However, you may check your answers using Java methods.
	 * 
	 * 
	 * 
	 * 1    ----->    1
	 * 8    ----->    1000
	 * 33   ----->    0100001
	 * 78   ----->    01001110
	 * 787  ----->    01100010011
	 * 33,987 ----->  01000010011000011
	 * 
	 * 
	 * 
	 * 
	 */

	/*
	 * Convert the following binary numbers to decimal notation.
	 * Do not use any Java functions or online conversion applications to calculate the answer,
	 * as this will hinder the learning process and your understanding of the concept.
	 * However, you may check your answers using Java methods.
	 *
	 * 0010           		  ----->   2
	 * 1001           		  ----->   9
	 * 0011 0100       		  ----->   52
	 * 0111 0010      	      ----->   114
	 * 0010 0001 1111  		  ----->   543
	 * 0010 1100 0110 0111    ----->   11367
	 *
	 */


	/*
	 *  Write a program that declares an integer a variable x and assigns the value 2 to it and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
	 *  Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
	 *  Before printing the results, write a comment with the predicted decimal value and binary string. Now, print out x in decimal form and in binary notation.
	 *  Do the preceding exercise with the following values:
	 *  9
	 *  17
	 *  88
	 */



	public  static void  shiftBinaryStringLeft() {
		int x  = 2;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// I predict the value will be 4
		System.out.println("Decimal form: " + x);
		System.out.println("Binary Notation: " + Integer.toBinaryString(x));
		System.out.println();

	}


	public  static void  shiftBinaryStringLeft2() {
		int x  = 9;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// I predict the value will be 18
		System.out.println("Decimal form: " + x);
		System.out.println("Binary Notation: " + Integer.toBinaryString(x));
		System.out.println();

	}


	public  static void  shiftBinaryStringLeft3() {
		int x  = 17;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// I predict the value will be 34
		System.out.println("Decimal form: " + x);
		System.out.println("Binary Notation: " + Integer.toBinaryString(x));
		System.out.println();

	}

	public  static void  shiftBinaryStringLeft4() {
		int x  = 88;
		System.out.println(Integer.toBinaryString(x));
		x = x << 1;
		// I predict the value will be 176
		System.out.println("Decimal form: " + x);
		System.out.println("Binary Notation: " + Integer.toBinaryString(x));
		System.out.println();

	}





	/*

	Write a program that declares a variable x and assigns 150 to it, and prints out the binary string version of the number.
	Now use the right shift operator (>>) to shift by 2 and assign the result to x. Write a comment indicating what you anticipate
	 the decimal and binary values to be. Now print the value of x and the binary string.
	Do the preceding exercise with the following values:
	225
	1555
	32456


	 */

	public  static void  shiftBinaryStringRight() {
		int x  = 150;
		System.out.println(Integer.toBinaryString(x));
		x = x >>2;
		// I predict the value will be 37
		System.out.println("Decimal form: " + x);
		System.out.println("Binary Notation: " + Integer.toBinaryString(x));
		System.out.println();

	}


	public  static void  shiftBinaryStringRight2() {
		int x  = 225;
		System.out.println(Integer.toBinaryString(x));
		x = x >>2;
		// I predict the value will be 56
		System.out.println("Decimal form: " + x);
		System.out.println("Binary Notation: " + Integer.toBinaryString(x));
		System.out.println();

	}


	public  static void  shiftBinaryStringRight3() {
		int x  = 1555;
		System.out.println(Integer.toBinaryString(x));
		x = x >>2;
		// I predict the value will be 388
		System.out.println("Decimal form: " + x);
		System.out.println("Binary Notation: " + Integer.toBinaryString(x));
		System.out.println();

	}

	public  static void  shiftBinaryStringRight4() {
		int x  = 32456;
		System.out.println(Integer.toBinaryString(x));
		x = x >>2;
		// I predict the value will be 8114
		System.out.println("Decimal form: " + x);
		System.out.println("Binary Notation: " + Integer.toBinaryString(x));
		System.out.println();

	}

	/*
	Write a program that declares three int variables x, y, and z. Assign 7 to x and 17 to y.
	 Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y.
	 Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
	Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y.
	As before, write a comment that indicates what you predict the values to be before printing them out.

	 */
	public  static void  calculateBitwiseOperation() {
		int x, y, z;
		x = 7;
		y = 17;

		// I predict the value will be 1

		z = x & y;

		System.out.println("Decimal form for value of x & y: " + z);
		System.out.println("Binary Notation: " + Integer.toBinaryString(z));
		System.out.println();

		z = x | y;

		// I predict the value will be 23
		System.out.println("Decimal form for value of x | y: " + z);
		System.out.println("Binary Notation: " + Integer.toBinaryString(z));
		System.out.println();
	}

	/*

	Write a program that declares an integer variable, assigns a number,
	and uses a postfix increment operator to increase the value.
	Print the value before and after the increment operator.

	 */
	public  static void  calculatePostFixOperation() {
		int x;
		x = 50;
		System.out.println("Value of x: " + x);
		x++;
		System.out.println("New value of x: " + x);
		System.out.println();

	}


	/*


	Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times.
	Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print it again.

	 */

	public  static void  incrementVariable() {
		int x = 3;
		System.out.println("Variable Value  : " + x);

		x++;
		System.out.println("Increment 1 : " + x);
		++x;
		System.out.println("Increment 2 : " + x);
		x+=1;
		System.out.println("Increment 3 : " + x);
		System.out.println();



	}


	/*

	Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y.
	Create another variable sum and assign the value of ++x added to y, and print the result.
	 Notice the value of the sum (should be 14). Now change the increment operator to postfix (x++)
	 and re-run the program. Notice what the value of the sum is.
	  The first configuration incremented x and then calculated the sum,
	  while the second configuration calculated the sum and then incremented x.
	 */

	public  static void calculateIncrementedSum() {

		int x, y;
		x = 5;
		y = 8;
		int sum = (++x) + y;
		System.out.println("The Sum is " + sum);

		x = 5;
		y = 8;
		sum = (x++) + y;

		System.out.println("New sum is: " + sum);
		System.out.println();


	}
}




