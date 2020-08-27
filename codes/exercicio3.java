import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    String produto = entrada.next();
    double valor = entrada.nextDouble();

    if(valor > 0 && valor < 100){
      valor *= 0.95;
    }else if(valor >= 100 && valor < 500){
      valor *= 0.90;
    }else{
      valor *= 0.85;
    }
    System.out.println(produto + " R$ " + valor);

  }
}

//Escreva um programa que recebe do usuário o nome do produto, e seu preço. Se o preço for:

//]0, 100[: dê 5% de desconto
//[100,500[: dê 10% de desconto
//[500, inf[: dê 15% de desconto Ao final, seu programa deve imprimir o nome do produto e preço com desconto.
