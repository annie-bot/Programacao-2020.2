import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		
	double x = 10.35784;
	System.out.println(x);
	System.out.printf("%.2f%n", x);
	System.out.printf("%.4f%n", x);
	Locale.setDefault(Locale.US);
	System.out.printf("%.4f%n", x);
	
	}

}

//Para imprimir pontos decimais com 2 ou 4 casas %.2f ou %.4f 
// Para imprimir com o ponto no lugar da vírgula, import java.util.Locale; + Locale.setDefault(Locale.US);
