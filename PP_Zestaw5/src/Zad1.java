/* Napisz funkcjê, która zwraca wartoœæ silni dla podanej liczby n. Funkcja powinna
 * byæ napisana w dwóch wersjach: iteracyjnej i rekurencyjnej.
 */
import java.util.Scanner;
public class Zad1 {

	public static int silniaIteracja(int i) {
		int m;
		int wynik = 1;
		for(m=1; m<=i; m++) {
		wynik *= m;
		}
			return wynik;	
	}
	public static int silniaRekurencja(int i) {
		if (i<1) {
			return 1;
		} else {
			return i*silniaRekurencja(i-1);
			}
	}
	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		System.out.println("Podaj liczbê: ");
		System.out.println(n + "! = " + silniaRekurencja(n));
		System.out.println(n + "! = "+ silniaIteracja(n));
		s.close();
	}

}
