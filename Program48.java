/**
 * Sum of two integers by creating an class and object - Version 7
 * class with construcor and toString()
 */
class Addition2 {
	
	private int ip1;
	private int ip2;
	private int sum;
	
	Addition2() {
		this.ip1 = 0;
		this.ip2 = 0;
	}
	
	Addition2(int ip) {
		this.ip1 = ip;
		this.ip2 = ip;
	}
	
	Addition2(int ip1, int ip2) {
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
	
	public String toString() {
		return this.ip1 + " + " + this.ip2 + " = " + this.get_sum();
	}

}
public class Program48 {
	
	public static void main(String[] args) {
		
		Addition2 obj1 = new Addition2();
        System.out.println(obj1.toString());
		
		Addition2 obj2 = new Addition2(6);
        System.out.println(obj2.toString());
		
		Addition2 obj3 = new Addition2(6, 24);
        System.out.println(obj3.toString());
		
		obj3.set(10, 20);
		System.out.print(obj3.toString());
    }

}