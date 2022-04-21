/**
 * Multithreading - setPriority()
 */
package multiThread;

class A8 extends Thread {
	public void run() {
		System.out.println("A Starts");
		for (int i = 1; i <= 5; i++) {
			System.out.println("From Thread A : i = " + i);
		}
		System.out.println("Exit from A");
	}
}

class B8 extends Thread {
	public void run() {
		System.out.println("B Starts");
		for (int j = 1; j <= 5; j++) {
			System.out.println("From Thread B : j = " + j);
		}
		System.out.println("Exit from B");
	}
}

class C8 extends Thread {
	public void run() {
		System.out.println("C Starts");
		for (int k = 1; k <= 5; k++) {
			System.out.println("From Thread C : k = " + k);
		}
		System.out.println("Exit from C");
	}
}

class ThreadTest8 {
	public static void main(String[] args) {
		A8 threadA =  new A8();
		B8 threadB =  new B8();
		C8 threadC =  new C8();
		
		threadA.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority()-2);
		threadC.setPriority(Thread.MIN_PRIORITY);
		
		threadA.start();
		threadB.start();
		threadC.start();
	}
}
