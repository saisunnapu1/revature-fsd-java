package Super;

public class S3 extends S2 {
	void m1() {
		super.m1();
		System.out.println("hello chilld");
	}

	public static void main(String[] args) {
		S3 s=new S3();
		s.m1();

	}

}
