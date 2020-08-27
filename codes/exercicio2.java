import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);	
			
	double x = entrada.nextFloat();
  double y = entrada.nextFloat();
  double w = entrada.nextFloat();

 double media = (x + y + w)/ 3;

  Locale.setDefault(Locale.US);
  System.out.println("Média Aritmética = " + media);
  }
}


//Escreva um programa que recebe do usuário 3 valores do tipo ponto flutuante e imprime na tela a média aritmética destes números.
