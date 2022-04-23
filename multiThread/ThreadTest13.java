/**
 * Multithreading - stop() Depricated
 * java.util.concurrent.Executors
 * java.util.concurrent.ExecutorService
 * Thread State
 */
package multiThread;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

class A13 extends Thread {
	public void run() {
		System.out.println("A Starts");
		for (int i = 1; i <= 5; i++) {
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B13 extends Thread {
	public void run() {
		System.out.println("B Starts");
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C13 extends Thread {
	public void run() {
		System.out.println("C Starts");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest13 {
	public static void main(String[] args) {
		A13 threadA = new A13();
		B13 threadB = new B13();
		C13 threadC = new C13();

		ExecutorService executeService = Executors.newCachedThreadPool();

		executeService.execute(threadA);
		executeService.execute(threadB);
		executeService.execute(threadC);

		System.out.println("Thread A State : " + threadA.getState());
		System.out.println("Thread A Alive : " + threadA.isAlive());
        System.out.println("Thread B State : " + threadB.getState());
		System.out.println("Thread B Alive : " + threadB.isAlive());
        System.out.println("Thread C State : " + threadC.getState());
		System.out.println("Thread C Alive : " + threadC.isAlive());

        executeService.shutdown();

		System.out.println("Thread main ends..");

	}
}
