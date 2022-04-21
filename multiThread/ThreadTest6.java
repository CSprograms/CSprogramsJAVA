/**
 * Multithreading - yield()
 */
package multiThread;

class A6 extends Thread {
	public void run() {
		System.out.println("A Starts");
		for (int i = 1; i <= 5; i++) {
			if (i%2 == 0) 
				Thread.yield();
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B6 extends Thread {
	public void run() {
		System.out.println("B Starts");
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C6 extends Thread {
	public void run() {
		System.out.println("C Starts");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest6 {
	public static void main(String[] args) {
		A6 threadA = new A6();
		B6 threadB = new B6();
		C6 threadC = new C6();

		threadA.start();
		threadB.start();
		threadC.start();
	}
}
