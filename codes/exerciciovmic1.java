public class LojaDeCarro {
	
	public static void main(String[] args) {		
		Carro.promocao = false;
		
		Carro c1 = new Carro("Pálio", "Fiat", 35000);
		Carro c2 = new Carro("Pálio", "Fiat", Cor.PRATA, 2, false, false, false, false, 35000);
		Carro c3 = new Carro("Civic", "Honda", Cor.AMARELA, 4, true, true, true, true, 110000);
		Carro c4 = new Carro("Corolla", "Toyota", Cor.AMARELA, 4, true, true, false, true, 110000);
		Carro c5 = new Carro("Gol", "Volkswagen", Cor.VERDE, 4, true, true, true, true, 55000);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
		Carro.promocao = true;
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		
	}

}
