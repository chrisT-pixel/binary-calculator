import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		System.out.println("Author: Chris Taylor");
		System.out.println("Student ID: 110352632");
		System.out.println("Email ID: taycr003");
		System.out.println("This is my own work as defined by the University's Academic Misconduct Policy. \n");
		
		Calculator c = new Calculator();
		
		System.out.println("NOR");
		System.out.println("x y Z");
		System.out.println("-----");
		System.out.println("0 0 " + c.NOR(0, 0));
		System.out.println("0 1 " + c.NOR(0, 1));
		System.out.println("1 0 " + c.NOR(1, 0));
		System.out.println("1 1 " +  c.NOR(1, 1)+ "\n");
		
		System.out.println("ADDITION");
		System.out.println("c x y Z C");
		System.out.println("----------");
		System.out.println("0 0 0 " + c.ADD_BIT(0, 0, 0) + " " + c.CARRY_BIT(0, 0, 0));
		System.out.println("0 0 1 " + c.ADD_BIT(0, 1, 0) + " " + c.CARRY_BIT(0, 1, 0));
		System.out.println("0 1 0 " + c.ADD_BIT(1, 0, 0) + " " + c.CARRY_BIT(1, 0, 0));
		System.out.println("0 1 1 " + c.ADD_BIT(1, 1, 0) + " " + c.CARRY_BIT(1, 1, 0));
		System.out.println("1 0 0 " + c.ADD_BIT(0, 0, 1) + " " + c.CARRY_BIT(0, 0, 1));
		System.out.println("1 0 1 " + c.ADD_BIT(0, 1, 1) + " " + c.CARRY_BIT(0, 1, 1));
		System.out.println("1 1 0 " + c.ADD_BIT(1, 0, 1) + " " + c.CARRY_BIT(1, 0, 1));
		System.out.println("1 1 1 " + c.ADD_BIT(1, 1, 1) + " " + c.CARRY_BIT(1, 1, 1) + "\n");
		
		System.out.println("SUBTRACTION");
		System.out.println("b x y Z B");
		System.out.println("----------");
		System.out.println("0 0 0 " + c.SUB_BIT(0, 0, 0) + " " + c.BORROW_BIT(0, 0, 0));
		System.out.println("0 0 1 " + c.SUB_BIT(0, 1, 0) + " " + c.BORROW_BIT(0, 1, 0));
		System.out.println("0 1 0 " + c.SUB_BIT(1, 0, 0) + " " + c.BORROW_BIT(1, 0, 0));
		System.out.println("0 1 1 " + c.SUB_BIT(1, 1, 0) + " " + c.BORROW_BIT(1, 1, 0));
		System.out.println("1 0 0 " + c.SUB_BIT(0, 0, 1) + " " + c.BORROW_BIT(0, 0, 1));
		System.out.println("1 0 1 " + c.SUB_BIT(0, 1, 1) + " " + c.BORROW_BIT(0, 1, 1));
		System.out.println("1 1 0 " + c.SUB_BIT(1, 0, 1) + " " + c.BORROW_BIT(1, 0, 1));
		System.out.println("1 1 1 " + c.SUB_BIT(1, 1, 1) + " " + c.BORROW_BIT(1, 1, 1) + "\n");
		
		System.out.println("LESS_THAN");
		System.out.println("l x y L");
		System.out.println("-------");
		System.out.println("0 0 0 " + c.LESS_THAN(0, 0, 0));
		System.out.println("0 0 1 " + c.LESS_THAN(0, 1, 0));
		System.out.println("0 1 0 " + c.LESS_THAN(1, 0, 0));
		System.out.println("0 1 1 " + c.LESS_THAN(1, 1, 0));
		System.out.println("1 0 0 " + c.LESS_THAN(0, 0, 1));
		System.out.println("1 0 1 " + c.LESS_THAN(0, 1, 1));
		System.out.println("1 1 0 " + c.LESS_THAN(1, 0, 1));
		System.out.println("1 1 1 " + c.LESS_THAN(1, 1, 1));
		
		while(true){
		    
			System.out.println("\nChoose operation [+, -, q]");
			Scanner input = new Scanner(System.in);
		    String choice = input.nextLine();
		    
		    if(choice.equals("q")) {
		    	break;
		    }
		    
		    else if(choice.equals("+")) {
		    	
		    	//validate X input
		    	boolean xValidityFlag = false;
		    	System.out.println("\nX:\n");
		    	String xString = input.nextLine();
		    	
		    	for (int i = 0; i < xString.length(); i++) {
		            
		    		if(xString.charAt(i) == '0' || xString.charAt(i) == '1') {
		    			xValidityFlag = true;
		    		}
		    		
		    		else {
		    			
		    			xValidityFlag = false;
		    			break;
		    		}
		        }
		    	
		    	while(!xValidityFlag) {
		    		
		    		System.out.println("Not a binary number!");
		    		
		    		xValidityFlag = false;
			    	System.out.println("\nX:\n");
			    	xString = input.nextLine();
			    	
			    	for (int i = 0; i < xString.length(); i++) {
			            
			    		if(xString.charAt(i) == '0' || xString.charAt(i) == '1') {
			    			xValidityFlag = true;
			    			
			    		}
			    		
			    		else {
			    			
			    			xValidityFlag = false;
			    			break;
			    		}
			        }
		    	}
		    	
		    	//X is validated so convert X string to array
		    	int[] xDigits = xString.chars().map(num -> num-'0').toArray();
		    	
		    	//determine length of X array
		    	int xLength = xDigits.length;
		    	
		    	boolean yValidityFlag = false;
		    	System.out.println("\nY:\n");
		    	String yString = input.nextLine();
		    	
		    	for (int i = 0; i < yString.length(); i++) {
		            
		    		if(yString.charAt(i) == '0' || yString.charAt(i) == '1') {
		    			yValidityFlag = true;
		    		}
		    		
		    		else {
		    			
		    			yValidityFlag = false;
		    			break;
		    		}
		        }
		    	
		    	//validate Y input
		    	while(!yValidityFlag) {
		    		
		    		System.out.println("Not a binary number!");
		    		
		    		yValidityFlag = false;
			    	System.out.println("\nY:\n");
			    	yString = input.nextLine();
			    	
			    	for (int i = 0; i < yString.length(); i++) {
			            
			    		if(yString.charAt(i) == '0' || yString.charAt(i) == '1') {
			    			yValidityFlag = true;
			    			
			    		}
			    		
			    		else {
			    			
			    			yValidityFlag = false;
			    			break;
			    		}
			        }
		    	}
		    	
		    	
		    	
		    	//Y is validated so convert Y string to array
		    	int[] yDigits = yString.chars().map(num -> num-'0').toArray();
		    	
		    	//determine length of Y array
		    	int yLength = yDigits.length;
		    	
		    	//determine if there is a difference in array lengths
		    	int sizeDifference = xLength - yLength;
		    	
		    	int sameLengthXDigits[];
		    	int sameLengthYDigits[];
		    	
		    	//X array is larger, so we need to increase size of y before copying 
		    	if(sizeDifference > 0) {
		    		
		    		sameLengthYDigits = new int[yLength + sizeDifference];
		    		
		    		for(int i = 0; i < sizeDifference; i++) {
		    			sameLengthYDigits[i] = 0;
		    		}
		    		
		    		for(int i = sizeDifference; i < sameLengthYDigits.length; i ++) {
		    			sameLengthYDigits[i] = yDigits[i - sizeDifference];
		    		}
		    		
		    		//copy X array 
		    		sameLengthXDigits = new int[xLength];
		    		for(int i = 0; i < xLength; i++) {
		    			sameLengthXDigits[i] = xDigits[i];
		    		}
		    		
		    		
		    	}
		    	
		    	//Y array is larger, so we need to increase size of X
		    	else if(sizeDifference < 0) {
		    		
		    		sizeDifference = Math.abs(sizeDifference);
		    		
		    		sameLengthXDigits = new int[xLength + sizeDifference];
		    		
		    		for(int i = 0; i < sizeDifference; i++) {
		    			sameLengthXDigits[i] = 0;
		    		}
		    		
		    		for(int i = sizeDifference; i < sameLengthXDigits.length; i ++) {
		    			sameLengthXDigits[i] = xDigits[i - sizeDifference];
		    		}
		    		
		    		//copy Y array 
		    		sameLengthYDigits = new int[yLength];
		    		for(int i = 0; i < yLength; i++) {
		    			sameLengthYDigits[i] = yDigits[i];
		    		}
		    	
		    	}
		    	
		    	//straight copy - both arrays are the same size
		    	else {
		    		
		    		sameLengthXDigits = new int[xLength];
		    		for(int i = 0; i < xLength; i++) {
		    			sameLengthXDigits[i] = xDigits[i];
		    		}
		    		
		    		sameLengthYDigits = new int[yLength];
		    		for(int i = 0; i < yLength; i++) {
		    			sameLengthYDigits[i] = yDigits[i];
		    		}
		    		
		    		
		    		
		    	}
		    	
		    	int carry = 0;
		    	int[] result = new int[sameLengthXDigits.length];
		    	
		    	//loop backwards, starting from least significant bit
		    	for (int i = sameLengthXDigits.length - 1; i >= 0; i--) {
		    	
		    		//cannot be anything to carry during first iteration
		    		if(i == sameLengthXDigits.length - 1) {
		    			result[i] = c.ADD_BIT(sameLengthXDigits[i], sameLengthYDigits[i], carry);
		    			carry = c.CARRY_BIT(sameLengthXDigits[i], sameLengthYDigits[i], 0);
		    		}
		    			
		    			
		    		else {
		    				
		    			carry = c.CARRY_BIT(sameLengthXDigits[i + 1], sameLengthYDigits[i + 1], carry);
		    			result[i] = c.ADD_BIT(sameLengthXDigits[i], sameLengthYDigits[i], carry);
		    		}
		    			
		    		
		    	}
		    	
		    	if (carry != 0) {
		    	    // If there is still a carry bit after the loop, add it to the result
		    	    int[] newResult = new int[sameLengthXDigits.length + 1];
		    	    newResult[0] = carry;
		    	    System.arraycopy(result, 0, newResult, 1, sameLengthXDigits.length);
		    	    result = newResult;
		    	}
		    	
		    	//begin output result without leading zeros from shorter number
		    	int formattingSizeDifference = xLength - yLength;
		    	
		    	//Y array is larger, so we need to add space for X's formatting
		    	if(formattingSizeDifference < 0) {
		    		for(int i = 0; i < Math.abs(formattingSizeDifference) + 3; i++) {
		    			System.out.print(" ");
		    		}
		    	}
		    	
		    	else {
		    		System.out.print("   ");
		    	}
		    	
		    	for (int i = 0; i < xDigits.length; i++) {
		    		  System.out.print(xDigits[i]);
		    	}
		    	
		    	System.out.print("\n");
		    	System.out.print("+");
		    	
		    	//X array is larger, so we need to add space for Y's formatting
		    	if(formattingSizeDifference > 0) {
		    		for(int i = 0; i < formattingSizeDifference + 2; i++) {
		    			System.out.print(" ");
		    		}
		    	}
		    	
		    	else {
		    		System.out.print("  ");
		    	}
		    	
		    	//print original y array (before setting to same size) for output purposes
		    	for (int i = 0; i < yDigits.length; i++) {
		    		  System.out.print(yDigits[i]);
		    	}
		    	
		    	System.out.print("\n");
		    	
		    	for (int i = 0; i < sameLengthXDigits.length + 3; i++) {
		    		  System.out.print("-");
		    	}
		    	
		    	System.out.println("\n");
		    	System.out.print("   ");
		    	
		    	for (int i = 0; i < result.length; i++) {
		    		  System.out.print(result[i]);
		    		}
		    	
		    	
		    	System.out.println("\n");
		    }
		    
		    //user wants to subtract
		    else if(choice.equals("-")) {
		    	
		    	//validate input
		    	boolean xValidityFlag = false;
		    	System.out.println("\nX:\n");
		    	String xString = input.nextLine();
		    	
		    	for (int i = 0; i < xString.length(); i++) {
		            
		    		if(xString.charAt(i) == '0' || xString.charAt(i) == '1') {
		    			xValidityFlag = true;
		    		}
		    		
		    		else {
		    			
		    			xValidityFlag = false;
		    			break;
		    		}
		        }
		    	
		    	while(!xValidityFlag) {
		    		
		    		System.out.println("Not a binary number!");
		    		
		    		xValidityFlag = false;
			    	System.out.println("\nX:\n");
			    	xString = input.nextLine();
			    	
			    	for (int i = 0; i < xString.length(); i++) {
			            
			    		if(xString.charAt(i) == '0' || xString.charAt(i) == '1') {
			    			xValidityFlag = true;
			    			
			    		}
			    		
			    		else {
			    			
			    			xValidityFlag = false;
			    			break;
			    		}
			        }
		    	}
		    	
		    	//convert X string to array
		    	int[] xDigits = xString.chars().map(num -> num-'0').toArray();
		    	
		    	//determine length of X array
		    	int xLength = xDigits.length;
		    	
		    	boolean yValidityFlag = false;
		    	System.out.println("\nY:\n");
		    	String yString = input.nextLine();
		    	
		    	for (int i = 0; i < yString.length(); i++) {
		            
		    		if(yString.charAt(i) == '0' || yString.charAt(i) == '1') {
		    			yValidityFlag = true;
		    		}
		    		
		    		else {
		    			
		    			yValidityFlag = false;
		    			break;
		    		}
		        }
		    	
		    	while(!yValidityFlag) {
		    		
		    		System.out.println("Not a binary number!");
		    		
		    		yValidityFlag = false;
			    	System.out.println("\nY:\n");
			    	yString = input.nextLine();
			    	
			    	for (int i = 0; i < yString.length(); i++) {
			            
			    		if(yString.charAt(i) == '0' || yString.charAt(i) == '1') {
			    			yValidityFlag = true;
			    			
			    		}
			    		
			    		else {
			    			
			    			yValidityFlag = false;
			    			break;
			    		}
			        }
		    	}
		    	
		    	//both X & Y input validated
		    	
		    	//convert Y string to array
		    	int[] yDigits = yString.chars().map(num -> num-'0').toArray();
		    	
		    	//determine length of Y array
		    	int yLength = yDigits.length;
		    	
		    	//determine if there is a difference in array lengths
		    	int sizeDifference = xLength - yLength;
		    	
		    	int sameLengthXDigits[];
		    	int sameLengthYDigits[];
		    	
		    	//X array is larger, so we need to increase size of y before copying 
		    	if(sizeDifference > 0) {
		    		
		    		sameLengthYDigits = new int[yLength + sizeDifference];
		    		
		    		for(int i = 0; i < sizeDifference; i++) {
		    			sameLengthYDigits[i] = 0;
		    		}
		    		
		    		for(int i = sizeDifference; i < sameLengthYDigits.length; i ++) {
		    			sameLengthYDigits[i] = yDigits[i - sizeDifference];
		    		}
		    		
		    		//copy X array 
		    		sameLengthXDigits = new int[xLength];
		    		for(int i = 0; i < xLength; i++) {
		    			sameLengthXDigits[i] = xDigits[i];
		    		}
		    		
		    		
		    	}
		    	
		    	//Y array is larger, so we need to increase size of X
		    	else if(sizeDifference < 0) {
		    		
		    		sizeDifference = Math.abs(sizeDifference);
		    		
		    		sameLengthXDigits = new int[xLength + sizeDifference];
		    		
		    		for(int i = 0; i < sizeDifference; i++) {
		    			sameLengthXDigits[i] = 0;
		    		}
		    		
		    		for(int i = sizeDifference; i < sameLengthXDigits.length; i ++) {
		    			sameLengthXDigits[i] = xDigits[i - sizeDifference];
		    		}
		    		
		    		//copy Y array 
		    		sameLengthYDigits = new int[yLength];
		    		for(int i = 0; i < yLength; i++) {
		    			sameLengthYDigits[i] = yDigits[i];
		    		}
		    	
		    	}
		    	
		    	//straight copy - both arrays are the same size
		    	else {
		    		
		    		sameLengthXDigits = new int[xLength];
		    		for(int i = 0; i < xLength; i++) {
		    			sameLengthXDigits[i] = xDigits[i];
		    		}
		    		
		    		sameLengthYDigits = new int[yLength];
		    		for(int i = 0; i < yLength; i++) {
		    			sameLengthYDigits[i] = yDigits[i];
		    		}
		    		
		    	}
		    	
		    	
		    	//if y is larger then reverse them and perform everything else the same
		    	//we then add a negative sign in the output
		    	
		    	//convert each array into a long number so we can see if Y is larger than X
		    	long xBinaryAsInt = 0;
		    	long yBinaryAsInt = 0;
		    	boolean yIsLarger;
		    	
		    	for (int i = 0; i < sameLengthXDigits.length; i++) {
		    		xBinaryAsInt = xBinaryAsInt * 10 + sameLengthXDigits[i];
		    	}
		    	
		    	for (int i = 0; i < sameLengthYDigits.length; i++) {
		    		yBinaryAsInt = yBinaryAsInt * 10 + sameLengthYDigits[i];
		    	}
		    	
		    	// Y is larger, so reverse them
		    	if(yBinaryAsInt > xBinaryAsInt) {
		    		
		    		int xToCopy[] = Arrays.copyOf(sameLengthXDigits, sameLengthXDigits.length);
		    		int yToCopy[] = Arrays.copyOf(sameLengthYDigits, sameLengthYDigits.length);
		    		
		    		sameLengthXDigits = Arrays.copyOf(yToCopy, yToCopy.length);
		    		sameLengthYDigits = Arrays.copyOf(xToCopy, xToCopy.length);
		    		yIsLarger = true;
		    	}
		    	
		    	else {
		    		yIsLarger = false;
		    	}
		    	
		    	
		    	int lent = 0;
		    	int[] result = new int[sameLengthXDigits.length];
		    	
		    	//loop backwards, starting from least significant bit
		    	for (int i = sameLengthXDigits.length - 1; i >= 0; i--) {
		    	
		    		//cannot be anything already lent during first iteration
		    		if(i == sameLengthXDigits.length - 1) {
		    			result[i] = c.SUB_BIT(sameLengthXDigits[i], sameLengthYDigits[i], lent);
		    			lent = c.BORROW_BIT(sameLengthXDigits[i], sameLengthYDigits[i], 0);
		    		}
		    			
		    			
		    		else {
		    				
		    			lent = c.BORROW_BIT(sameLengthXDigits[i + 1], sameLengthYDigits[i + 1], lent);
		    			result[i] = c.SUB_BIT(sameLengthXDigits[i], sameLengthYDigits[i], lent);
		    		}
		    			
		    		
		    	}
		    	
		    	//begin output result without leading zeros from shorter number
		    	int formattingSizeDifference = xLength - yLength;
		    	
		    	//Y array is larger, so we need to add space for X's formatting
		    	if(formattingSizeDifference < 0) {
		    		for(int i = 0; i < Math.abs(formattingSizeDifference) + 3; i++) {
		    			System.out.print(" ");
		    		}
		    	}
		    	
		    	else {
		    		System.out.print("   ");
		    	}
		    	
		    	for (int i = 0; i < xDigits.length; i++) {
		    		  System.out.print(xDigits[i]);
		    	}
		    	
		    	System.out.print("\n");
		    	System.out.print("-");
		    	
		    	//X array is larger, so we need to add space for Y's formatting
		    	if(formattingSizeDifference > 0) {
		    		for(int i = 0; i < formattingSizeDifference + 2; i++) {
		    			System.out.print(" ");
		    		}
		    	}
		    	
		    	else {
		    		System.out.print("  ");
		    	}
		    	
		    	//print original y array (before setting to same size) for output purposes
		    	for (int i = 0; i < yDigits.length; i++) {
		    		  System.out.print(yDigits[i]);
		    	}
		    	
		    	System.out.print("\n");
		    	
		    	for (int i = 0; i < sameLengthXDigits.length + 3; i++) {
		    		  System.out.print("-");
		    	}
		    	
		    	System.out.println("\n");
		    	
		    	if(yIsLarger) {
		    		System.out.print("  -");
		    	}
		    	
		    	else {
		    		System.out.print("   ");
		    	}
		    	
		    	
		    	for (int i = 0; i < result.length; i++) {
		    		  System.out.print(result[i]);
		    		}
		    	
		    	
		    	System.out.println("\n");
		    	
		    	
		    	
		    }
		    
		    else {
		    	System.out.println("invalid operation! \n");
		    }
		
		}
		
		
	}

}
