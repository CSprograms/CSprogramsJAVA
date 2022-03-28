/**
 * Sum of two integers by creating an object to the same class - Version 4
 * class without construcor
 */
public class Program45 {
	
	private int ip1;
	private int ip2;
	private int sum;
	
	public void set(int ip1, int ip2) {
		this.ip1 = ip1;
		this.ip2 = ip2;
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
		
		Program45 obj = new Program45();
        
		obj.set(6, 24);

        System.out.printf("%d + %d = %d", obj.get_ip1(), obj.get_ip2(), obj.get_sum());
    }

}