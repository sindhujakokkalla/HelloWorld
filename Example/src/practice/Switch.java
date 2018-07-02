package practice;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Syntax of switch statement is 
		 * 
		 * switch(expression){
		 * 	
		 * 	case value1:
		 * 		//statements
		 * 		break;
		 * 
		 * case value2:
		 * 		//statements
		 * 		break;
		 * 
		 * ....
		 * 
		 * default:
		 * 		//statements
		 * 		break;
		 * 
		 * }
		 * 
		 * here, expression must be of type int, short, byte or char. 
		 * values should be constants literal values and can not be 
		 * duplicated.
		 * 
		 * Flow of switch statement is as below.
		 * Expression value is compared with each case value. If it 
		 * matches, statements following case would be executed. 
		 * break statement is used to terminate the execution of
		 * statements.
		 * 
		 * If none of the case matches, statements following default
		 * would be executed.
		 * 
		 * If break statement is not used within case, all cases following
		 * matching cases would be executed.
		 *  
		 */
		
		for(int i=0; i <= 3 ; i++)
		{
			switch(i)
			{
				case 0:
					System.out.println("i is 0");
					break;
				
				case 1:
					System.out.println("i is 1");
					break;
				
				case 2:
					System.out.println("i is 2");
					break;
				
				default:
					System.out.println("i is greater than 2");
					
			}
		}
	}

}
