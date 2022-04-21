/**
 * Multithreading - stop() Depricated
 */
package multiThread;

class A7 extends Thread {
	public void run() {
		System.out.println("A Starts");
		for (int i = 1; i <= 5; i++) {
			if (i == 3)
				stop();
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B7 extends Thread {
	public void run() {
		System.out.println("B Starts");
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C7 extends Thread {
	public void run() {
		System.out.println("C Starts");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest7 {
	public static void main(String[] args) {
		A7 threadA = new A7();
		B7 threadB = new B7();
		C7 threadC = new C7();

		threadA.start();
		threadB.start();
		threadC.start();
	}
}
