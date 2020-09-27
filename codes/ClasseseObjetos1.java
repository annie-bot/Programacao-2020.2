// Quest 1
public class Carro {

	String nome, marca, cor;
	int portas;
	boolean vidroEletrico, arCondicionado, cambioAutomatico, direcaoEletrica;
	double precoBase;
	
	Carro(String nome, String marca, double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.precoBase = precoBase;
		
		this.portas = 2;
		this.cor = "branca";
		this.vidroEletrico = false;
		this.arCondicionado = false;
		this.cambioAutomatico = false;
		this.direcaoEletrica = false;		
		
	}
	Carro(String nome, String marca, String cor, int portas, boolean vidroEletrico, boolean arCondicionado, boolean cambioAutomatico, boolean direcaoEletrica, double precoBase){
		this.nome = nome;
		this.marca = marca;
		this.cor= cor;
		this.portas = portas;
		this.vidroEletrico = vidroEletrico;
		this.arCondicionado = arCondicionado;
		this.cambioAutomatico = cambioAutomatico;
		this.direcaoEletrica = direcaoEletrica;
		this.precoBase = precoBase;
	}
	
	double calculaPreco() {
		
		double preco = precoBase;
		
		switch(cor) {
			case "branca":
			case "azul":
			case "vermelha":
			case "preta": break;
			default: preco += 1000;
		}
		if (vidroEletrico)
			preco += 1250;
		if (arCondicionado)
			preco += 1250;
		if (cambioAutomatico)
			preco += 1250;
		if (direcaoEletrica)
			preco += 1250;
		
		return preco;
	}
	public String toString(){
		String desc = "";
		String desc = "";
		desc += "Nome: "+nome+", marca: "+marca+", cor: "+cor+"\n";
		desc += "Portas: "+portas+"\n";
		desc += "Vidro eletrico: "+(vidroEletrico?"X":"")+", Ar Condicionado: "+(arCondicionado?"X":"")+"\n";
		desc += "Cambio automatico: "+(cambioAutomatico?"X":"")+", Direcao eletrica: "+(direcaoEletrica?"X":"")+"\n";
		desc += "Preco: "+calculaPreco()+"\n";
		return desc;
		
	}
}

public class lojaDeCarro {

	public static void main(String[] args) {		
//		Fiat Pálio básico, de preço básico R$ 35000
//		Fiat Pálio básico com cor prateada, de preço básico R$ 35000
//		Honda Civic completo, de preço básico R$110000
//		Toyota Corolla com vidro, direção e ar, de preço básico R$110000
//		Volkswagen Gol completo, de preço básico R$ 55000 (use o construtor vazio)

		Carro c1 = new Carro("Pálio", "Fiat", 35000);
		Carro c2 = new Carro("Pálio", "Fiat", "PRATA", 2, false, false, false, false, 35000);
		Carro c3 = new Carro("Civic", "Honda", "AMARELA", 4, true, true, true, true, 110000);
		Carro c4 = new Carro("Corolla", "Toyota", "AMARELA", 4, true, true, false, true, 110000);
		Carro c5 = new Carro("Gol", "Volkswagen", "VERDE", 4, true, true, true, true, 55000);

		System.out.println(c4);

	}
