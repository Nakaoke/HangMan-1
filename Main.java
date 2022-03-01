//https://us02web.zoom.us/j/81203032627?pwd=TGluekhBNmlMOU4vOVdzalpSNG50QT09

class Main {
  public static void main(String[] args) {
    // System.out.println("Hello world!");
    /*
     * THis is a comment too
     */

    int i = 0;
    System.out.println(i);

	// if statement - conditional (what's in parentheses)
    if (i == 0) { 
		System.out.println("i is zero."); 
	} 
	else if(i < 10) {
		System.out.println("i is less than 10 but not zero");
    } 
	else {
      System.out.println("i is not zero");
    }

	// this is a for loop
	for(int j=0 ; j<10 ; j++) {
		if(j % 2 == 0) {
			// Only print the even numbers
			System.out.println(j);
		}
	}

	/*
	+ - Addition
	- - Subtraction
	* - Multiplication
	/ - Division
	% - MOD (remainder)
	** - exponent
	*/

	// this is a while loop
	int k=0;
	while(k < 10) {
		System.out.println(k);
		k++;
	}

	// this is a do while loop
	int l=0;
	do {
		System.out.println(l);
		l++;
	} while(l<10);


	// this is a logical AND operator
	// if(a == 1 && b == 2) {
	// 	// For this
	// }
  // this is a logical OR operator
	// if(a == 1 || b == 2 || c == 3) {
	// 	// this gets executed
	// }

	//These are datatypes

	// character
	char ch = 'A';
	System.out.println("ch = " + ch);

	String name="Veler Brown";
	char [] ch_name = {'V','e','l','e','r'};

	// + operator on strings is concatenate (to string things together)
	String team_name = "Java Team";
	System.out.println("Team Name = " + team_name);

	byte b = 25; // 8 bits
	int n = 500; // integer

	float f=3.14f; // 4 bytes
	double bignumber = 3.1415926535; // 8 bytes

	// true or false
	boolean flag = true;

	// What is the difference betwen logial and bitwise
	// && - logical AND
	// & - bitwise AND

	// || - logical OR
	// | - bitwise OR

	// Decimal is base 10

	// Coding a binary - base 2 
	int arg_a = 0b10101110;
	int arg_b = 0b11001100;

	// Hexadecimal is base 16
	int arg_c = 0xFF;
	int arg_d = 0x00;


	int age = 21;
	// System.out.println("This is a string");
	// System.out.println("Curlen is " + age);
	System.out.printf("Curlen is %d", age);
	String binstring = Integer.toBinaryString(age);
	System.out.println("Age in Binary" + binstring);



  }
}