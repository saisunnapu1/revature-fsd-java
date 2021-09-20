package Constructor;

public class eg1{

	public static void main(String[] args) {
		eg1 d=new eg1();
		eg1 d1=new eg1(22,"sai");
		
	}
	eg1(){
		System.out.println("hello world");//zero paramater
	}eg1(int i,String name){
		System.out.println("wllcome");	
	}
	
}