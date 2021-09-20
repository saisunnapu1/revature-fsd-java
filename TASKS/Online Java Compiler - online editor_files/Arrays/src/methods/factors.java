package methods;
import java.util.*;

public class factors {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
	    int N=sc.nextInt();
	   factors k=new factors();
	   k.multiply(N);

	}
	void multiply(int N ){
	    for(int i=1;i<=N;i++){
	        if(N%i==0){
	   System.out.println(i);
	        }
	        else{System.out.println(N);
	        break;
	    }
	   
	}
	}
}
