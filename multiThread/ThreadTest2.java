/**
 * Multithreading - run(), run() and run()
 */
package multiThread;

class A2 extends Thread {
	public void run() {
		System.out.println("A Starts");
		for (int i = 1; i <= 5; i++) {
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B2 extends Thread {
	public void run() {
		System.out.println("B Starts");
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C2 extends Thread {
	public void run() {
		System.out.println("C Starts");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest2 {
	public static void main(String[] args) {
		A2 threadA = new A2();
		B2 threadB = new B2();
		C2 threadC = new C2();

		threadA.run();
		threadB.run();
		threadC.run();
	}
}
