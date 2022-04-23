/**
 * Multithreading - isAlive()
 */
package multiThread;

class A9 extends Thread {
	public void run() {
		System.out.println("A Starts");
		for (int i = 1; i <= 5; i++) {
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B9 extends Thread {
	public void run() {
		System.out.println("B Starts");
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C9 extends Thread {
	public void run() {
		System.out.println("C Starts");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest9 {
	public static void main(String[] args) {
		A9 threadA =  new A9();
		B9 threadB =  new B9();
		C9 threadC =  new C9();
		
		threadA.start();
		threadB.start();
		threadC.start();

        while(threadA.isAlive())
        System.out.println("Waiting Thread A");

        while(threadB.isAlive())
        System.out.println("Waiting Thread B");

        while(threadC.isAlive())
        System.out.println("Waiting Thread C");

        System.out.println("Thread main ends..");
	}
}
