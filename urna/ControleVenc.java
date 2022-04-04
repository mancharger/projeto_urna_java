package urna;

public class ControleVenc {
    
    private boolean empate = false;
    private int indicevencedor;
    
    public boolean isEmpate() {
        return empate;
    }
    public int getIndicevencedor() {
        return indicevencedor;
    }
    public void setIndicevencedor(int indicevencedor) {
        this.indicevencedor = indicevencedor;
    }
    public void setEmpate(boolean empate) {
        this.empate = empate;
    }


}
