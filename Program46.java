/**
 * Sum of two integers by creating an object to the same class - Version 5
 * class with construcor
 */
public class Program46 {
	
	private int ip1;
	private int ip2;
	private int sum;
	
	Program46() {
		this.ip1 = 0;
		this.ip2 = 0;
	}
	
	Program46(int ip) {
		this.ip1 = ip;
		this.ip2 = ip;
	}
	
	Program46(int ip1, int ip2) {
		this.ip1 = ip1;
		this.ip2 = ip2;
	}
	
	public void set(int x, int y) {
		this.ip1 = x;
		this.ip2 = y;
	}
	
	public int get_ip1() {
		return this.ip1;
	}
	
	public int get_ip2() {
		return this.ip2;
	}
	
	public int get_sum() {
		this.sum = this.ip1 + this.ip2;
		return this.sum;
	}
	
    public static void main(String[] args) {
		
		Program46 obj1 = new Program46();
        System.out.printf("%d + %d = %d%n", obj1.get_ip1(), obj1.get_ip2(), obj1.get_sum());
		
		Program46 obj2 = new Program46(6);
        System.out.printf("%d + %d = %d%n", obj2.get_ip1(), obj2.get_ip2(), obj2.get_sum());
		
		Program46 obj3 = new Program46(6, 24);
        System.out.printf("%d + %d = %d%n", obj3.get_ip1(), obj3.get_ip2(), obj3.get_sum());
		
		obj3.set(10, 20);
		System.out.printf("%d + %d = %d", obj3.get_ip1(), obj3.get_ip2(), obj3.get_sum());
    }

}