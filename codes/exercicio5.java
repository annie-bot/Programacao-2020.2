//Escreva um programa que receba como entrada 25 números e exiba a quantidade de números que são pares e positivos.

package básicos;
import java.util.Scanner;
public class ExercicioCinco {

public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
			
		int cont = 0;
		
		for(int i = 1; i <= 25; i++) {
			
			System.out.println("Digite o número: ");
			int num = entrada.nextInt();
			
			if(num % 2 == 0 && num > 0) {
				cont += 1;
			}
		}
		
		System.out.println("Quantidade de números pares e positivos: " + cont);
		
		entrada.close();
		
	}
}
