
public class Operations {
int a=4;
int b=6;
void add() {
	System.out.println(a+b);
}
}class Sub extends Operations{
	void sub() {
		System.out.println(a-b);
	}
	
}class Mul extends Sub{
	void mul(){
		System.out.println(a*b);
	}
}class Div extends Mul{
	void div() {
		System.out.println(a/b);
	}
}
