package Constructor;

public class This {
	int x;//instance variable
	void display() {
		int x=20;
		System.out.println(this.x);
		System.out.println(x);
	}
	This(int x){
		this.x=x;//assigning value to iv using constructor
		System.out.println(x);
	}
	
	public static void main(String[] args) {
		This s1=new This(55);
		s1.display();
		
	}

}
