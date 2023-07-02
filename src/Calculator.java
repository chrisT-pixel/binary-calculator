
public class Calculator {
	
	
	public int NOR(int x, int y) {
		
		if(x == 0 && y == 0) {
			return 1;
		}
		
		else if(x == 0 && y == 1) {
			return 0;
		}
		
		else if(x == 1 && y == 0) {
			return 0;
		}
		
		//x == true && y == true
		else { 
			return 0;
		}
		
	}
	
	//based on full adder digital logic (return sum)
	public int ADD_BIT(int x, int y, int c) {
		
		int first = NOR(x,y);
		int second = NOR(x, first);
		int third = NOR(first, y);
		int fourth = NOR(second, third);
		int fifth = NOR(fourth, c);
		int sixth = NOR(fourth, fifth);
		int seventh = NOR(fifth, c);
		int eigth = NOR(sixth, seventh);
		return eigth;
		
		

		
	}
	
	//based on full adder digital logic (return c-out)
	public int CARRY_BIT(int x, int y, int c) {
		
		int first = NOR(x,y);
		int second = NOR(x, first);
		int third = NOR(first, y);
		int fourth = NOR(second, third);
		int fifth = NOR(fourth, c);
		int sixth = NOR(first, fifth);
		return sixth;
		
	}
	
	//based on full subtractor digital logic (return D)
	public int SUB_BIT(int x, int y, int b) {
		
		int first = NOR(x, y);
		int second = NOR(x, first);
		int third = NOR(first, y);
		int fourth = NOR(second, third);
		int fifth = NOR(fourth, fourth);
		int sixth = NOR(fifth, b);
		int seventh = NOR(fifth, sixth);
		int eigth = NOR(sixth, b);
		int tenth = NOR(seventh, eigth);
		int twelfth = NOR(tenth, tenth);
		return twelfth;
		
		
	}
	
	//based on full subtractor digital logic (return b-out)
	public int BORROW_BIT(int x, int y, int b) {
		
		int first = NOR(x, y);
		int second = NOR(x, first);
		int third = NOR(first, y);
		int fourth = NOR(second, third);
		int fifth = NOR(fourth, fourth);
		int sixth = NOR(fifth, b);
		int seventh = NOR(fifth, sixth);
		int ninth = NOR(second, seventh);
		int eleventh = NOR(ninth, ninth);
		return eleventh;
		
	}
	
	
	
	public int LESS_THAN(int x, int y, int l) {
		
		
		int first = NOR(x, y);      
		int second = NOR(x, first);         
		int third = NOR(second, l);      
		int fourth = NOR(second, third);     
		int fifth = NOR(third, l);     
		int sixth = NOR(fourth, fifth);    
		int seventh = NOR(sixth, sixth);     
		int eighth = NOR(seventh, l) ;     
		int ninth = NOR(seventh, y) ;    
		int result = NOR(eighth, ninth);
		return result;
			
		
	}
	
	

}
