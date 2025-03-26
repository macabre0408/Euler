package euleur;

import java.util.ArrayList;
import java.util.List;

public class NPremier {
	public static List<Integer> prime(int taille){

		List<Integer> liste_prime = new ArrayList<>();
		int nombre=2;
		while(liste_prime.size()<taille) {
			if(Euleur10.isPrime(nombre)) liste_prime.add(nombre);
			nombre++;
		}
		return liste_prime;
	}
	public static void main(String...args) {
		prime(2000).forEach(System.out::println);
}
}
