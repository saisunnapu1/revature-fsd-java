package methods;
import java.util.*;
public class CheckPrime {
	void multiply(int N ){
	    int flag=0;
	    for(int i=2;i<N;i++){
	        if (N%i==0){
	            System.out.println("not a prime");
	            flag=1;
	            break;
	        }else if (flag==0){
	            System.out.println("prime");
	            break;
	            
	        }
	        else{
	            System.out.println("not a prime");
	        }
	    }
	}

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("enter a number :::");
		    int N=sc.nextInt();
		   CheckPrime k=new CheckPrime();
		   k.multiply(N);
		    

	}

}
