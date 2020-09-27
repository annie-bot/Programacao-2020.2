//Quest 2
public class Imovel {
	String tipo, imobiliaria;
	int pavimentos, pavimento, quartos, suites, banheiros, metrosQuadrados;
	boolean elevador, piscina, quadra;
		
	Imovel(String imobiliaria, int quartos, int suites, int banheiros, int metrosQuadrados, boolean piscina, boolean quadra){
		this.tipo = "casa";
		this.imobiliaria = imobiliaria;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.piscina = piscina;
		this.quadra = quadra;
		}
	Imovel(String imobiliaria, int pavimentos, int pavimento, int quartos, int suites, int banheiros, int metrosQuadrados, boolean elevador, boolean piscina, boolean quadra){
		this.tipo = "apartamento";
		this.pavimentos = pavimentos;
		this.pavimento = pavimento;
		this.quartos = quartos;
		this.suites = suites;
		this.banheiros = banheiros;
		this.metrosQuadrados = metrosQuadrados;
		this.elevador = elevador;
		this.piscina = piscina;
		this.quadra =  quadra;
		}
	double calculaPreco() {
		double precoAdicional = 0;
		int numAndar = 0;
		 		  if (andar > 4) {
		            numAndar = andar - 4;
		            precoAdicional = numAndar * 2000;
		        } if (elevador == true) {
		        	precoAdicional += 2500;
		        } if (piscina == true) { 
		        	precoAdicional += 2500;
		        } if (quadra == true) {
		        	precoAdicional += 2500;
		        }
		        return (metrosQuadrados * 5000) + precoAdicional;
		    }
	
	public String toString() { 
        String dsc = "";
        dsc += "Tipo: " + this.tipo + "\n";
        dsc += "Imobiliária: " + this.imobiliaria + "\n";
        dsc += "Número total de pavimentos: " + this.pavimentos + "\n";
        dsc += "Andar: " + this.pavimento + "\n";
        dsc += "Quarto(s): " + this.quartos + "\n";
        dsc += "Suíte(s): "+ this.suites + "\n";
        dsc += "Banheiro(s): " + this.banheiros + "\n";
        dsc += "Metros quadrados: " + this.metrosQuadrados + "m2 \n";
        dsc += "Elevador: " + (this.elevador? "sim" : "não") + "\n";
        dsc += "Piscina: " + (this.piscina? "sim" : "não") + "\n";
        dsc += "Quadra: " + (this.quadra? "sim" : "não") + "\n";
        dsc += "Valor total final R$: " + calculaPreco() + "\n";
        return dsc;
    }
		
	}
