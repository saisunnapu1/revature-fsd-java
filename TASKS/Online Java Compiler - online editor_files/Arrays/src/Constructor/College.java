package Constructor;

public class College {
	int Roll;
	String name;
	 static String college="Anits";
	 int balance=5000;
	

	public static void main(String[] args) {
		//llege.display();
		System.out.println("BANK NAME---UNION BANK");
		System.out.println("ACCOUNT NUMBER---100510100096660");
		System.out.println("----------------------");
	    System.out.println("Roll   "+"name   "+"college   ");
	    System.out.println("----------------------");
	    College.change();
		//College s1=new College(1,"a",''
		//s1.display();
	    College s1=new College();
	    s1.display(1,"ravi kuumar");
		College s2=new College();
		s2.display(2,"sasi kala");
		/*College s3=new College(3,"vinay kuyya ");
		College s4=new College(4,"prassham");
		College s5=new College(5,"jafhav");*/
		System.out.println("----------------------");
		
	    
	}
	static   void change(){
		college="bavadhyo";
	}
	void display (int x,String y){
		    Roll=x;
		    name=y;
		    System.out.print(+Roll+"   "+name);
		   //ystem.out.println(balance);
	
	
	}

}
