package Strings;

public class MethodObject {
	int sum=0;
	public static void main(String[] args) {
		//Student s=new Student();
		School i=new School();
		MethodObject m= new MethodObject();
		int total=m.display(i);
		System.out.println(total);
		}
     int display(School c) {
    	 int sum=c.tel+c.eng+c.math+c.soc;
    	 return sum;
    	 
      }
	

	
}




class Student{
	int roll=123;
	String name="sai";
	int marks =88;
	
}