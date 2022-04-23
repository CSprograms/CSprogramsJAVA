/**
 * Multithreading - run() -- Thread State
 */
package multiThread;

class A11 extends Thread {
	public void run() {
		System.out.println("A Starts");
		for (int i = 1; i <= 5; i++) {
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B11 extends Thread {
	public void run() {
		System.out.println("B Starts");
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C11 extends Thread {
	public void run() {
		System.out.println("C Starts");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest11 {
	public static void main(String[] args) {
		A11 threadA = new A11();
		B11 threadB = new B11();
		C11 threadC = new C11();

		threadA.run();
		threadB.run();
		threadC.run();

        System.out.println("Thread A State : " + threadA.getState());
		System.out.println("Thread A Alive : " + threadA.isAlive());
        System.out.println("Thread B State : " + threadB.getState());
		System.out.println("Thread B Alive : " + threadB.isAlive());
        System.out.println("Thread C State : " + threadC.getState());
		System.out.println("Thread C Alive : " + threadC.isAlive());

		System.out.println("Thread main ends..");
	}
}
