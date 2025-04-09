// Lucas Okiishi Junqueira Forlini RA: 2565447	

public class Principal {

    static Leitura l = new Leitura();
    static Processador proc = new Processador();
    static PlacaDeVideo placa = new PlacaDeVideo();
    static Memoria memoria = new Memoria();

    public static void main(String arg[]) {

        boolean vai = true;

        while (vai) {
            try{
            System.out.println("\n Sistema de escolha de peças\n");

            System.out.println("1) Processador");
            System.out.println("2) Placa de Video");
            System.out.println("3) Memoria");
            System.out.println("4) Sair");

            int op = Integer.parseInt(l.entDados("\n Escolha uma opcao"));
            switch (op) {
                case 1: {
                    menuProcessador();
                    break;
                }
                case 2: {
                    menuPlaca();
                    break;
                }
                case 3: {
                    menuMemoria();
                    break;
                }

                case 4:
                    vai = false;

                default:
                    continue;

            }
        }
        catch(NumberFormatException nfe){
            System.out.println("\n O valor digitado deve ser um inteiro entre 1 e 4!");
        }
        }

    }

    // Processador

    public static void menuProcessador() {

        try{

        proc.setMarca(l.entDados("\nMarca do computador:"));
        proc.setUso(l.entDados("Uso do computador: (Desktop ou mobile)"));
        proc.setSistema(l.entDados("Sistema do computador"));

        proc.getArmazenamento().setTipo(l.entDados("Tipo de armazenamento:"));
        proc.getArmazenamento().setTamanho(Integer.parseInt(l.entDados("Tamanho de armazenamento (em gigabytes):")));
       
        proc.setFabricante(l.entDados("Fabricante do processador:"));
        proc.setModelo(l.entDados("Modelo do processador:"));
        proc.setFrequencia(Integer.parseInt(l.entDados("Frequencia do processador:(Em Megahertz)")));

        System.out.println("\nMarca do computador:" + proc.getMarca());
        System.out.println("Uso do computador:" + proc.getUso());
        System.out.println("Sistema do computador:" + proc.getSistema());

        System.out.println("Tipo de armazenamento:" + proc.getArmazenamento().getTipo());
        System.out.println("Tamanho de armazenamento (em gigabytes):" + proc.getArmazenamento().getTamanho());
        

        System.out.println("Fabricante do processador:" + proc.getFabricante());
        System.out.println("Modelo do processador:" + proc.getModelo());
        System.out.println("Frequencia do processador:" + proc.getFrequencia());
        }

        catch(FreqAcException fae){
            fae.impFreqAc();
        }
        

        catch(FreqAbException fabe){
            fabe.impFreqAb();
        }

        catch(TamAbException tae){
            tae.impTamAb();
        }
        
        catch(NumberFormatException nfe){
            System.out.println("\n O valor digitado deve ser um inteiro!");
        }
    }

    // Placa de Video

    public static void menuPlaca() {

        try{

        placa.setMarca(l.entDados("\nMarca do computador:"));
        placa.setUso(l.entDados("Uso do computador:(Desktop ou mobile)"));
        placa.setSistema(l.entDados("Sistema do computador"));

        placa.getArmazenamento().setTipo(l.entDados("Tipo de armazenamento:"));
        placa.getArmazenamento().setTamanho(Integer.parseInt(l.entDados("Tamanho de armazenamento(em gigabytes):")));
        

        placa.setFabricante(l.entDados("Fabricante da placa de vídeo"));
        placa.setModelo(l.entDados("Modelo da placa de vídeo:"));

        System.out.println("\nMarca do computador:" + placa.getMarca());
        System.out.println("Uso do computador:" + placa.getUso());
        System.out.println("Sistema do computador:" + placa.getSistema());

        System.out.println("Tipo de armazenamento:" + placa.getArmazenamento().getTipo());
        System.out.println("Tamanho de armazenamento(em gigabytes):" + placa.getArmazenamento().getTamanho());

        System.out.println("\nFabricante da placa de vídeo:" + placa.getFabricante());
        System.out.println("Modelo da placa de vídeo:" + placa.getModelo());
        }

        catch(TamAbException tae){
            tae.impTamAb();
        }

        catch(NumberFormatException nfe){
            System.out.println("\n O valor digitado deve ser um inteiro!");
        }

    }

    // Memoria

    public static void menuMemoria() {

        try{
        memoria.setMarca(l.entDados("\nMarca do computador:"));
        memoria.setUso(l.entDados("Uso do computador:(Desktop ou mobile)"));
        memoria.setSistema(l.entDados("Sistema do computador"));

        memoria.getArmazenamento().setTipo(l.entDados("Tipo de armazenamento:"));
        memoria.getArmazenamento().setTamanho(Integer.parseInt(l.entDados("Tamanho de armazenamento(em gigabytes):")));
        
        memoria.setFabricante(l.entDados("Fabricante da memoria:"));
        memoria.setFrequencia(Integer.parseInt(l.entDados("Frequencia de memoria(em megahertz)")));

        System.out.println("\nMarca do computador:" + memoria.getMarca());
        System.out.println("Uso do computador:" + memoria.getUso());
        System.out.println("Sistema do computador:" + memoria.getSistema());

        System.out.println("Tipo de armazenamento:" + memoria.getArmazenamento().getTipo());
        System.out.println("Tamanho de armazenamento(em gigabytes):" + memoria.getArmazenamento().getTamanho());


        System.out.println("Fabricante da memoria:" + memoria.getFabricante());
        System.out.println("Frequencia da memoria(em megahertz):" + memoria.getFrequencia());
        }

        catch(FreqMemAcException fmae){
            fmae.impFreqMemAc();
        }
        

        catch(FreqMemAbException fmabe){
            fmabe.impFreqMemAb();
        }

        catch(TamAbException tae){
            tae.impTamAb();
        }

        catch(NumberFormatException nfe){
            System.out.println("\n O valor digitado deve ser um inteiro!");
        }
    }

}