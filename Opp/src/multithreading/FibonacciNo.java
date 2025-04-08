package multithreading;

import java.util.*;


public class FibonacciNo extends Thread {
	
	    public List<Integer> f = new ArrayList<>();
        @Override
	    public void run() {
	        int a = 0, b = 1,c;
	        f.add(a);
	        f.add(b);
	        System.out.println("\nFibonacci:");
	        System.out.println(a);
	        System.out.println(b);
	        
	        for (int i=3;i<=17;i++) {
	            c=a+b;
	            System.out.println(c);
	            f.add(c);
	            a = b;
	            b = c;
	        }
	    }
           
	    public List<Integer> getFibonacci() {
	        return f;
	    }
	}


