/**
 * Multithreading - sleep()
 */
package multiThread;

class A5 extends Thread {
	public void run() {
		System.out.println("A Starts");
		for (int i = 1; i <= 5; i++) {
			if (i == 3 ) 
			{
				try {
					Thread.sleep(1000);
				}
				catch (Exception e) {
				}
			}
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B5 extends Thread {
	public void run() {
		System.out.println("B Starts");
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C5 extends Thread {
	public void run() {
		System.out.println("C Starts");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest5 {
	public static void main(String[] args) {
		A5 threadA = new A5();
		B5 threadB = new B5();
		C5 threadC = new C5();

		threadA.start();
		threadB.start();
		threadC.start();
	}
}
