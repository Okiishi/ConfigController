// Lucas Okiishi Junqueira Forlini RA: 2565447

public class Memoria extends Computador{

	private String fabricante = "";
	private int frequencia = 0;  

	public String getFabricante(){
		return fabricante;
	}

	public int getFrequencia(){
		return frequencia;
	}

	public void setFabricante(String fabricante){
		this.fabricante = fabricante;
	}

	public void setFrequencia(int frequencia) throws FreqMemAbException, FreqMemAcException{
		if(frequencia > 0){
			if(frequencia <= 4200){	
			this.frequencia = frequencia;
		}
		else{
			throw new FreqMemAcException();
		}
	}
		else{
			throw new FreqMemAbException();
		}
	}


}