package Constructor;

public class Student {
	int roll;
	String name;
	double mob;

	public static void main(String[] args) {
		Student s1=new Student(33,"kiran");
		Student s2=new Student(34,"sai");
		Student s3=new Student(93,"kumar");
		Student s9=new Student(33,"kiran",984976);
		Student s8=new Student(89);
		
	}Student(int x,String n){
		roll=x;
		name=n;
		System.out.print(roll);
		System.out.println(name);
		
	}
	Student(int x,String n,double k){
	     roll=x;
	    name=n;
	     mob=k;
	     System.out.println(k);
}Student(int k){
	roll=k;
	System.out.println(k);
}
}
