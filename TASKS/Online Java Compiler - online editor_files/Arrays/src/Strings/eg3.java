package Strings;

public class eg3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("hello sai");
		System.out.println(sb);
		System.out.println(sb.length());
		System.out.println(sb.append("sai"));
	//	System.out.println(sb.length());
	//	System.out.println(sb.delete(0,6));
	//	System.out.println(sb.deleteCharAt(1));
		System.out.println(sb.substring(0,5));
		System.out.println(sb.insert(6,"java "));
		System.out.println(sb.replace(6,10,"kova"));
		System.out.println(sb.reverse());
		//String arr[]=sb.split(" ")
				
		

	}

}
