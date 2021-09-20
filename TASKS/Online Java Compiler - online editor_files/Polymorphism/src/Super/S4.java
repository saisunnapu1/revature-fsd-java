package Super;

public class S4 extends S2 {
	S4(){
		//super();
		System.out.println("child class constructor");//jvm by default uses super keyword
	}

	public static void main(String[] args) {
		S4 s=new S4();
	}

}
