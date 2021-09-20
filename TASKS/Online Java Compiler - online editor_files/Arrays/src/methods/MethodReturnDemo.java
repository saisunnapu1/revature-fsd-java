package methods;

public class MethodReturnDemo {
	int add(){
		int x=1;
		int y=22;
		int z=x+y;
		return z;
				
	}

	public static void main(String[] args) {
	    MethodReturnDemo q =new MethodReturnDemo();
	    int result =q.add();
	    System.out.println(result);
	    

	}

}
