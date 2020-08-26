// Para concatenar vários elementos em um mesmo comando de escrita
//%f = ponto flutuante, %s = texto, %d = inteiro, %n = quebra de linha
public class Main {

	public static void main(String[] args) {
		
		String nome = "Matheus";
		int idade = 17;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais.%n", nome, idade, renda);
	
	}

}

