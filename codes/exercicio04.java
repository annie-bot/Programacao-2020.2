//Escreva um programa para receber como entrada dois números e exibir a quantidade de múltiplos de 4 entre eles (os extremos do intervalo não devem ser considerados).

package básicos;
import java.util.Scanner;
public class ExercicioQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Entre com o primeiro valor: ");
		int num1 = entrada.nextInt();

		System.out.println("Entre com o segundo valor: ");
		int num2 = entrada.nextInt();


		for(int i = num1 + 1; i < num2; i++) {
			if(i % 4 == 0) {
				System.out.println(i);

			}

			entrada.close();
		}

	}	
}
