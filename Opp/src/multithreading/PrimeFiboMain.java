package multithreading;

import java.util.ArrayList;
import java.util.List;

public class PrimeFiboMain {
	 public static void main(String[] args) throws InterruptedException {
		 List<Integer>al1=new ArrayList<Integer>();
		 List<Integer>al2=new ArrayList<Integer>();
		 
		 
		 
	    	PrimeNo t1 = new PrimeNo();
	        FibonacciNo t2 = new FibonacciNo();

	        t1.start();
	        t1.join();
	        t2.start();
	        t2.join();
	        
	        
	        al1=t1.getPrimes();
	        al2=t2.getFibonacci();
	        
	        al1.retainAll(al2);
	        
	        System.out.println("\nCommon in both primes and fib series:");
	        System.out.println(al1);



	        
	    }
	}

