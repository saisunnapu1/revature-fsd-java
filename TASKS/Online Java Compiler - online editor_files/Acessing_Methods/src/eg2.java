
public class eg2 {
	void m1() {
		xx x1=new xx();   
		
		System.out.println(x1.o);
		x1.m1();
		
		}

	public static void main(String[] args) {
		eg2 f=new eg2();
		f.m1();

	}

}
class xx{
	int o=123;
	void m1() {
		System.out.println("hello i am from another class");
	}
	
}
