//Escreva um programa que receba como entrada 50 números e exiba a soma dos que são múltiplos de 3.

package básicos;
import java.util.Scanner;
public class ExercicioSeis {
	
public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int cont = 0;
		
		for(int i = 1; i <= 50; i++) {
			
			System.out.println("Digite um número");
			int num = entrada.nextInt();
			
			if(i % 3 == 0) {
				cont += num;
			}
		}
		System.out.println("Soma dos números múltiplos de 3: " + cont);
		
		entrada.close();
	}

}
