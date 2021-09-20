package Super;

public class S1 extends S2 {
	int x=333;//instance variable
 void m1() {
	 int x=99;// local variable
	 System.out.println(x);
	 System.out.println(this.x);
	 System.out.println(super.x);//used this keyword to differentiate between local and instance variable
 }

	public static void main(String[] args) {
		S1 s=new S1();
		s.m1();
	}

}
