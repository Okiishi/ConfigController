// Lucas Okiishi Junqueira Forlini RA: 2565447

public class PlacaDeVideo extends Computador{

    private String fabricante = "";
    private String modelo = "";

    public String getFabricante(){
        return fabricante;
    }

    public String getModelo(){
        return modelo;
    }

    public void setFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
}