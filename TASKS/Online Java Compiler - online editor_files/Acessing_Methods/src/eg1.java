
public class eg1 {
int x=12;
 void m2() {
	 System.out.println("i am executed");
 }
 void m1() {
	 System.out.println(x);
	 m2();
 }
	public static void main(String[] args) {
		eg1 e=new eg1();
		e.m1();
	
		

	}

}
