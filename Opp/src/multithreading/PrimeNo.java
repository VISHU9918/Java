package multithreading;

import java.util.ArrayList;
import java.util.List;

public class PrimeNo extends Thread {
    public List<Integer> p = new ArrayList<>();
    @Override
    public void run() {
        int primesCount = 0;
        for (int i = 2; i <= 1000; i++) {
            int count = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    count++;
                    if (count > 1)
                        break;
                }
            }
            if (count == 1) {
                System.out.println("Primes No:"+i);
                primesCount++;
                p.add(i);
            }
        }
    
    System.out.println("\nNo of primes:"+primesCount);
    }
    public List<Integer> getPrimes() {
		
        return p;
    }
}