package practice;

public class Nested_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Like any other Java statements, switch statements
		 * can also be nested in each other as given in
		 * below example.
		 */
		 
		 int i = 0;
		 int j = 1;
		 
		 switch(i)
		 {
		 	case 0:
		 		switch(j)
		 		{
		 			case 0:
		 				System.out.println("i is 0, j is 0");
		 				break;
		 			
		 			case 1:
		 				System.out.println("i is 0, j is 1");
		 				break;
		 				
		 			default:
		 				System.out.println("nested default case!!");
		 		}
		 		
		 		break;
		 		
		 	default:
		 		System.out.println("No matching case found!!");
		 	
		 }
	}

}
