
public class Overload {
	void display(int x, int y) {
		System.out.println(x+y);
	} void display(int x,int y,int z) {
		System.out.println(x+y+z);
	}void display(double x, int y) {
		System.out.println(x+y);
}

	public static void main(String[] args) {
		Overload o=new Overload();
		o.display(5,6,8);
		o.display(9,3);
		o.display(9.000001,22);
	}

}
