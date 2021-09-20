package Types;

public class All {
	int a=33,b=2;
void addx() {
	int c=a+b;
	System.out.println(c);
}
}class sub extends All{
void sub1() {
System.out.println(a-b);
	
}
}class div extends sub {
void div() {
	System.out.println(a/b);
}
}class kk extends All{
public static void main(String[] args) {
	All k=new All();
	k.addx();
	//k.sub1();


}

}
