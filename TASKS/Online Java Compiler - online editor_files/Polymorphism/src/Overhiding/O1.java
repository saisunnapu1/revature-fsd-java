package Overhiding;

public class O1 {
	static void m1() {
		System.out.println("i am from child class");
	}

	public static void main(String[] args) {
		O1 o=new O1();
		O2 k=new O2();
		//O1 h=new O2();
		o.m1();
		k.m1();
	}

}
