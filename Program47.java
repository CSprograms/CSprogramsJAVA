/**
 * Sum of two integers by creating an class and object - Version 6
 * class with construcor
 */
class Addition1 {
	
    private int ip1, ip2, sum;
	
    public Addition1() {
        this.ip1 = 0;
        this.ip2 = 0;
    }
	
    public Addition1(int ip) {
        this.ip1 = ip;
        this.ip2 = ip;
    }
	
    public Addition1(int ip1, int ip2) {
        this.ip1 = ip1;
        this.ip2 = ip2;
    }
	
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
}
public class Program47 {
    public static void main(String[] args) {

        Addition1 obj1 = new Addition1();
        System.out.printf("%d + %d = %d%n", obj1.get_ip1(), obj1.get_ip2(), obj1.get_sum());

        Addition1 obj2 = new Addition1(6);
        System.out.printf("%d + %d = %d%n", obj2.get_ip1(), obj2.get_ip2(), obj2.get_sum());

        Addition1 obj3 = new Addition1(6, 24);
        System.out.printf("%d + %d = %d%n", obj3.get_ip1(), obj3.get_ip2(), obj3.get_sum());

        obj3.set(10, 20);
        System.out.printf("%d + %d = %d", obj3.get_ip1(), obj3.get_ip2(), obj3.get_sum());
    }

}