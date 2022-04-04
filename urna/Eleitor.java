package urna;

public class Eleitor {
    private String nome;
    private int numerotitulo;
    private boolean statusvoto;
    
    public String getNome() {
        return nome;
    }
    public boolean isStatusvoto() {
        return statusvoto;
    }
    public void setStatusvoto(boolean statusvoto) {
        this.statusvoto = statusvoto;
    }
    public int getNumerotitulo() {
        return numerotitulo;
    }
    public void setNumerotitulo(int numerotitulo) {
        this.numerotitulo = numerotitulo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }




}
