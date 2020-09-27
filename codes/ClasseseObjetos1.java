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
