// Lucas Okiishi Junqueira Forlini RA: 2565447

public abstract class Computador{

	private String marca;
	private String uso;
	private String sistema;

	private Armazenamento armazenamento;

	public Computador(){
		marca = "";
		uso = "";
		sistema = "";
		armazenamento = new Armazenamento();
	}
	
	public Armazenamento getArmazenamento(){
		return armazenamento;
	}

	public void setArmazenamento(Armazenamento armazenamento){
		this.armazenamento = armazenamento;
	}

	public String getMarca(){
		return marca;
	}

	public String getUso(){
		return uso;
	}

	public String getSistema(){
		return sistema;
	}

	public void setMarca(String marca){
		this.marca = marca;
	}

	public void setUso(String uso){
		this.uso = uso;
	}

	public void setSistema(String sistema){
		this.sistema = sistema;
	}

}