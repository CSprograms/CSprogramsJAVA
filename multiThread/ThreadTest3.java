/**
 * Multithreading - run(), start() and start()
 */
package multiThread;

class A3 extends Thread {
	public void run() {
		System.out.println("A Starts");
		for (int i = 1; i <= 5; i++) {
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B3 extends Thread {
	public void run() {
		System.out.println("B Starts");
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C3 extends Thread {
	public void run() {
		System.out.println("C Starts");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest3 {
	public static void main(String[] args) {
		A3 threadA = new A3();
		B3 threadB = new B3();
		C3 threadC = new C3();

		threadA.run();
		threadB.start();
		threadC.start();
	}
}
