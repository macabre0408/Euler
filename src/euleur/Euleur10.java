package euleur;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Euleur10 {
	public static boolean isPrime(long nombre) {
		if(nombre<2) {
			return false;
		}
		return IntStream.rangeClosed(2, (int)Math.sqrt(nombre)).noneMatch(d->nombre%d==0);
	}

	public static void main(String... args) {
		int max = 2000000;
	    long k = LongStream.range(2, max+1)
								.filter(s->isPrime(s))
								.sum();
		System.out.println(k);
//		List<Integer> f = IntStream.range(2, max+1)
//									.filter(s->isPrime(s))
//									.boxed()
//									.collect(Collectors.toList());
//
//		for(int i:f) {
//			System.out.println(i);
//
//			try{
//				Thread.sleep(2000);
//			}
//			catch(InterruptedException e) {
//				System.err.println(e.getMessage());
//			}
//		}

	}
}
