package euleur;

import java.util.HashMap;
import java.util.Map;

public class Euleur14 {
	public static void main(String...args) {
		long nombre=1000000L;
		Map<Long, Integer> map = new HashMap<>();
		int max=0;
		map.put(nombre, max);

		while(nombre>1) {
			int i = 0;
			long cop = nombre;
			while(cop>1) {
				cop= (cop%2==0)?cop/2:3*cop+1;
				i++;
			}
			if(max<i) {
				max=i;
				map.clear();
				map.put(nombre, max);
			}
			nombre--;
		}
		map.forEach((k,v)->System.out.println("Nombre : "+k+"\nNb termes : "+v));


	}
}
