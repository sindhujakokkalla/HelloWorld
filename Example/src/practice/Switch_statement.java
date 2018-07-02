package practice;

public class Switch_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * break statement is used to terminate the flow of 
		 * matching case statements. If break statement is 
		 * not specified, switch statement becomes free flowing and
		 * all cases following matching case including default 
		 * would be executed.
		 */
		 
		 int i=0;
		 
		 switch(i)
		 {
		 	case 0:
		 		System.out.println("i is 0");
		 		
		 	case 1:
		 		System.out.println("i is 1");
		 		
		 	case 2:
		 		System.out.println("i is 2");
		 		
		 	default:
		 		System.out.println("Free flowing switch example!");
		 }
	}

}
