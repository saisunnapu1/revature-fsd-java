package methods;
import java.util.*;

public class Factorial {
	int fact(int n) {
		if (n==1)
			return n;
       if (n==0)
    	   return 0;
		int x=n*fact(n-1);
		return x;
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int s=sc.nextInt();
		Factorial f= new Factorial();
		int o=f.fact(s);
		System.out.println("factorial of number::"+o);
		

	}

}
