package Constructor;

public class Counter {
	 int count=0;// instance variable
	 Counter(){
		 count++;
		 System.out.println(count);
		 }
	public static void main(String[] args) {
		Counter c=new Counter();
		Counter c1=new Counter();
		Counter c3=new Counter();
		
		
		
	}

}
