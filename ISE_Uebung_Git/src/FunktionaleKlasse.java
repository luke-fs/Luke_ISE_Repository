import java.util.Scanner;

public class FunktionaleKlasse  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zahl 1: ");
		double zahl1 = sc.nextInt();
		System.out.println("Zahl 2: ");
		double zahl2 = sc.nextInt();
		
		addiere(zahl1,zahl2);
		multipliziere(zahl1,zahl2);
		dividiere(zahl1,zahl2);
	}
	public static void addiere(double x, double y) {
		double erg = x+y;
		System.out.println(erg);
	}
	
	public static void multipliziere(double x, double y) {
		double erg = x*y;
		System.out.println(erg);
	}
	public static void dividiere(double x, double y) {
		double erg = x/y;
		System.out.println(erg);
	}
}

