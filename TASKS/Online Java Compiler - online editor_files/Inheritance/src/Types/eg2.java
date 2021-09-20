package Types;

public class eg2 {
	int a=33,b=2;
	void add1() {
		int c=a+b;
		System.out.println(c);
	}
	
/*
}class add extends eg2{
	void add() {
		System.out.println(a+b);
	}
}class sub extends add{
	void sub() {
	System.out.println(a-b);
		
}
}class div extends sub {
	void div() {
		System.out.println(a/b);
	}
	/*void mul() {
		System.out.println(a*b);
	}*/
}class inheritance extends eg2{
	public static void main(String[] args) {
		eg2 k=new eg2();
		k.add1();
	

	}
}
