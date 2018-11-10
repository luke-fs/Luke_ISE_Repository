import java.util.Scanner;

public class FunktionaleKlasse  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Zahl 1: ");
		double zahl1 = sc.nextInt();
		System.out.println("Zahl 2: ");
		double zahl2 = sc.nextInt();
		
		FunktionaleKlasse obj = new FunktionaleKlasse();
		double erg = obj.addiere(zahl1,zahl2);
		System.out.println(erg);
		
		
	}
	public double addiere(double x, double y) {
		double erg = x+y;
		return erg;
	}
	
	public double multipliziere(double x, double y) {
		double erg = x*y;
		return erg;
	}
	public double dividiere(double x, double y) {
		double erg = x/y;
		return erg;
	}
}

