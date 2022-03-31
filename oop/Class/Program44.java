/**
 * Sum of two integers using data members and member methods - Version 3
 */
package oop.Class;
public class Program44 {
	
	private static int ip1;
	private static int ip2;
	private static int sum;
	
	private static void set(int x, int y) {
		ip1 = x;
		ip2 = y;
	}
	
	private static int get_ip1() {
		return ip1;
	}
	
	private static int get_ip2() {
		return ip2;
	}
	
	private static int get_sum() {
		sum = ip1 + ip2;
		return sum;
	}
	
    public static void main(String[] args) {
        
		set(6, 24);

        System.out.printf("%d + %d = %d", get_ip1(), get_ip2(), get_sum());
    }

}