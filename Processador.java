// Lucas Okiishi Junqueira Forlini RA: 2565447

public class Processador extends Computador{
	
	private String fabricante = "";
	private String modelo = "";
	private int frequencia = 0;
	
	public String getFabricante(){
		return fabricante;
	}
	public String getModelo(){
		return modelo;
	}
	
	public int getFrequencia(){
		return frequencia;
	}	

	public void setFabricante(String fabricante){
		this.fabricante = fabricante; 
	}
	public void setModelo(String modelo){
		this.modelo = modelo; 
	}

	public void setFrequencia(int frequencia) throws FreqAcException, FreqAbException {
		if(frequencia > 0){
			if(frequencia <= 6000){	
			this.frequencia = frequencia;
		}
		else{
			throw new FreqAcException();
		}
	}
		else{
			throw new FreqAbException();
		}
	}

}