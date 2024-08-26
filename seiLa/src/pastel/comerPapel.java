package pastel;

public class comerPapel {

    private String Massa;
    private String Recheio;
    private String Molho;

    public comerPapel(String massa, String recheio, String molho) {
        Massa = massa;
        Recheio = recheio;
        Molho = molho;

    }

    public String getMassa() {
        return Massa;
    }

    public void setMassa(String massa) {
        Massa = massa;
    }

    public String getRecheio() {
        return Recheio;
    }

    public void setRecheio(String recheio) {
        Recheio = recheio;
    }

    public String getMolho() {
        return Molho;
    }

    public void setMolho(String molho) {
        Molho = molho;
    }


}

