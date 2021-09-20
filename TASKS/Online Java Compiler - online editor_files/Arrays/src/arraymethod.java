
public class arraymethod {
	int sum=0;
	int Display(int [] len) {
		for(int k:len) {
			sum+=k;}
			return sum;
			
		}
	

	public static void main(String[] args) {
		int arr1[]= {1,2,3,4,5};
		arraymethod d =new arraymethod();
		int yy=d.Display(arr1);
		System.out.println(yy);
		
	}

}
