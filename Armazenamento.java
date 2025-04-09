// Lucas Okiishi Junqueira Forlini RA: 2565447

public class Armazenamento{

	private String tipo = "";
	private int tamanho = 0;
	

	public String getTipo(){
		return tipo;
	}
	
	public int getTamanho(){
		return tamanho;
	}

	
	public void setTipo(String tipo){
		this.tipo = tipo;
	}

	public void setTamanho(int tamanho) throws TamAbException {
		if(tamanho > 0){
			this.tamanho = tamanho;
		}
		else{
			throw new TamAbException();
		}
	
	}

}