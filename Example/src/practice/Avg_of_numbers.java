package practice;

public class Avg_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//define an array
				int[] numbers = new int[]{10,20,15,25,16,60,100};
				
				/*
				 * Average value of array elements would be
				 * sum of all elements/total number of elements
				 */
				
				//calculate sum of all array elements
				int sum = 0;
				
				for(int i=0; i &lt; numbers.length ; i++)
					sum = sum + numbers[i];
				
				//calculate average value
				double average = sum / numbers.length;
				
				System.out.println("Average value of array elements is : " + average);
	}

}
