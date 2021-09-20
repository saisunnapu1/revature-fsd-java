package Strings;

public class eg1 {

	public static void main(String[] args) {
		String s1= new String("hello ");//stored in heap memory
		String s2="Hello";//stored in string constant pool
		int k=s1.length();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(k);
		System.out.println(s2.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.concat(s2));
		System.out.println(s2.concat(s1));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));//checks size
	}

}
