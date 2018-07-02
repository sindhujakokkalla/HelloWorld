package practice;

public class Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//get currently running thread object
				Thread currentThread = Thread.currentThread();
				System.out.println(currentThread);
				
				/*
				 * To set name of thread, use
				 * void setName(String threadName) method of 
				 * Thread class.
				 */
				
				currentThread.setName("Set Thread Name Example");
				
				/*
				 * To get the name of thread use, 
				 * String getName() method of Thread class.
				 */
				System.out.println("Thread Name : "+ currentThread.getName());

	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setName(String string) {
		// TODO Auto-generated method stub
		
	}

	private static Thread currentThread() {
		// TODO Auto-generated method stub
		return null;
	}

}
