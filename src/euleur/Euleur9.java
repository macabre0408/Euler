package euleur;

public class Euleur9 {
	public static void main(String...args) {
		for(int a=1; a<1000;a++) {
			for(int b=a+1;b<1000;b++) {
				double c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
				if(((int)c==c) &&(c>b) && (a+b+c==1000)) {
					System.out.println(a*b*(long)c);
				}
			}
		}
	}
}
