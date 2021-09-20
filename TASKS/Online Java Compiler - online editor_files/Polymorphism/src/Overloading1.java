
public class Overloading1 {
   String college ="anits college";
	static void show(int x) {
		System.out.println(x);
		String college="klm university";
				System.out.println(college);
		
	} static void show (int x,int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		show(5);
		show(5,6);
	}

}
