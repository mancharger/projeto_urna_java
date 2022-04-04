package urna;

public class Candidato {
    private String nome;
    private int numero;
    private String partido;
    private int numerovotos = 0;
    private boolean empate = false;
    
    public int getNumerovotos() {
        return numerovotos;
    }
    public boolean isEmpate() {
        return empate;
    }
    public void setEmpate(boolean empate) {
        this.empate = empate;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getPartido() {
        return partido;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public void setNumerovotos(int numerovotos) {
        this.numerovotos = numerovotos;
    }



}
