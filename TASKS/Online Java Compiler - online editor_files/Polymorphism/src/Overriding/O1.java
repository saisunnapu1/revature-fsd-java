package Overriding;

public class O1 extends O2{
void  deposit() {
	int x=33;
	System.out.println(x);
	System.out.println("call");
}
	public static void main(String[] args) {
		//O1 o=new O();
		O2 o1=new O1();
		//o.deposit();
		o1.deposit();
		
	}

}
