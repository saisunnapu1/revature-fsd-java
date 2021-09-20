
public class Overloading3 {

	public static void main(int[] args) {
		System.out.println("i am integers of array type");
		}
	public static void main(int args) {
		System.out.println("i am just a integer");
	}
	public static void main(String[] args) {
		main(2);
		main(new int[] {1,2,3});
	}


}
