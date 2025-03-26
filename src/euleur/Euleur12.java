package euleur;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Euleur12{

	public static int diviseur(int nombre) {
		List<Integer> liste_prime = NPremier.prime(2000);
		List<Integer> divisor = new ArrayList<>();
		if(liste_prime.contains(nombre)) return 2;

		while(nombre>1) {
			int v=nombre;
			divisor.addAll(liste_prime.stream()
					   .filter(div-> v%div==0)
					   .limit(1L)
					   .collect(Collectors.toList())
					   );
			if(!divisor.isEmpty()) {
				nombre/=divisor.getLast();
			}
			}

		int nb_div=1;
		Set<Integer> k = new HashSet<>(divisor);
		for(int i:k) {
			nb_div*=Collections.frequency(divisor, i)+1;
		}
		return nb_div;
	}

	public static void main(String...args) {
		int nb_diviseur = 0;
		int i=1;
		int f=0;
		while(nb_diviseur<500) {
			f = IntStream.rangeClosed(1, i)
						 .sum();
			nb_diviseur=diviseur(f);

			i++;
		}
		System.out.println("nombre : "+f);

	}
}
